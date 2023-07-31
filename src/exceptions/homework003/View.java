package exceptions.homework003;

import java.util.Scanner;

public class View {

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        String textCommand = "Введите данные через пробел \"фамилия, имя, отчество, дата рождения, номер телефона, пол\": ";
        while(true) {
            String line = prompt(textCommand);



        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
