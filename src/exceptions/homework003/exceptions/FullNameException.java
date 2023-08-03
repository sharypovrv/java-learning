package exceptions.homework003.exceptions;

public class FullNameException extends IllegalArgumentException {
    public FullNameException() {
        super("Неправильно введены фамилия, имя и отчество!");
    }
}
