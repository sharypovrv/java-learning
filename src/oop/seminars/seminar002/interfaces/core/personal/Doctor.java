package oop.seminars.seminar002.interfaces.core.personal;

import oop.seminars.seminar002.interfaces.core.clients.Animal;
import oop.seminars.seminar002.interfaces.core.clients.Human;

public class Doctor extends Veterinarian {

    public Doctor(String fullName) {
        super(fullName);
    }

    public int doSurgery(Animal animal) {
        int duration = 2;
        System.out.printf("%s %s делал операцию клиенту %s в течении %d часов.",
                CLASS_NAME, this.getFullName(), animal, duration);
        return duration;
    }

}
