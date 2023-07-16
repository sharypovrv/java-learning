package oop.seminars.interfaces.core.clients;

/**
 Абстракция человека
 */
public abstract class Human{ // todo на семинаре, в учебных целях, сделать extends Animal
    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
