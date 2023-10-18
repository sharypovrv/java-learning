package oop.calculator;

import java.util.Scanner;

public class View {

    private boolean isRunning = true;
    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {

        while(isRunning) {
            try {
                System.out.println("Let's go!!!");

                double firstNumber = doubleFromString("Enter first number: ");
                String operation = operationFromString();
                double secondNumber = doubleFromString("Enter second number: ");

                double result = controller.calculate(firstNumber, secondNumber, operation);
                System.out.println("Result: " + result);
                if (prompt("To cancel enter Q: ").equalsIgnoreCase("q")) isRunning = false;

            } catch (IllegalArgumentException e) {
                System.out.println("Error!");
            }
        }
    }

    private double doubleFromString(String message) {
        double number = 0;
        boolean isDouble = false;
        while(!isDouble) {
            try {
                number = Double.parseDouble(prompt(message));
                isDouble = true;
            } catch (IllegalArgumentException e) {
                System.out.print("Enter number! ");
            }
        }
        return number;
    }

    private String operationFromString() {
        String operation = "";
        boolean isOperation = false;
        while(!isOperation) {
            try {
                operation = prompt("Enter operation [+, -, *, /]: ");
                if (operation.length() != 1 || !operation.matches("[+*-/]")) {
                    throw new IllegalArgumentException();
                }
                isOperation = true;
            } catch (IllegalArgumentException ignored) {

            }
        }
        return operation;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
