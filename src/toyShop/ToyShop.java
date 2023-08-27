package toyShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ToyShop {

    FileRepository fr = new FileRepository();

    private final Map<Toy, Integer> map = new HashMap<>();

    public ToyShop append(Toy toy) {
        return append(toy, 1);
    }

    public ToyShop append(Toy toy, int quantity) {
        if (map.containsKey(toy)) {
            map.put(toy, map.get(toy) + quantity);
        } else {
            map.put(toy, quantity);
        }
        return this;
    }

    public boolean removeToy(Toy toy) {
        return removeToy(toy, 1);
    }

    public boolean removeToy(Toy toy, int quantity) {
        if (map.containsKey(toy)) {
            if (quantity >= map.get(toy)) {
                map.remove(toy);
            } else {
                map.put(toy, map.get(toy) - quantity);
            }
            return true;
        } else {
            return false;
        }
    }

    public Toy play() {

        int tempProbability = 0;
        int random = new Random().nextInt(getTotalProbability());
        for (Map.Entry<Toy, Integer> item : map.entrySet()) {
            tempProbability += item.getValue() * item.getKey().getProbability();
            if (random <= tempProbability) {
                fr.add(item.getKey());
                removeToy(item.getKey());
                return item.getKey();
            }
        }
        return null;
    }

    private int getTotalProbability() {
        int totalProbability = 0;
        for (Map.Entry<Toy, Integer> item : map.entrySet()) {
            totalProbability += item.getValue() * item.getKey().getProbability();
        }
        return totalProbability;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Toy, Integer> item : map.entrySet()){
            String line = "{" + item.getKey().toString() + ", quantity=" + item.getValue() + "}\n";
            result.append(line);
        }

        return result.toString();
    }

}
