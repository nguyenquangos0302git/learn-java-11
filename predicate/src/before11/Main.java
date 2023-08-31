package before11;

import model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(1),
                new Person(18),
                new Person(2)
        );

        List<Person> adultPeople = people
                .stream()
                .filter(Person::isAdult)
                .collect(Collectors.toList());

        List<Person> nonAdultPeople = people
                .stream()
                .filter(Person::nonAdult)
                .collect(Collectors.toList());

        System.out.println(adultPeople);
        System.out.println(nonAdultPeople);

    }


}
