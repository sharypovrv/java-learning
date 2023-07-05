package oop.seminars.seminar002.interfaces.core.clients.wild.impl;

import oop.seminars.seminar002.interfaces.core.clients.Swimable;
import oop.seminars.seminar002.interfaces.core.clients.owners.Owner;
import oop.seminars.seminar002.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Shark extends WildAnimal implements Swimable {
    public Shark(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    public Shark() {
    }

    @Override
    public int swim() {
        int speedSwim = 60;
        System.out.printf("%s плавает со скоростью %dкм/ч.\n", this, speedSwim);
        return speedSwim;
    }
}
