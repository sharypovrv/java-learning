package oop.seminars.interfaces.core.drugStore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy()
                .addComponent(new Component("Penicillin", "10 mg", 10))
                .addComponent(new Component("Spirit", "100 g", 1000));

        Pharmacy pharmacy2 = new Pharmacy()
                .addComponent(new Component("Iodine", "10 mg", 1))
                .addComponent(new Component("Spirit", "100 g", 1009));

        Pharmacy pharmacy3 = new Pharmacy()
                .addComponent(new Component("Penicillin", "10 mg", 3))
                .addComponent(new Component("Spirit", "100 g", 13));

        Pharmacy pharmacy4 = new Pharmacy()
                .addComponent(new Component("Analgin", "10 mg", 910))
                .addComponent(new Component("Spirit", "100 g", 100));

        Pharmacy pharmacy5 = new Pharmacy()
                .addComponent(new Component("Penicillin", "10 mg", 3))
                .addComponent(new Component("Spirit", "100 g", 13));

        Pharmacy pharmacy6 = new Pharmacy()
                .addComponent(new Component("Analgin", "10 mg", 910))
                .addComponent(new Component("Spirit", "100 g", 100));

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy4);
        nomenclature.add(pharmacy5);
        nomenclature.add(pharmacy6);

//        System.out.println(nomenclature);
//        Collections.sort(nomenclature);
//        System.out.println("============================================================================");
//        System.out.println(nomenclature);

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);
        result.add(pharmacy6);

        for (Pharmacy item : result) {
            System.out.println(item.getId());
        }

        System.out.println(pharmacy3.equals(pharmacy5));
        System.out.println(pharmacy4.equals(pharmacy6));
        System.out.println("====================");
        System.out.println(result);
    }
}
