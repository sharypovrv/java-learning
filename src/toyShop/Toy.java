package toyShop;

public class Toy {

    private final int id;
    private final String name;
    private final int probability;

    public Toy(int id, String name, int dropRate) {
        this.id = id;
        this.name = name;
        this.probability = dropRate;
    }

    public int getProbability() {
        return probability;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
