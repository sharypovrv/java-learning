package oop.seminars.seminar002.interfaces.core.clients.home.impl;

import oop.seminars.seminar002.interfaces.core.clients.RunnableAnimal;
import oop.seminars.seminar002.interfaces.core.clients.Soundable;
import oop.seminars.seminar002.interfaces.core.clients.Swimable;
import oop.seminars.seminar002.interfaces.core.clients.home.Pet;
import oop.seminars.seminar002.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements RunnableAnimal, Swimable, Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        int speedRun = 15;
        System.out.printf("%s бегает со скоростью %dкм/ч.\n", CLASS_NAME, speedRun);
        return speedRun;
    }

    @Override
    public String sound() {
        String sound = "Гав";
        System.out.printf("%s говорит \"%s\".\n", CLASS_NAME, sound);
        return sound;
    }

    @Override
    public int swim() {
        int speedSwim = 2;
        System.out.printf("%s плавает со скоростью %dкм/ч.\n", CLASS_NAME, speedSwim);
        return speedSwim;
    }
}
