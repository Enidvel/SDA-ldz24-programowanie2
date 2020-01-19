package pl.sdacademy.intermediate.basic.Basic1Arrays;

/* Następnie wyświetl dla każdej tablicy (dla każdego z poniższych podpunktów napisz osobną metodę):
a) Wszystkie elementy od końca
b) Tylko elementy nieparzyste
c) Sumę wszystkich elementów o parzystych indeksach
d) Sumę wszystkich elementów o wartości większej od 10.
e) Tablicę posortowaną z wykorzystaniem algorytmu sortowania bąbelkowego (do realizacji sortowania stwórz osobną klasę)*/

public class Operations {

    public static void printReverseOrder(int[] array) { // OK

        for (int i = (array.length - 1); i >= 0; --i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int printSumOfEmementsUnderEvenIndexes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    sum += array[i];
                }
            }
        System.out.println(sum);
        return 0;
    }

    public static void printSumOfElementsLargerThan10(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
