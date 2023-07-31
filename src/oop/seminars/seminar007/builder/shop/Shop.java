package oop.seminars.seminar007.builder.shop;



import oop.seminars.seminar007.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final String name;
    private final List<Item> items;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public Shop addItem(Item item) {
        this.items.add(item);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }
}
