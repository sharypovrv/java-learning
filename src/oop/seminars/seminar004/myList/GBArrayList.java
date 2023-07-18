package oop.seminars.seminar004.myList;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<E> implements GBList<E> {
    private E[] values;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public int size() {
        return values.length;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            System.out.println(exception.getMessage());
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @SuppressWarnings("unchecked")
    @Override
    public GBList<E> join(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;

        } catch (ClassCastException exception) {
            System.out.println(exception.getMessage());
        }
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

}
