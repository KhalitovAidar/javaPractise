package org.example.myclasses.mycollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionRealise<T> implements Collection<T> {
    private LinkedList<T> linkedList;
    //TODO
    @Override
    public int size() {
        return linkedList.size();
    }

    //TODO
    @Override
    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
    //TODO
    @Override
    public T[] toArray() {
        Object[] objects = new Object[linkedList.size()];
        for (int i = 0; i < linkedList.size(); ++i) {
            objects[i] = linkedList.get(i);
        }
        return (T[]) objects;
    }
    //TODO
    @Override
    public boolean add(Object o) {
        linkedList.add((T) o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }
    //TODO
    @Override
    public void clear() {
        linkedList.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public LinkedList<T> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }
}
