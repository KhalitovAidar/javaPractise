package org.example.examSecondSem.taskFromAnotherGroup;

import org.example.examSecondSem.taskFromAnotherGroup.models.Event;
import org.example.examSecondSem.taskFromAnotherGroup.models.Person;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader();
        fr.init();

        // A task
        List<Person> people = fr.getPeople();
        List<Event> events = fr.getEvents();

        Map<String, Integer> countriesStatistic = people.stream()
                .map(Person::getCountry)
                .collect(Collectors.toMap(
                        key -> key,
                        value -> 1,
                        Integer::sum,
                        HashMap::new
                ));

        System.out.println("B task");
        System.out.println(countriesStatistic + "\n");

        System.out.println("C task");
        String country = "Русь";

        List<Person> peopleFromCountry = people.stream()
                .filter((person) -> person.getCountry().equals(country))
                .collect(Collectors.toList());

        int count = 0;

        for(Person person: peopleFromCountry) {
            count += countOfEvents(person, events);
        }

        System.out.println(count);
    }

    private static int countOfEvents(Person person, List<Event> events) {
        int count = 0;

        for (Event event: events) {
            if (event.getPerson().equals(person.getName())) {
                if (event.getFirstDate() - person.getFirstDate() >= 0) {
                    ++count;
                }
            }
        }

        return count;
    }
}
