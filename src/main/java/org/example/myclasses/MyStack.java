package org.example.myclasses;

import java.util.LinkedList;
import java.util.List;

public class MyStack<T> {
    private LinkedList<T> list;

    public MyStack() {

    }

    public void push(T object)
    {
        list.add(object);
    }

    public T peek()
    {
        return list.getLast();
    }

    public void pop()
    {
        list.removeLast();
    }

    public boolean empty()
    {
        return list.isEmpty();
    }

    public LinkedList<T> getList()
    {
        return list;
    }

    public void setList(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }
}