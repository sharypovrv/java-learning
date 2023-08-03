package exceptions.homework003;

import exceptions.homework003.exceptions.BirthdayException;
import exceptions.homework003.exceptions.FullNameException;
import exceptions.homework003.exceptions.PhoneNumberException;
import exceptions.homework003.exceptions.SexException;

import java.util.Scanner;

public class View {
    String textCommand = """
                        
                        =====================================================================
                        Введите данные в произвольном порядке через пробел
                        "фамилия, имя, отчество, дата рождения, номер телефона, пол":
                        фамилия, имя, отчество - строки
                        дата рождения - строка формата dd.mm.yyyy
                        номер телефона - целое беззнаковое число без форматирования
                        пол - символ латиницей f или m
                        Ввод:\s""";

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        boolean isWorking = true;
        while (isWorking) {
            try {
                String line = prompt(textCommand);
                if (checkInputString(line)) {
                    controller.createFile(line);
                    isWorking = false;
                }
            } catch (BirthdayException | SexException | PhoneNumberException | FullNameException e) {
                e.printStackTrace();
            }
        }


    }

    // метод, обрабатывающий код ошибки и возвращающий сообщение
    private boolean checkInputString(String line) {
        int argCount = 6;

        switch (checkArgCount(line, argCount)) {
            case -1 -> {
                System.out.println("!!! Ошибка !!! Введено мало данных!");
                return false;
            }
            case 1 -> {
                System.out.println("!!! Ошибка !!! Введено много данных!");
                return false;
            }
        }
        return true;
    }

    // метод, возвращающий код ошибки, если количество данных не совпадает
    private int checkArgCount(String line, int length) {
        return Integer.compare(line.split("\\s").length, length);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
