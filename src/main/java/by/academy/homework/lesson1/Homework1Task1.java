package by.academy.homework.lesson1;

import java.util.Scanner;

public class Homework1Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        long sum;
        System.out.println("����� ������� � ��������: ");
        sum = scanner.nextLong();
        System.out.println("������� ����������: ");
        age = scanner.nextInt();
        if (sum < 100) {
            System.out.println("��������� ���� � ������ ������: " + (sum - (sum * 0.05)));
        }
        if (sum >= 100 && sum < 200) {
            System.out.println("��������� ���� � ������ ������: " + (sum - (sum * 0.07)));
        }
        if (sum >= 200 && sum < 300 && age > 18) {
            System.out.println("��������� ���� � ������ ������: " + (sum - (sum * 0.16)));
        } else {
            System.out.println("��������� ���� � ������ ������: " + (sum - (sum * 0.09)));
        }
        if (sum >= 300 && sum < 400) {
            System.out.println("��������� ���� � ������ ������: " + (sum - (sum * 0.15)));
        } if (sum >= 400) {
            System.out.println("��������� ���� � ������ ������:  " + (sum - (sum * 0.2)));
        }
        scanner.close();
    }
}

