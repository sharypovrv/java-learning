package exceptions.homework003.exceptions;

public class PhoneNumberException extends IllegalArgumentException{
    public PhoneNumberException() {
        super("Неправильно введен номер телефона!");
    }
}
