package oop.seminars.seminar007.DecoratorFactory.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}
