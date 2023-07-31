package oop.seminars.seminar007.builder;

import oop.seminars.seminar007.builder.item.Characteristic;
import oop.seminars.seminar007.builder.item.Item;
import oop.seminars.seminar007.builder.item.impl.Laptop;
import oop.seminars.seminar007.builder.shop.Shop;

public class Main {
    public static void main(String[] args) {
        Characteristic ch1 = Characteristic.builder()
                .brand("Mac")
                .color("Black")
                .build();

        Item laptop = new Laptop(ch1);

        Shop shop = new Shop("Iport");
        shop.addItem(laptop);
    }
}
