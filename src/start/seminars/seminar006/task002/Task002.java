package start.seminars.seminar006.task002;

/*
Реализовать класс Lion для вет. клиники
Добавить в него поля:
Имя, возраст, Привит ли кот (boolean), дефолт - false, пол
Добавить методы:
Кот Имя мяукнул n раз
Прививка кота, если был привит - сообщить об этом
Так же придумать 1-2 своих метода
*/
public class Task002 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Tom";
        cat1.age = 2;
        cat1.sex = "male";
        cat1.meow(5);

        System.out.println(cat1.isVaccinated);
        cat1.vaccinate();
        System.out.println(cat1.isVaccinated);
        cat1.vaccinate();
        System.out.println(cat1.isVaccinated);
    }
}
