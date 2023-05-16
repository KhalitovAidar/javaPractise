package org.example.examSecondSem.util;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
}
