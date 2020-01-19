package pl.sdacademy.intermediate.basic.Basic9Streams;

import pl.sdacademy.intermediate.warmup.WarmUp1.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic9Streams {
    public static void main(String[] args) {

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Integer> firstList = Arrays.asList(1, 2, 3);
        List<Integer> secondList = Arrays.asList(4, 5, 6);
        List<Integer> thirdList = Arrays.asList(7, 8, 9);

        List<Person> objectsList = Arrays.asList(person1, person2, person3);
        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
        List<Integer> numbersList = (List<Integer>) Stream.of(10,20,30,40,50,60,70,80,90);

        namesList.stream()
                .filter(e -> e.endsWith("n"))
                .map(String::toUpperCase)
                .sorted()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                return true;
                })
                .forEach(name -> System.out.println("Now name is printed: " + name));

        objectsList
                .stream()
                .filter(person -> person.getAge() >= 18)
                .forEach(person -> System.out.println("Person " + person.getName() + " is adult"));

        objectsList
                .stream()
                .filter(person -> person.getAge() >= 18)
                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!
                .forEach(name -> System.out.println("Person: " + name + " is adult."));

        objectsList.stream()
                .sorted()
                .skip(1)
                .forEach(person -> System.out.println("Hello, names after skipping: " + person.getName()));

        objectsList
                .stream()
                .limit(2)
                .forEach(person -> System.out.println("Hi, limited stream consists of: " + person.getName()));

        objectsList
                .stream()
                .sorted(Comparator.comparing(Person::getName)) // natural order, alfabetycznie
                .forEach(person -> System.out.println("Yo, natural order of names is: " + person.getName()));

        objectsList
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.println("Yo, reverse order of names is: " + person.getName()));

        objectsList
                .stream()
                .map(Person::getName)
                .sorted(Comparator.reverseOrder()) // odwrotnie poprzez String
                .distinct()
                .peek(System.out::println)
                .forEach(name -> System.out.println("Names: " + name));

        int sum = numbersList.stream().reduce(20,
                (element1, element2) -> element1 + element2);
        System.out.println("The sum of all elements is " + sum);

        Stream<List<Integer>> streamOfLists = Stream.of(firstList, secondList, thirdList);

        boolean areNumbersEven = streamOfLists
                .flatMap(Collection::stream) // wskazujemy, co robimy z każdą listą, tutaj tworzymy z każdej strumień liczb
                .anyMatch(element -> element % 2 == 0);
        System.out.println("Are there any even numbers? " + areNumbersEven);


        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        List<Person> adultsOnly = allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        String namesJoinedByHyphen = allPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(" – "));

    }
}
