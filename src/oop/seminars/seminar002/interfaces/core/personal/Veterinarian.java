package oop.seminars.seminar002.interfaces.core.personal;

import oop.seminars.seminar002.interfaces.core.clients.Animal;
import oop.seminars.seminar002.interfaces.core.clients.Human;

public class Veterinarian extends Human {

    protected final String CLASS_NAME = getClass().getSimpleName();

    public Veterinarian(String fullName) {
        super(fullName);
    }

    public boolean inject(Animal animal) {
        System.out.printf("%s %s поставил укол пациенту %s.\n", CLASS_NAME, this.getFullName(), animal);
        return true;
    }
}
