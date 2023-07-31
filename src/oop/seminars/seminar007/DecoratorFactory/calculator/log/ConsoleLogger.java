package oop.seminars.seminar007.decoratorFactory.calculator.log;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String line) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(), line);
    }
}
