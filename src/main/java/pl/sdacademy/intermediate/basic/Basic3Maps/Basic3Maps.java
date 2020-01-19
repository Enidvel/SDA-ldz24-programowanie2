package pl.sdacademy.intermediate.basic.Basic3Maps;

/*Stwórz mapę HashMap<String, Integer>, która będzie przechowywać ilość wystąpień danego stringa z tablicy:

Przeiteruj się po tablicy i dodawaj poszczególne klucze, zmieniając odpowiednio wartość.

Wypisz na konsolę zawartość mapy 3 razy, uzywając na niej metody toString().
Zwróć uwagę, czy kolejność dodawania elementów zgadza się z kolejnością wypisania na konsolę.

Zmień implementację mapy na LinkedHashMap. Wypisz zawartość na konsolę 3 razy i ponownie zwróć uwagę na kolejność.

Przeiteruj się po mapie z wykorzystaniem Map.Entry<String, Integer> i wypisz wszystkie elementy mapy w sposób np.
abc -> 5

Wypisz na konsolę wszystkie klucze.
Wypisz na konsolę wszystkie wartości.
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basic3Maps {
    public static void main(String[] args) {
        Map<String, Integer> stringsApperance = new HashMap<>();
        Map<String, Integer> linkedStringsAp = new LinkedHashMap<>();


        String[] array = new String[]{"abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz"};

        initMap(array, stringsApperance);
        initMap(array, linkedStringsAp);
        System.out.println(stringsApperance.toString());
        System.out.println(linkedStringsAp.toString());

        System.out.println("############################");

        for (Map.Entry<String, Integer> entry: stringsApperance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("-----------------------------");

        for (String key : stringsApperance.keySet()) {
            System.out.println(key);
        }
        System.out.println("+++++++++++++++++++++++++++++");

        for (Integer value : stringsApperance.values()) {
            System.out.println(value);
        }
    }

    private static void initMap(String[] array, Map<String, Integer> stringsApperance) {
        int value = 0;
        for (String element : array) {
            if (!stringsApperance.containsKey(element)) {
                    stringsApperance.put(element, 1);
                } else {
                    stringsApperance.put(element, stringsApperance.get(element) + 1);
                }
            }
        }
    }




