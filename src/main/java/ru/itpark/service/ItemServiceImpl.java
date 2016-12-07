package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.model.Item;
import ru.itpark.repository.ItemRepository;

import java.util.Collections;
import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> fetchAll() {
        List<Item> all = itemRepository.getAll();
        Collections.sort(all);
        return all;
    }
}
