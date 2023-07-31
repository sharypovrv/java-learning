package oop.seminars.seminar007.decoratorFactory.calculator;

import oop.seminars.seminar007.decoratorFactory.calculator.log.ConsoleLogger;

public class CalculatorFactoryWithLogger implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
        return new CalculateDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
}
