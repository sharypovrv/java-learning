package oop.seminars.interfaces.core.clients.wild.impl;


import oop.seminars.interfaces.core.clients.RunnableAnimal;
import oop.seminars.interfaces.core.clients.Soundable;
import oop.seminars.interfaces.core.clients.owners.Owner;
import oop.seminars.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class Lion extends WildAnimal implements RunnableAnimal, Soundable {
    public Lion() {
    }

    public Lion(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        int speedRun = 20;
        System.out.printf("%s бегает со скоростью %dкм/ч.\n", CLASS_NAME, speedRun);
        return speedRun;
    }

    @Override
    public String sound() {
        String sound = "Ррррр";
        System.out.printf("%s говорит \"%s\".\n", CLASS_NAME, sound);
        return sound;
    }
}
