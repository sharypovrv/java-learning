package oop.seminars.seminar004.myList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBLinkedListInterface<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public GBLinkedList() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean addFirst(T t) {
        Node<T> temp = first;
        first = new Node<>(null, t, first);
        if (temp == null) {
            last = first;
        } else {
            temp.prev = first;
        }
        size++;
        return true;
    }

    @Override
    public boolean addLast(T t) {
        Node<T> temp = last;
        last = new Node<>(last, t, null);
        if (temp == null){
            first = last;
        } else {
            temp.next = last;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(T t) {
        return addLast(t);
    }

    @Override
    public T get(int index) {
        Node<T> temp = first;
        int count = 0;

        while (count < index) {
            count++;
            temp = temp.next;
        }

        return temp.item;
    }

    @Override
    public String toString() {
        if (first == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node<T> temp = first;

        while (temp != null) {
            sb.append(temp.item);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }

        return sb.append("]").toString();
    }

    private static class Node<T> {
        T item;
        Node<T> prev;
        Node<T> next;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }
    }

}
