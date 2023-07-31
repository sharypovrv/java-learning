package oop.seminars.seminar007.decoratorFactory.calculator;

import oop.seminars.seminar007.decoratorFactory.calculator.log.Logger;

public class CalculateDecorator implements Calculable{

    private Calculable calculator;
    private Logger logger;

    public CalculateDecorator(Calculable calculable, Logger logger) {
        this.calculator = calculable;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Sum %s with %s", arg, calculator.getResult()));
        Calculable result = calculator.sum(arg);
        logger.log(String.format("Result: %d", result.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Multi %s with %s", arg, calculator.getResult()));
        Calculable result = calculator.multi(arg);
        logger.log(String.format("Result: %d", result.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
