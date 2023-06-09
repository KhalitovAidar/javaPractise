package org.example.examSecondSem.comparatorAndComparable;

import org.example.examSecondSem.util.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}