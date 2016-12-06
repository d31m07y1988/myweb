package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.model.Page;
import ru.itpark.repository.PageRepository;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageRepository pageRepository;

    @Override
    public Page get(long id) {
        return pageRepository.get(id);
    }
}
