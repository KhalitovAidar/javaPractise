package org.example.examSecondSem;

import org.example.examSecondSem.util.User;

import java.lang.reflect.Field;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractise {
    private final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "ru"),
            new User(2, "Mary", "Patricia", 11, "ru"),
            new User(3, "John", "Michael", 7, "ru"),
            new User(4, "Jennifer", "Linda", 77, "ru"),
            new User(5, "William", "Elizabeth", 23, "ru"),
            new User(6, "Sue", "Jackson", 11, "ru"),
            new User(7, "Michael", "Tommy", 37, "ru")
    );

    public static void main(String[] args) throws NoSuchFieldException {
        StreamsPractise streamsPractise = new StreamsPractise();

        streamsPractise.testForEach();
        streamsPractise.testMap();
        streamsPractise.testSorted();
    }

    private void testForEach() {
        System.out.println("Test forEach");

        userList.stream().forEach(System.out::println);
    }

    private void testMap() {
        System.out.println("Test Map");
        userList.stream()
                .map(u -> new User(
                        u.getId(),
                        "X " + u.getFirstName(),
                        "Y " + u.getLastName(),
                        u.getAge() + 10,
                u.getNationality()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void testSorted() {
        System.out.println("Test Sorted");

        userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
