package oop.seminars.seminar002.interfaces.core.clients.wild.impl;

import oop.seminars.seminar002.interfaces.core.clients.Flyable;
import oop.seminars.seminar002.interfaces.core.clients.RunnableAnimal;
import oop.seminars.seminar002.interfaces.core.clients.Soundable;
import oop.seminars.seminar002.interfaces.core.clients.Swimable;
import oop.seminars.seminar002.interfaces.core.clients.owners.Owner;
import oop.seminars.seminar002.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Flyable, RunnableAnimal, Swimable, Soundable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        int speedFly = 7;
        System.out.printf("%s летит со скоростью %dкм/ч.\n", CLASS_NAME, speedFly);
        return speedFly;
    }

    @Override
    public int run() {
        int speedRun = 10;
        System.out.printf("%s бегает со скоростью %dкм/ч.\n", CLASS_NAME, speedRun);
        return speedRun;
    }

    @Override
    public int swim() {
        int speedSwim = 1;
        System.out.printf("%s плавает со скоростью %dкм/ч.\n", CLASS_NAME, speedSwim);
        return speedSwim;
    }

    @Override
    public String sound() {
        String sound = "Кря";
        System.out.printf("%s говорит \"%s\".\n", CLASS_NAME, sound);
        return sound;
    }
}
