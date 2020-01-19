package pl.sdacademy.intermediate.basic.Basic1Arrays;

import java.util.Arrays;
import java.util.Random;

public class Basic1Arrays {
    public static void main(String[] args) {

        int[] orderedNumbers = initOrderedNumbersArray();
        int[] fibonacciNumbers = initFibonacciNumbersArray();
        int[] randomNumbers = initRandomNumbersArray();

        System.out.println(Arrays.toString(orderedNumbers));
        System.out.println(Arrays.toString(fibonacciNumbers));
        System.out.println(Arrays.toString(randomNumbers));

        System.out.println("Reverse order:");
        Operations.printReverseOrder(orderedNumbers);
        System.out.println();
        Operations.printReverseOrder(fibonacciNumbers);
        System.out.println();
        Operations.printReverseOrder(randomNumbers);

        System.out.println("\nOdd numbers of each array:");
        Operations.printOddNumbers(orderedNumbers);
        System.out.println();
        Operations.printOddNumbers(fibonacciNumbers);
        System.out.println();
        Operations.printOddNumbers(randomNumbers);

        System.out.println("\nSum of numbers under even indexes:");
        Operations.printSumOfEmementsUnderEvenIndexes(orderedNumbers);
        Operations.printSumOfEmementsUnderEvenIndexes(fibonacciNumbers);
        Operations.printSumOfEmementsUnderEvenIndexes(randomNumbers);

        System.out.println("Sum of elements larger than 10");
        Operations.printSumOfElementsLargerThan10(orderedNumbers);
        Operations.printSumOfElementsLargerThan10(fibonacciNumbers);
        Operations.printSumOfElementsLargerThan10(randomNumbers);


    }

    public static int[] initOrderedNumbersArray() {
        // zainicjalizuj tablicę wypełnioną kolejnymi elementami ciągu Fibonacciego
        // (pierwsze 2 elementy to 0 i 1; każdy następny to suma 2 poprzendich) <- zrób do tego pętlę for
        int[] orderedNumbers = new int[10];
        for (int i = 0; i < orderedNumbers.length; i++) {
            orderedNumbers[i] = i + 1;
        }
        return orderedNumbers;
    }

    public static int[] initFibonacciNumbersArray() {
        //int[] fibonacciNumbers = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] fibonacciNumbers = new int[10];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
        }
        return fibonacciNumbers;
    }

    public static int[] initRandomNumbersArray() {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(31);
        }
        return randomNumbers;
    }


}
