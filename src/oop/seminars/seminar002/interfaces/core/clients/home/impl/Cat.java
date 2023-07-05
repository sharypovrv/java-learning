package oop.seminars.seminar002.interfaces.core.clients.home.impl;

import oop.seminars.seminar002.interfaces.core.clients.RunnableAnimal;
import oop.seminars.seminar002.interfaces.core.clients.Soundable;
import oop.seminars.seminar002.interfaces.core.clients.home.Pet;
import oop.seminars.seminar002.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements RunnableAnimal, Soundable {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        int speedRun = 8;
        System.out.printf("%s бегает со скоростью %dкм/ч.\n", CLASS_NAME, speedRun);
        return speedRun;
    }

    @Override
    public String sound() {
        String sound = "Мяу";
        System.out.printf("%s говорит \"%s\".\n", CLASS_NAME, sound);
        return sound;
    }
}
