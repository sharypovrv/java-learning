package oop.seminars.notebook;

import oop.seminars.notebook.controller.UserController;
import oop.seminars.notebook.model.User;
import oop.seminars.notebook.repository.GBRepository;
import oop.seminars.notebook.repository.impl.UserRepository;
import oop.seminars.notebook.view.UserView;

import static oop.seminars.notebook.util.DBConnector.DB_PATH;
import static oop.seminars.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository<User, Long> repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
