package oop.seminars.interfaces;

import oop.seminars.interfaces.core.VetClinic;
import oop.seminars.interfaces.core.clients.home.impl.Cat;
import oop.seminars.interfaces.core.clients.home.impl.Dog;
import oop.seminars.interfaces.core.clients.home.impl.GoldFish;
import oop.seminars.interfaces.core.clients.wild.impl.Duck;
import oop.seminars.interfaces.core.clients.wild.impl.Eagle;
import oop.seminars.interfaces.core.clients.wild.impl.Lion;
import oop.seminars.interfaces.core.clients.wild.impl.Shark;
import oop.seminars.interfaces.core.personal.Doctor;
import oop.seminars.interfaces.core.personal.Nurse;

import java.time.LocalDate;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {

        VetClinic vetClinic = new VetClinic();
        vetClinic.entered(new Duck());
        vetClinic.entered(new Dog());
        vetClinic.entered(new Lion());
        vetClinic.entered(new GoldFish());
        vetClinic.entered(new Eagle());
        vetClinic.entered(new Shark());
        Cat cat1 = new Cat(1, "Barsik", 4, LocalDate.now(), null);
        Cat cat2 = new Cat(2, "Tom", 4, LocalDate.now(), null);
        vetClinic.entered(cat1);
        vetClinic.entered(cat1);
        vetClinic.entered(cat2);

        System.out.println("-------------------");
        System.out.println("Список всех бегающих животных в клинике:");
        System.out.println(vetClinic.getRunnableAnimals());
        System.out.println("-------------------");
        System.out.println("Список всех плавающих животных в клинике:");
        System.out.println(vetClinic.getSwimableAnimals());
        System.out.println("-------------------");
        System.out.println("Список всех летающих животных в клинике:");
        System.out.println(vetClinic.getFlyableAnimals());
        System.out.println("-------------------");
        System.out.println("Список всех говорящих животных в клинике:");
        System.out.println(vetClinic.getSoundableAnimals());
        System.out.println("-------------------");

        Nurse nurse = new Nurse("Иванова");
        Doctor doctor = new Doctor("Айболит");
        nurse.inject(cat1);
        doctor.inject(cat2);
        doctor.doSurgery(cat2);

//        for (Animal animal : vetClinic.getAnimals()) {
//            System.out.println("----------------------");
//            if (animal instanceof RunnableAnimal) {
//                ((RunnableAnimal) animal).run();
//            }
//            if (animal instanceof Swimable) {
//                ((Swimable) animal).swim();
//            }
//            if (animal instanceof Flyable) {
//                ((Flyable) animal).fly();
//            }
//            if (animal instanceof Soundable) {
//                ((Soundable) animal).sound();
//            }
//        }

    }
}
