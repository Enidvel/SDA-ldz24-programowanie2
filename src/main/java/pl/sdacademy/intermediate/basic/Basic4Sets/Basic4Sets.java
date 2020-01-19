package pl.sdacademy.intermediate.basic.Basic4Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Wygeneruj w IntelliJ IDEA metody equals i hashCode w klasie Car, opierając je o pole VIN.

Stwórz HashSet<Car> i dodaj do niego wszystkie obiekty typu Car.
Przeiteruj się po secie i wypisz wszystkie samochody, które zawiera.

Czy kolejność dodawania elementów jest zgodna z kolejnością w jakiej są wypisane?
Zmień implementację zbioru na LinkedHashSet i ponownie wypisz wszystkie samochody - zwróć uwagę na kolejność.
*/
public class Basic4Sets {
    public static void main(String[] args) {

        Car volkswagen1 = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car audi1 = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car seat1 = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car audi2 = new Car("Audi", "A3", "1FMFU17538LA84228");
        Car seat2 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car volkswagen2 = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080");

        Set<Car> set = new LinkedHashSet<>();
        set.add(volkswagen1);
        set.add(audi1);
        set.add(seat1);
        set.add(audi2);
        set.add(seat2);
        set.add(volkswagen2);

        System.out.println("LinkedHashSet: " + set.toString());
        System.out.println("+++++++++++++++++++");

        set = new HashSet<>();
        set.add(volkswagen1);
        set.add(audi1);
        set.add(seat1);
        set.add(audi2);
        set.add(seat2);
        set.add(volkswagen2);

        System.out.println("HashSet: " + set.toString());

        // kolejność wyświetlania jest nieuporządkowania dla HashSet, ktory zapewnia tylko brak duplikatów, zaś
        // LinkedHashSet gwarantuje dodatkowo kolejnosc wpisywania obiektow
        System.out.println("HashSet size = " + set.size());
        System.out.println("--------------------------");

        System.out.println("volkswagen1 hashcode = " + volkswagen1.hashCode());
        System.out.println("volkswagen2 hashcode = " + volkswagen2.hashCode());
        System.out.println("Checking equality between volkswagen1 and volkswagen2 = " + volkswagen1.equals(volkswagen2));

        System.out.println("audi1 hashcode = " + audi1.hashCode());
        System.out.println("audi2 hashcode = " + audi2.hashCode());
        System.out.println("Checking equality between audi1 and audi2 = " + audi1.equals(audi2));


//        Iterator<Car> itr = set.iterator();  to by było ok, gdybym miała set stringów, nie obiektów
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

    }
}
