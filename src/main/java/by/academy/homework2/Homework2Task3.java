package by.academy.homework2;

import java.util.Scanner;

public class Homework2Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String first = scanner.nextLine();

        System.out.println("Введите второе слово: ");
        String second = scanner.nextLine();


        System.out.println("Полученное слово: " + '\n'
                + first.substring(0, first.length() / 2) + second.substring(second.length() / 2));

        scanner.close();
    }

}

