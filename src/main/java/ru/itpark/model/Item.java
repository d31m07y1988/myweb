package ru.itpark.model;


/**
 * Created by Ramil on 30.11.2016.
 */
public class Item extends BaseEntity {
    private long price;
    private String pictureLink;
    private int count;

    public Item(long id, String name, String description, long price, String pictureLink, int count) {
        super(id, name, description);
        this.price = price;
        this.pictureLink = pictureLink;
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public int getCount() {
        return count;
    }
}
