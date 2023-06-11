package org.example.examSecondSem.taskFromAnotherGroup;

import org.example.examSecondSem.taskFromAnotherGroup.models.Event;
import org.example.examSecondSem.taskFromAnotherGroup.models.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private List<Person> people;
    private List<Event> events;

    public void init() throws IOException {
        this.people = readPeople();
        this.events = readEvents();
    }

    private List<Person> readPeople() throws IOException {
        List<Person> personList = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\taskFromAnotherGroup\\Person.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] temporaryArr = line.split(",");
                personList.add(new Person(temporaryArr[0], temporaryArr[1], Integer.parseInt(temporaryArr[2]), Integer.parseInt(temporaryArr[3])));
            }

            return personList;
        }
    }

    private List<Event> readEvents() throws IOException {
        List<Event> eventList = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\taskFromAnotherGroup\\Event.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] temporaryArr = line.split(",");
                eventList.add(new Event(temporaryArr[0], temporaryArr[1], Integer.parseInt(temporaryArr[2]), Integer.parseInt(temporaryArr[3])));
            }

            return eventList;
        }
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
