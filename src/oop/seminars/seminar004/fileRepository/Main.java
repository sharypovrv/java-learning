package oop.seminars.seminar004.fileRepository;

public class Main {
    public static void main(String[] args) {

        FileRepository<Animal> fr = new FileRepository<>(1, new Animal("Cat"));
        FileRepository<Human> fr2 = new FileRepository<>(1, new Human("Ivan", "Ivanov"));

        fr.add(2, new Animal("Dog"));
        fr.add(3, new Animal("Cow"));
        fr.add(4, new Animal("Pig"));
        System.out.println(fr.toStringAll());

        System.out.println(fr.getElement(1));
        System.out.println(fr.getElement(3));

        fr.remove(3);
        System.out.println(fr.toStringAll());

        fr.update(1, new Animal("Rat"));
        System.out.println(fr.toStringAll());

    }
}
