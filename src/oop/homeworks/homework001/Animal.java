package oop.homeworks.homework001;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void toGo() {
        System.out.printf("%s is going...\n", name);
    }

    public void fly() {
        System.out.printf("%s is flying...\n", name);
    }

    public void swim() {
        System.out.printf("%s is swimming...\n", name);
    }
}
