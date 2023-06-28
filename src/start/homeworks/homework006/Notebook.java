package start.homeworks.homework006;

public class Notebook {
    private int id;
    private int ram;
    private int diskStorageCapacity;
    private String operationSystem;
    private String color;

    public Notebook(int id, int ram, int diskStorageCapacity, String operationSystem, String color) {
        this.id = id;
        this.ram = ram;
        this.diskStorageCapacity = diskStorageCapacity;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getDiskStorageCapacity() {
        return diskStorageCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", id, ram, diskStorageCapacity, operationSystem, color);
    }
}
