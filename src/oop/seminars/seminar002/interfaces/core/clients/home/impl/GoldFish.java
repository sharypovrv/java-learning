package oop.seminars.seminar002.interfaces.core.clients.home.impl;

import oop.seminars.seminar002.interfaces.core.clients.Swimable;
import oop.seminars.seminar002.interfaces.core.clients.home.Pet;

public class GoldFish extends Pet implements Swimable {
    public GoldFish() {
    }

    @Override
    public int swim() {
        int speedSwim = 1;
        System.out.printf("%s плавает со скоростью %dкм/ч.\n", CLASS_NAME, speedSwim);
        return speedSwim;
    }
}
