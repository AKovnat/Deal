package by.academy.homework2;

import java.util.Scanner;

public class Homework2Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ������ �����: ");
        String first = scanner.nextLine();

        System.out.println("������� ������ �����: ");
        String second = scanner.nextLine();


        System.out.println("���������� �����: " + '\n'
                + first.substring(0, first.length() / 2) + second.substring(second.length() / 2));

        scanner.close();
    }

}

