package org.example.examSecondSem.taskFromAnotherGroup.models;

public class Person {
    private String name;
    private String country;
    private int firstDate;
    private int lastDate;

    public Person(String name, String country, int firstDate, int lastDate) {
        this.name = name;
        this.country = country;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(int firstDate) {
        this.firstDate = firstDate;
    }

    public int getLastDate() {
        return lastDate;
    }

    public void setLastDate(int lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", firstDate=" + firstDate +
                ", lastDate=" + lastDate +
                '}';
    }
}
