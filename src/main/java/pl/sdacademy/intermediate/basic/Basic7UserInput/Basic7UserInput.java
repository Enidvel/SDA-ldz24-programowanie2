package pl.sdacademy.intermediate.basic.Basic7UserInput;

/*Napisz konsolową grę w wisielca.
Program posiada zadaną liczbę żyć oraz słowo do zgadnięcia.
Użytkownik zgaduje po 1 literze i po każdym wprowadzeniu litery, należy:
- sprawdzić czy litera znajduje się w słowie
- sprawdzić czy może dalej grać (ma odpowiednią liczbę żyć)
- wyświetlić komunikat w przypadku niepoprawnego wyboru litery, a w przypadku poprawnego wyświetlić
które litery zostały już odgadnięte, pozostałe zastąpić gwiazdką "*". Jeśli np. ze słowa "abc" użytkownik zgadł wcześniej 'a',
a teraz zgadł 'c', powinien zobaczyć napis "a*c".

Wyświetl komunikat o zakończneniu gry z powodu przekroczenia liczby żyć oraz z powodu zgadnięcia całego słowa.
*/

import java.util.Scanner;

public class Basic7UserInput {
    // do-while loop so that the code runs at least once. Before the loop you can put a boolean 'playAgain'
    // and have that as your controlling expression while (playAgain == true); After all the code listed above,
    // add a part where you prompt the user if they would like to play again.
    // You can use if statements so if the user types yes, then playAgain = true.
    private static String[] passwords = {"konkatenacja", "redundancja", "hashcode", "abstrakcja", "stringi"};
    private static String password = passwords[(int) (Math.random() * passwords.length)];
    private static String hiddenPassword = new String(new char[password.length()]).replace("\0", "*");
    private static int attempt = 0;
    private static boolean playAgain = false;

    public static void main(String[] args) {
        //do {
            Scanner inputLetter = new Scanner(System.in);

            System.out.println("Welcome to the hangman game!");
            System.out.println("You've got 7 lives to guess the password.");

            while (attempt < 7 && hiddenPassword.contains("*")) {
                System.out.println("Guess any letter in the word");
                System.out.println(hiddenPassword);
                String guess = inputLetter.next();
                hang(guess);
            }
            inputLetter.close();
//        while (playAgain == true);
//            Scanner input = new Scanner(System.in);
//            System.out.println("Do you want to play again?");
//            String decision = input.next();
//            if (decision.equals("yes")) {
//                playAgain = true;
//                System.out.println("Let's start again!!");
//            } else {
//                playAgain = false;
//                System.out.println("Okay, have fun in the real world!");
//            }
        }

        public static void hang (String guess){
            String newasterisk = "";
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == guess.charAt(0)) {
                    newasterisk += guess.charAt(0);
                } else if (hiddenPassword.charAt(i) != '*') {
                    newasterisk += password.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (hiddenPassword.equals(newasterisk)) {
                attempt++;
                hangmanImage();
            } else {
                hiddenPassword = newasterisk;
            }
            if (hiddenPassword.equals(password)) {
                System.out.println("Correct! You win! The word was " + password);
            }
        }

        public static void hangmanImage () {
            if (attempt == 1) {
                System.out.println("Wrong guess, try again");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("___|___");
                System.out.println();
            }
            if (attempt == 2) {
                System.out.println("Wrong guess, try again");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (attempt == 3) {
                System.out.println("Wrong guess, try again");
                System.out.println("   ____________");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
            }
            if (attempt == 4) {
                System.out.println("Wrong guess, try again");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (attempt == 5) {
                System.out.println("Wrong guess, try again");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (attempt == 6) {
                System.out.println("Wrong guess, try again");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
            }
            if (attempt == 7) {
                System.out.println("GAME OVER!");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |          _|_");
                System.out.println("   |         / | \\");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
                System.out.println("GAME OVER! The word was " + password);
            }
        }
    }
