package oop.seminars.seminar002.interfaces.core.clients.home;


import oop.seminars.seminar002.interfaces.core.clients.Animal;
import oop.seminars.seminar002.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public abstract class Pet extends Animal{
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
