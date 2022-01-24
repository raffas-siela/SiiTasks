/*Zad 2.
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        }
   }

        Powyższy kod spowoduje przypisanie do zmiennej 'numberToGuess' losowo wybranej liczby z zakresu 0-99. Wykorzystaj go do wykonania poniższego zadania:
        Gra w zgadywanie polegająca na tym, że program losuje liczbę, a użytkownik próbuje ją odgadnąć.

        Wymagania:
        1. Program losuje liczbę z zakresu 0-99.
        2. Program wyświetla komunikat z prośbą o rozpoczęcie zgadywania liczby całkowitej z zakresu 0-99
        3. Program wczytuje liczbę wpisaną przez użytkownika.
        4. Użytkownik powinien mieć maksymalnie 5 prób zgadywania.
        5. Zachowanie programu podczas podania niepoprawnej liczby:
        - w przypadku podania zbyt dużej liczby wypisać do konsoli: "Your number is GREATER than the one you are trying to guess"
        - w przypadku podania zbyt małej liczby wypisać do konsoli: "Your number is LOWER than the one you are trying to guess"
        - podać ile prób zostało mu do końca.
        - jeżeli nie była to jego ostatnia próba to wypisać tekst: "Please try again"*/

import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        int numberToGuess = new Random().nextInt(100);
        System.out.println("Guess the number drawn by the computer! Give me a number");

        int[] shotsNumber = {5,4,3,2,1};

        for (int arrayElem : shotsNumber) {

            Scanner scanner = new Scanner(System.in);

            int userNumber = scanner.nextInt();

            if (numberToGuess < userNumber) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
                System.out.println("Please try again. Number of shots: " + (arrayElem - 1));
            } else if (numberToGuess > userNumber) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println("Please try again. Number of shots: " + (arrayElem - 1));
            } else {
                System.out.println("You WIN!!!!!");
                break;
            }
        }
    }
}
