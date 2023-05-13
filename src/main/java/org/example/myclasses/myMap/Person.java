package org.example.myclasses.myMap;

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
        return age == person.age && Objects.equals(this.name, person.name);
    }

    public static class PersonMap implements Map<Person, String> {
        private List<Entry<Person, String>> list = new ArrayList<>();

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public boolean containsKey(Object key) {
            for (Entry<Person, String> entry : list) {
                if (entry.getKey().equals(key)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            for (Entry<Person, String> entry : list) {
                if (entry.getValue().equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public String get(Object key) {
            for (Entry<Person, String> entry : list) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
            return null;
        }

        @Override
        public String put(Person key, String value) {
            for (Entry<Person, String> entry : list) {
                if (entry.getKey().equals(key)) {
                    String oldValue = entry.getValue();
                    entry.setValue(value);
                    return oldValue;
                }
            }
            list.add(new AbstractMap.SimpleEntry<>(key, value));
            return null;
        }

        @Override
        public String remove(Object key) {
            Iterator<Entry<Person, String>> iterator = list.iterator();
            while (iterator.hasNext()) {
                Entry<Person, String> entry = iterator.next();
                if (entry.getKey().equals(key)) {
                    iterator.remove();
                    return entry.getValue();
                }
            }
            return null;
        }

        @Override
        public void putAll(Map<? extends Person, ? extends String> m) {
            for (Entry<? extends Person, ? extends String> entry : m.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override
        public void clear() {
            list.clear();
        }

        @Override
        public Set<Person> keySet() {
            Set<Person> keySet = new HashSet<>();
            for (Entry<Person, String> entry : list) {
                keySet.add(entry.getKey());
            }
            return keySet;
        }

        @Override
        public Collection<String> values() {
            List<String> values = new ArrayList<>();
            for (Entry<Person, String> entry : list) {
                values.add(entry.getValue());
            }
            return values;
        }

        @Override
        public Set<Entry<Person, String>> entrySet() {
            return new HashSet<>(list);
        }
    }

    public static void main(String[] args) {

    }
}
