package ru.itpark.service;

import ru.itpark.model.Item;

import java.util.List;

/**
 * Created by Ramil on 06.12.2016.
 */
public interface ItemService {
    List<Item> fetchAll();
}
