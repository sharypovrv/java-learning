package oop.seminars.interfaces.core;

import oop.seminars.interfaces.core.clients.*;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private static List<Animal> animals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public boolean entered(Animal animal) {
        if (animals.contains(animal)) {
            System.out.println(animal + " уже в клинике.");
            return false;
        }
        animals.add(animal);
        System.out.println(animal + " поступил в клинику.");
        return true;
    }

    public List<Animal> getRunnableAnimals() {
        List<Animal> runnableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof RunnableAnimal) {
                runnableAnimals.add(animal);
            }
        }
        return runnableAnimals;
    }

    public List<Animal> getSwimableAnimals() {
        List<Animal> swimableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                swimableAnimals.add(animal);
            }
        }
        return swimableAnimals;
    }

    public List<Animal> getFlyableAnimals() {
        List<Animal> flyableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                flyableAnimals.add(animal);
            }
        }
        return flyableAnimals;
    }

    public List<Animal> getSoundableAnimals() {
        List<Animal> soubableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Soundable) {
                soubableAnimals.add(animal);
            }
        }
        return soubableAnimals;
    }
}
