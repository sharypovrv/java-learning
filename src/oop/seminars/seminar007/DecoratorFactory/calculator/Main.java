package oop.seminars.seminar007.decoratorFactory.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
//        ICalculableFactory calculableFactory = new CalculableFactory();
//        ViewCalculator view = new ViewCalculator(calculableFactory);
//        view.run();
        ICalculableFactory calculableFactoryWithLogger = new CalculatorFactoryWithLogger();
        ViewCalculator view = new ViewCalculator(calculableFactoryWithLogger);
        view.run();
    }
}
