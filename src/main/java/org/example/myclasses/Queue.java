package org.example.myclasses;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue <T> {

    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }
    
    public void add(T t) {
        list.addLast(t);
    }

    public void remove() {
        list.removeFirst();
    }

    public boolean poll() {
        try {
            list.removeFirst();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public LinkedList<T> getList() {
        return list;
    }

    public static void sayQueue() {
        System.out.println("Hello");
    }
}
