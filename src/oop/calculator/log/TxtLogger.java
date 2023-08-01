package oop.calculator.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtLogger implements Logger {
    private final File file;

    public TxtLogger(String fileName) {
        file = new File(fileName);
    }

    @Override
    public void log(String line) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(line);
            writer.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
