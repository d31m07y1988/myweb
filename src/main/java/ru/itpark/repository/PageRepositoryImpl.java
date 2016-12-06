package ru.itpark.repository;

import ru.itpark.model.Page;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ramil on 06.12.2016.
 */

public class PageRepositoryImpl implements PageRepository {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Page get(long id) {
        String sql = "SELECT * FROM page WHERE id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conn = dataSource.getConnection()) {
            ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            Page page = null;
            rs = ps.executeQuery();
            if (rs.next()) {
                page = new Page(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDate("created").toLocalDate()
                );
            }
            return page;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(rs!=null)rs.close();
                if(ps!=null)ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
