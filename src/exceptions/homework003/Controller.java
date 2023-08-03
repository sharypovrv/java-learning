package exceptions.homework003;

import exceptions.homework003.exceptions.BirthdayException;
import exceptions.homework003.exceptions.FullNameException;
import exceptions.homework003.exceptions.PhoneNumberException;
import exceptions.homework003.exceptions.SexException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    public void createFile(String line) {

        String[] lines = parseLine(line);
        if (lines[3] == null) throw new BirthdayException();
        if (lines[4] == null) throw new PhoneNumberException();
        if (lines[5] == null) throw new SexException();
        if (lines[0] == null) throw new FullNameException();

        FileCreator fileCreator = new FileCreator();
        fileCreator.createFile(lines);

    }

    private String[] parseLine(String line) {
        int argCount = 6;
        String[] lines = line.split("\\s");
        String[] result = new String[argCount];

        for (String item : lines) {
            if (result[3] == null && isDate(item)) {
                result[3] = item;
            } else if (result[4] == null && isPhoneNumber(item)) {
                result[4] = item;
            } else if (result[5] == null && isSex(item)) {
                result[5] = item;
            }
        }

        for (int i = 0; i < lines.length - 2; i++) {
            boolean isTrue = result[0] == null && result[1] == null && result[2] == null &&
                    isString(lines[i]) && isString(lines[i + 1]) && isString(lines[i + 2]);
            if (isTrue) {
                result[0] = lines[i];
                result[1] = lines[i + 1];
                result[2] = lines[i + 2];

            }
        }

        return result;
    }

    private boolean isPhoneNumber(String s) {
        return s.matches("\\d+");
    }

    private boolean isDate(String s) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            format.setLenient(false);
            Date date = format.parse(s);
            return true;
        } catch (Exception ignored) { }
        return false;
    }

    private boolean isSex(String s) {
        return s.equals("f") || s.equals("m");
    }

    private boolean isString(String s) {
        return s.matches("^[a-zA-Zа-яА-Я]*$") && !s.equals("f") && !s.equals("m");
    }

}
