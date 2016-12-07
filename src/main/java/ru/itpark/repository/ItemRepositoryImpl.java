package ru.itpark.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.model.Item;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Ramil on 06.12.2016.
 */
@Repository("itemRepository")
public class ItemRepositoryImpl implements ItemRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Item> getAll() {
        return jdbcTemplate.query("SELECT * FROM item", (resultSet, i) -> {
            Item item = new Item(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("description"),
                    resultSet.getLong("price"),
                    resultSet.getString("picturelink"),
                    resultSet.getInt("count"));
            return item;
        });
    }
}
