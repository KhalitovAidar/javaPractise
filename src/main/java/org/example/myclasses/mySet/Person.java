package org.example.myclasses.mySet;

import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    public static class PersonSet implements Set<Person> {
        private List<Person> list = new ArrayList<>();

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public boolean contains(Object o) {
            return list.contains(o);
        }

        @Override
        public Iterator<Person> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return list.toArray();
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return list.toArray(a);
        }

        @Override
        public boolean add(Person person) {
            if (list.contains(person)) {
                return false;
            } else {
                list.add(person);
                return true;
            }
        }

        @Override
        public boolean remove(Object o) {
            return list.remove(o);
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return list.containsAll(c);
        }

        @Override
        public boolean addAll(Collection<? extends Person> c) {
            boolean result = false;
            for (Person p : c) {
                if (add(p)) {
                    result = true;
                }
            }
            return result;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return list.retainAll(c);
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return list.removeAll(c);
        }

        @Override
        public void clear() {
            list.clear();
        }

        @Override
        public Spliterator<Person> spliterator() {
            return Set.super.spliterator();
        }
    }

    // Пример использования
    public static void main(String[] args) {
        PersonSet set = new PersonSet();
        set.add(new Person("Alice", 25));
        set.add(new Person("Bob", 30));
        set.add(new Person("Charlie", 35));
        set.add(new Person("Bob", 30)); // Этот элемент не будет добавлен из-за переопределенного метода equals()

        System.out.println("Set size: " + set.size());
        System.out.println("Set contains Bob (30): " + set.contains(new Person("Bob", 30)));
        System.out.println("Set contains Eve (40): " + set.contains(new Person("Eve", 40)));
        System.out.println("Set elements:");
        for (Person p : set) {
            System.out.println(p.name + " (" + p.age + ")");
        }

        set.clear();
        System.out.println("Set cleared. Is empty: " + set.isEmpty());
    }
}

