package start.seminars.seminar006.task002;

public class Cat {
    String name;
    String sex;
    int age;
    boolean isVaccinated = false;

    public void meow(int n) {
        System.out.printf("Кот %s мяукнул %d раз.\n", name, n);
    }

    public void vaccinate() {
        if (isVaccinated) {
            System.out.println("Кот уже вакцинирован.");
        } else {
            isVaccinated = true;
        }
    }


}
