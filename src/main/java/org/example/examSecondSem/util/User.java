package org.example.examSecondSem.util;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User implements Comparable<User> {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
