package ru.itpark.model;


/**
 * Created by Ramil on 30.11.2016.
 */
public class Item extends BaseEntity implements Comparable {
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

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (getId() != item.getId()) return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Item item = (Item) o;
        return this.getName().compareTo(item.getName());
    }
}
