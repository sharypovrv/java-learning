package oop.homeworks.homework001;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal#1");
        animal.toGo();
        animal.fly();
        animal.swim();
        System.out.println();

        Human human = new Human("human#1");
        human.toGo();
        human.fly();
        human.swim();
        System.out.println();

        Monkey monkey = new Monkey("monkey#1");
        monkey.toGo();
        monkey.fly();
        monkey.swim();
        System.out.println();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("animal#2"));
        animals.add(new Human("human#2"));
        animals.add(new Monkey("monkey#2"));
        for (Animal item : animals) {
            item.toGo();
            item.fly();
            item.swim();
            System.out.println();
        }
    }
}
