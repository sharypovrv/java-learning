package toyShop;

public class Main {
    public static void main(String[] args) {

        ToyShop toyShop = new ToyShop();

        Toy toyRobot = new Toy(1, "Robot", 20);
        Toy toyBear = new Toy(2, "Bear", 60);
        Toy toyDoll = new Toy(3, "Doll", 20);
        Toy toyAirplane = new Toy(4, "Airplane", 100);

        toyShop
                .append(toyRobot, 5)
                .append(toyBear, 5)
                .append(toyDoll, 5)
                .append(toyAirplane, 5);

        System.out.println(toyShop);

        for (int i = 0; i < 10; i++) {
            System.out.println("Prize toy: " + toyShop.play());
        }

        System.out.println();
        System.out.println(toyShop);

    }
}
