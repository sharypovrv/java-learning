package oop.seminars.seminar004.fileRepository;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileRepository<E> {

    private String path;
    File file;

    public FileRepository(int id, E e) {
        String fileName = e.getClass().getSimpleName();
        path = "src/oop/seminars/seminar004/fileRepository/" + fileName + ".txt";
        file = new File(path);
        add(id, e);
    }

    private Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                int key = Integer.parseInt(line.split(" : ")[0]);
                String value = line.split(" : ")[1];
                map.put(key, value);
                line = reader.readLine();
            }
            reader.close();
            return map;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeMap(Map<Integer, String> map) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (Integer key : map.keySet()) {
                fileWriter.write(key + " : " + map.get(key) + "\n");
            }
            fileWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean add(int id, E e) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(id + " : " + e + "\n");
            fileWriter.close();
            return true;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void remove(int id) {
        Map<Integer, String> tempMap = getMap();
        tempMap.remove(id);
        writeMap(tempMap);
    }

    public void update(int id, E e) {
        Map<Integer, String> tempMap = getMap();
        tempMap.put(id, e.toString());
        writeMap(tempMap);
    }

    public String getElement(int id) {
        return getMap().get(id);
    }

    public String toStringAll() {
        return getMap().toString();
    }

}
