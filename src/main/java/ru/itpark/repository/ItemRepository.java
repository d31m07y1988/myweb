package ru.itpark.repository;

import ru.itpark.model.Item;

import java.util.List;

/**
 * Created by Ramil on 06.12.2016.
 */
public interface ItemRepository {
    List<Item> getAll();
}
