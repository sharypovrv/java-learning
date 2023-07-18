package oop.seminars.seminar004.myList;

public interface GBLinkedListInterface<T> {
    int size();
    boolean addFirst(T t);
    boolean addLast(T t);
    boolean add(T t);
    T get(int index);
//    void update(int index,T t);
//    void remove(int index);
//    GBList<T> join(T t);
}
