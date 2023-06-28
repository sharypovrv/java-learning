package oop.homeworks.homework001;

public class Human extends Animal {

    public Human(String name) {
        super(name);
    }

    @Override
    public void toGo() {
        super.toGo();
    }

    @Override
    public void fly() {
        System.out.println("Humans can't fly!");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
