package oop.homeworks.homework001;

public class Monkey extends Animal {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void toGo() {
        super.toGo();
    }

    @Override
    public void fly() {
        System.out.println("Monkeys can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("Monkeys can't swim!");
    }
}
