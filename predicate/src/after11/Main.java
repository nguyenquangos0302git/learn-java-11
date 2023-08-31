package after11;

import model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1),
                new Person(18),
                new Person(2)
        );

        Predicate<Person> auditPeople = Person::isAdult;
        Predicate<Person> nonAuditPeople = Predicate.not(auditPeople);

        List<Person> adultPeople = people
                .stream()
                .filter(auditPeople)
                .collect(Collectors.toList());

        List<Person> nonAdultPeople = people
                .stream()
                .filter(nonAuditPeople)
                .collect(Collectors.toList());


        System.out.println(adultPeople);
        System.out.println(nonAdultPeople);

    }

}
