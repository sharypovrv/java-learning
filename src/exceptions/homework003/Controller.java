package exceptions.homework003;

public class Controller {

    String line;

    public Controller() {
    }


    private int checkLength(String line, int length) {
        return Integer.compare(line.split(" ").length, length);
    }

    private boolean parseCode(int code) {
        switch (code) {
            case -1 -> {
                System.out.println("Введено мало данных.");
                return false;
            }
            case 1 -> {
                System.out.println("Введено много данных.");
                return false;
            }
        }
        return true;
    }
}
