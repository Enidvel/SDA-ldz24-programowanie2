package pl.sdacademy.intermediate.basic.Basic2Lists;

import java.util.*;

public class Basic2Lists {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        personList.add(person1);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        personList.add(person2);
        Person person3 = new Person("Ala", "Makota", "Warszawa", 15, 111222333);
        personList.add(person3);
        Person person4 = new Person("Juliusz", "Slowacki", "Krakow", 40, 10203040);
        personList.add(person4);
        Person person5 = new Person("Tomasz", "Kowalski", "Lodz", 12, 13342523);
        personList.add(person5);

        System.out.println("Informacje o wszystkich osobach z listy");
        printInfo(personList);
        System.out.println("Osoby, które są starsze niż 20 lat");
        printPersonOlderThan20(personList);
        System.out.println("Osoby, których numer telefonu jest podzielny przez 2");
        printPersonWhichPhoneNoIsDividedBy2(personList);
        System.out.println("Suma wieku wszystkich osób listy 1:");
        printSumOfAllAges(personList);

        //Stwórz nową listę będącą kopią pierwszej (użyj konstruktora przyjmującego listę).
        List<Person> personListCopy = new ArrayList<>(personList);

        //Usuń jedną osobę ze środka pierwszej listy.
        personList.remove(2);
        //Wypisz ponownie sumę lat wszystkich osób w pierwszej liście oraz sumę lat osób z drugiej listy.
        //Wypisz ilość elementów pierwszej i drugiej listy.
        System.out.println("Suma wieku wszystkich osób listy 1 po usunięciu osoby ze środka listy:");
        printSumOfAllAges(personList);
        System.out.println("Suma wieku wszystkich osób listy 2:");
        printSumOfAllAges(personListCopy);
        System.out.println("Rozmiar pierwszej i drugiej listy");
        System.out.println(personList.size());
        System.out.println(personListCopy.size());

        System.out.println();
        showArrayListPerformance();
        showLinkedListPerformance();

    }

    public static void printInfo(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public static void printPersonOlderThan20(List<Person> personList) {
        for (Person person: personList) {
            if (person.age > 20) { // jesli zmienne byłyby private to person.age nie dałoby nam dostępu. Używamy wtedy .getAge()
                System.out.println(person);
            }
        }
    }

    public static void printPersonWhichPhoneNoIsDividedBy2(List<Person> personList) {
        for (Person person: personList) {
            if (person.phone % 2 == 0) {
                System.out.println(person);
            }
        }
    }

    public static void printSumOfAllAges(List<Person> personList) {
        int sum = 0;
        for (Person person : personList) {
            sum += person.getAge();
        }
        System.out.println(sum);
    }

    private static void showArrayListPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.remove(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Arraylist performance: " + (stopTime - startTime) + "ms");
    }

    private static void showLinkedListPerformance() {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.remove(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Linkedlist performance: " + (stopTime - startTime) + "ms");
    }
}
