package pl.sdacademy.intermediate.warmup;

/*Zadeklaruj tablicę intów, np.:
int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };
Wypisz na konsolę najwyższą oraz najniższą liczbę z tablicy.
Do poszukiwania min i max NIE używaj gotowych metod i bibliotek.
*/
public class WarmUp3 {
    public static void main(String[] args) {
        int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
