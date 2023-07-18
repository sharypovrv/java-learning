package oop.seminars.seminar004.fileRepository;

/**
 Абстракция человека
 */
public class Human{
    private String name;
    private String fullName;

    public Human(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
