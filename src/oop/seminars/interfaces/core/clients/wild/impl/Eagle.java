package oop.seminars.interfaces.core.clients.wild.impl;

import oop.seminars.interfaces.core.clients.Flyable;
import oop.seminars.interfaces.core.clients.Soundable;
import oop.seminars.interfaces.core.clients.wild.WildAnimal;

public class Eagle extends WildAnimal implements Flyable, Soundable {
    public Eagle() {
    }

    @Override
    public int fly() {
        int speedFly = 50;
        System.out.printf("%s летит со скоростью %dкм/ч.\n", CLASS_NAME, speedFly);
        return speedFly;
    }

    @Override
    public String sound() {
        String sound = "Ииииии";
        System.out.printf("%s говорит \"%s\".\n", CLASS_NAME, sound);
        return sound;
    }
}
