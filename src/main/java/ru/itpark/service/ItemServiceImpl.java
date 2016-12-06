package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.model.Item;
import ru.itpark.repository.ItemRepository;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> fetchAll() {
        return itemRepository.getAll();
    }
}
