package oop.seminars.seminar007.builder.item.impl;

import oop.seminars.seminar007.builder.item.Characteristic;
import oop.seminars.seminar007.builder.item.Item;

public class Bike implements Item {
    private final Characteristic characteristic;

    public Bike(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
