package ru.itpark.repository;

import ru.itpark.model.Page;

/**
 * Created by Ramil on 06.12.2016.
 */
public interface PageRepository {

    Page get(long id);
}
