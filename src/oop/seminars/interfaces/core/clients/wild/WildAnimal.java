package oop.seminars.interfaces.core.clients.wild;

import oop.seminars.interfaces.core.clients.Animal;
import oop.seminars.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Абстракция дикого животного
 */
public abstract class WildAnimal extends Animal{
    public WildAnimal() {
    }

    private WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
