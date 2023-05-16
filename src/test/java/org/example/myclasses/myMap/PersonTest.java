package org.example.myclasses.myMap;

import org.example.myclasses.entityCrud.Entity;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;


    @Test
    public void testContainsKeyReturnsTrue () {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        Person.PersonMap map = new Person.PersonMap();
        map.put(p1, "Alice");
        assertTrue(map.containsKey(p1));
    }

    @Test
    public void testContainsKeyReturnsFalse () {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        Person.PersonMap map = new Person.PersonMap();
        map.put(p1, "Alice");
        assertFalse(map.containsKey(p1));
    }
}