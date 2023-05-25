package org.example.examSecondSem.patterns.proxy;

public class Main {
}

class UserProxy {
    private User user;
    public UserProxy(User user) {
        this.user = user;
    }

    public void proxy() {
        user.setName("X" + user.getName());
        user.setLastname("Y" + user.getLastname());
    }
}

class User {
    private String name;
    private String lastname;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
