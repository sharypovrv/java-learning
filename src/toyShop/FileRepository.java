package toyShop;

import java.io.FileWriter;
import java.io.IOException;

public class FileRepository {
    private final String fileName = "src/toyShop/db.txt";

    public FileRepository() {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Toy toy) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(toy.toString() + '\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
