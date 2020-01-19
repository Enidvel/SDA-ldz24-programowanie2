package pl.sdacademy.intermediate.warmup;
/*Zadeklaruj tablicę Stringów, np.:
    String[] array = new String[] { "abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz" };
    Wypisz na konsolę sumę długości wszystkich elementów tablicy.*/

public class WarmUp2 {
    public static void main(String[] args) {


    String[] array = new String[] { "abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz" };
        int totalLength = findTotalLength(array);


        System.out.println(totalLength);
    }

    public static int findTotalLength(String[] array) {
        int totalLength = 0;
        for (String element : array) {
            totalLength += element.length();
        }
        //    for (int i = 0; i < array.length; i++) {
        //        totalLength += array[i].length();
        //    }
        return totalLength;
    }
}
