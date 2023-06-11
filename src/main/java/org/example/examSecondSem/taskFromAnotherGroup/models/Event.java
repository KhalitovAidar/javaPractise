package org.example.examSecondSem.taskFromAnotherGroup.models;

public class Event {
    private String name;

    private String person;

    private int firstDate;

    private int lastDate;

    public Event(String name, String person, int firstDate, int lastDate) {
        this.name = name;
        this.person = person;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
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
        return "Event{" +
                "name='" + name + '\'' +
                ", person='" + person + '\'' +
                ", firstDate=" + firstDate +
                ", lastDate=" + lastDate +
                '}';
    }
}
