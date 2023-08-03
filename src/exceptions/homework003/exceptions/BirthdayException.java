package exceptions.homework003.exceptions;

public class BirthdayException extends IllegalArgumentException {
    public BirthdayException() {
        super("Неправильно введена дата рождения!");
    }

}
