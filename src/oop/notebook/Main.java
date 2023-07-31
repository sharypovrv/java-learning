package oop.notebook;

import oop.notebook.controller.UserController;
import oop.notebook.model.User;
import oop.notebook.repository.GBRepository;
import oop.notebook.repository.impl.UserRepository;
import oop.notebook.view.UserView;

import static oop.notebook.util.DBConnector.DB_PATH;
import static oop.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository<User, Long> repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
