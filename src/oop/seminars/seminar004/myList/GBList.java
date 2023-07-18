package oop.seminars.seminar004.myList;

import java.util.Iterator;

public interface GBList<T> extends Iterable<T> {
    int size();
    boolean add(T t);
    void remove(int index);
    T get(int index);
    void update(int index,T t);
    GBList<T> join(T t);
}
