package exceptions.homework003;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public void createFile(String[] lines) {
        File file = new File("src/exceptions/homework003/data/" + lines[0] + ".txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < lines.length - 1; i++) {
                writer.write(lines[i]);
                writer.write(", ");
            }
            writer.write(lines[lines.length - 1]);
            writer.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
