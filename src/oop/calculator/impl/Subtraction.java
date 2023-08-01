package oop.calculator.impl;

import oop.calculator.Operation;

public class Subtraction implements Operation {
    @Override
    public double getResult(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
