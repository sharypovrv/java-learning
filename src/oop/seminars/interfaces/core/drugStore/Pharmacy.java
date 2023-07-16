package oop.seminars.interfaces.core.drugStore;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private String id;
    private List<Component> components;
    private int componentsCount;

    public Pharmacy() {
        this.id = "";
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }

    public String getId() {
        return id;
    }

    private int getPower (Pharmacy pharmacy) {
        int result = 0;
        for (Component elem: pharmacy.getComponents()) {
            result += elem.getPower();
        }
        return result;
    }

    public Pharmacy addComponent (Component component) {
        this.id += component.toString();
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", componentsCount=" + componentsCount +
                '}'+" Total power = "+getPower(this)+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
        componentsCount = 0;
        return new Iterator<Component>() { //Анонимный класс
            public Component next() {
                return components.get(componentsCount++);
            }

            public boolean hasNext() {
                return componentsCount < components.size();
            }
        };
//        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        if (pow1 == pow2) {
            StringBuilder sb = new StringBuilder();
            for (Component component : this) {
                sb.append(component.getName());
            }
            String line1 = sb.toString();
            sb.setLength(0);
            for (Component component : o) {
                sb.append(component.getName());
            }
            String line2 = sb.toString();
            return line1.compareTo(line2);
        }
        return Integer.compare(pow1, pow2);
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pharmacy that = (Pharmacy) obj;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = this.id.hashCode() + componentsCount;
        return result;
    }
}
