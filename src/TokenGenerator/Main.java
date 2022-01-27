package TokenGenerator;/*
Zaimplementuj metodę Java - genereteToken().
        1. Liczba parametrów - 1 -> długość tokena
        2. Nazwa - genereteToken()
        3. Return - zwraca token - String
        4. token - to ciąg randomowych znaków [a-z][A-Z][0-9][!@#$%^&*()] - o dowolnej długości

        Przykład tokena 5 znakowego - g4#2%
        Przykład tokena 10 znakowego - g4#2%hQQ5^
        Przykład tokena 15 znakowego - g4#2%hQQ5^YY5!2

        Zaimplementuj metodę Java - getNumberFromUser().
        1. Liczba parametrów - brak
        2. Nazwa -getNumberFromUser().
        3. Return - zwraca int
        4. Liczba powinna być pobrana od użytkownika za pomocą klasy Scanner.
        Jeżeli user wprowadzi tekst zamiast liczby, powinna poprosić o ponowne wprowadzenie danych
        i robić to tak długo aż użytkownik w końcu poda liczbę.

        W main poproś użytkownika o podanie 3 liczb i uruchom metodę z genereteToken() z 3 różnymi parametrami.
        Wypisz każdy z tokenów do konosoli oraz ile znaków posiada każdy z otrzymanych tokenów z metody genereteToken.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int main(String[] args) {


        public int getNumberFromUser() {

            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the number: ");
                int number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("It isn't number => try again!");
                return getNumberFromUser();
            }
            return getNumberFromUser;
        }
    }

    private static int getNumberFromUser() {
        return 0;
    }
}
