package ru.itpark.model;

import java.time.LocalDate;

/**
 * Created by Ramil on 30.11.2016.
 */
public class Page extends BaseEntity {
    private LocalDate created;

    public Page(long id, String name, String description, LocalDate created) {
        super(id, name, description);
        this.created = created;
    }

    public LocalDate getCreated() {
        return created;
    }
}
