package org.example.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    @Test
    public void testGet() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        Assertions.assertEquals("one", arrayList.get(0));
        Assertions.assertEquals("two", arrayList.get(1));
        Assertions.assertEquals("three", arrayList.get(2));

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> arrayList.get(100));
    }
}
