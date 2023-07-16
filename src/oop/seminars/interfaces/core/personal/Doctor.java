package oop.seminars.interfaces.core.personal;

import oop.seminars.interfaces.core.clients.Animal;

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
