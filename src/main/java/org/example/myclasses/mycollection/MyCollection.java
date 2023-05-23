package org.example.myclasses.mycollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollection<T> implements Collection<T> {

    private Object[] items;
    private int size = 0;

    public MyCollection() {
        this.items = new Object[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyCollectionIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(items, 0, result, 0, size);
        return result;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < size) {
            a = (T1[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        }
        System.arraycopy(items, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        if (size == items.length) {
            Object[] tmp = new Object[size * 2];
            System.arraycopy(items, 0, tmp, 0, size);
            items = tmp;
        }
        items[size] = t;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(o)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            while (remove(o)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (!c.contains(items[i])) {
                remove(items[i]);
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    private class MyCollectionIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size && items[currentIndex] != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) items[currentIndex++];
        }

        @Override
        public void remove() {
            MyCollection.this.remove(items[currentIndex - 1]);
        }
    }
}
