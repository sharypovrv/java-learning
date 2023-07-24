package oop.seminars.notebook.view;

import oop.seminars.notebook.controller.UserController;
import oop.seminars.notebook.model.User;
import oop.seminars.notebook.util.Commands;

import java.util.Arrays;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        String textCommand = "Введите команду из списка " + Arrays.toString(Commands.values()) + " : \n";
        Commands com;

        while (true) {

            String command = prompt(textCommand);

            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) {
                    userController.writeAllUsers();
                    return;
                }
                String firstName;
                String lastName;
                String phone;
                String id;

                switch (com) {
                    case CREATE:
                        firstName = prompt("Имя: ");
                        lastName = prompt("Фамилия: ");
                        phone = prompt("Номер телефона: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    case READ:
                        id = prompt("Идентификатор искомого пользователя: ");
                        try {
                            User user = userController.readUser(Long.parseLong(id));
                            System.out.println(user);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case LIST:
                        System.out.println(userController.readAllUsers());
                        break;
                    case UPDATE:
                        id = prompt("Идентификатор пользователя для обновления контакта: ");
                        firstName = prompt("Имя: ");
                        lastName = prompt("Фамилия: ");
                        phone = prompt("Номер телефона: ");
                        userController.updateUser(Long.parseLong(id), new User(firstName, lastName, phone));
                        break;
                    case DELETE:
                        id = prompt("Идентификатор пользователя для удаления контакта: ");
                        userController.deleteUser(Long.parseLong(id));
                        break;
                    case NONE:
                        System.out.println("Ничего не сделано.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Неправильная команда!");
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
