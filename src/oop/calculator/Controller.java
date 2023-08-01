package oop.calculator;

import oop.calculator.impl.Division;
import oop.calculator.impl.Multiplication;
import oop.calculator.impl.Subtraction;
import oop.calculator.impl.Summation;
import oop.calculator.log.TxtLogger;

public class Controller {

    TxtLogger txtLogger = new TxtLogger("src/oop/calculator/log.txt");

    public double calculate(double firstNumber, double secondNumber, String operation) {
        double result = switch (operation) {
            case "+" -> new Summation().getResult(firstNumber, secondNumber);
            case "-" -> new Subtraction().getResult(firstNumber, secondNumber);
            case "*" -> new Multiplication().getResult(firstNumber, secondNumber);
            case "/" -> new Division().getResult(firstNumber, secondNumber);
            default -> 0;
        };
        txtLogger.log(String.format("Operation: %s %s %s = %s", firstNumber, operation, secondNumber, result));
        return result;

    }
}
