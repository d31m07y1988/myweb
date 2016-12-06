package ru.itpark.model;

/**
 * Created by Ramil on 30.11.2016.
 */

public abstract class BaseEntity {
    private long id;
    private String name;
    private String description;

    public BaseEntity(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
