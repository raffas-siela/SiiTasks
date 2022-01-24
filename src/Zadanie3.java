/*Zad 3.
        int size = 5;
        int[] numbers = new int[size];

        Powyższy kod pozwala na stworzenie tablicy gdzie ilość elementów jest zależna o wartości zmiennej.
        Wykorzystaj to w poniższym programie:

        1. Program powinien poprosić użytkownika o podanie liczby całkowitej.
        2. Następnie program powinien stworzyć tablicę po podanym przez użytkownika rozmiarze.
        3. Następnie poprosić użytkownika o podanie liczb aby zapełnić nimi tablicę
            (jeżeli użytkownik w pkt 1 podał liczbę 5 jako rozmiar, to w pkt 3 oczekujemy
            że poda 5 liczb i każda z nich zapiszemy w tablicy)
        4. Po zakończeniu wpisywania liczb przez użytkownika, program powinien wypisać
            jaka była średnia liczb wprowadzonych przez użytkownika oraz wartość maksymalna*/

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        int [] table = new int[setSize()];
        for (int i = 0; i < table.length; i++) {
            table[i] = getNumber();
        }
        int sumTable = 0;
        for (int i = 0; i < table.length; i++) {
            sumTable+=table[i];
        }
        float averageTable = sumTable / table.length;
        int sizeTable = table.length;
        int maxTable = table[0];
        for (int i = 0; i < sizeTable; i++) {
            if (table[i] > maxTable)
                maxTable = table[i];
        }
        System.out.println("Maximum value in the table: " + maxTable);
        System.out.println("The sum of the values: " + sumTable);
        System.out.println("Average of the values: " + averageTable);
    }
    private static int setSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the table: ");
        int temp = scanner.nextInt();
        return temp;
    }
    private static int getNumber(){
        System.out.println("Enter numbers to fill in the table");
        return new Scanner(System.in).nextInt();
    }
}




