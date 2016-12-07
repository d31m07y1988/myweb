package ru.itpark.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.model.Page;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Ramil on 06.12.2016.
 */
@Repository("pageRepository")
public class PageRepositoryImpl implements PageRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Page get(long id) {
        List<Page> pages = jdbcTemplate.query("SELECT * FROM page WHERE id = ?", (resultSet, i) -> {
            Page page = new Page(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("description"),
                    resultSet.getDate("created").toLocalDate());
            return page;
        }, id);

        return DataAccessUtils.singleResult(pages);
    }
}
