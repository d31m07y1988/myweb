package ru.itpark.repository;

import ru.itpark.model.Item;
import ru.itpark.model.Page;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramil on 06.12.2016.
 */
public class ItemRepositoryImpl implements ItemRepository {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Item> getAll() {
        String sql = "SELECT * FROM item";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conn = dataSource.getConnection()) {
            ps = conn.prepareStatement(sql);
            List<Item> items= new ArrayList<>();
            rs = ps.executeQuery();
            while (rs.next()) {
                items.add(new Item(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getLong("price"),
                        rs.getString("picturelink"),
                        rs.getInt("count")));
            }
            return items;
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
