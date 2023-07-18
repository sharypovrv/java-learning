package oop.seminars.seminar004.myList;

public class Main {
    public static void main(String[] args) {

        GBList<String> list = new GBArrayList<>();
        list.add("123");
        list.join("222").join("333");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
        list.update(0, "666");
        System.out.println(list);

        System.out.println("=================================");

        GBLinkedListInterface<String> linkedList = new GBLinkedList<>();
        linkedList.addFirst("333");
        linkedList.addFirst("222");
        linkedList.addFirst("111");
        System.out.println(linkedList + " = " + linkedList.size());
        linkedList.addLast("444");
        linkedList.addLast("555");
        linkedList.add("666");
        linkedList.add("777");
        System.out.println(linkedList + " = " + linkedList.size());
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.get(2));


    }
}
