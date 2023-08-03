package exceptions.homework003.exceptions;

public class SexException extends IllegalArgumentException {
    public SexException() {
        super("Неправильно введен пол!");
    }
}
