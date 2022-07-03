package by.academy.homework1;

import java.util.Scanner;

public class Homework1Task2 {
    public static void main(String[] args) {

        String type;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип данных:");

        type = scanner.nextLine();

        switch (type) {
            case "int": {
                System.out.println("Введите переменную: ");
                if (scanner.hasNextInt()) {
                    int x = scanner.nextInt();
                    System.out.println(x % 2);
                } else System.out.println("Некорректные данные");
            }
            break;

            case "double": {
                System.out.println("Введите переменную: ");
                if (scanner.hasNextDouble()) {
                    double x = scanner.nextDouble();
                    System.out.println(x * 0.7);
                } else System.out.println("Некорректные данные");
            }
            break;

            case "float": {
                System.out.println("Введите переменную: ");
                if (scanner.hasNextFloat()) {
                    float x = scanner.nextFloat();
                    System.out.println(x * x);
                } else System.out.println("Некорректные данные");
            }
            break;

            case "char": {
                System.out.println("Введите переменную: ");
                char x = scanner.next().charAt(0);
                System.out.println("Код символа " + x + " = " + (int) x);
            }
            break;

            case "String": {
                System.out.println("Введите переменную: ");
                String x = scanner.nextLine();
                System.out.println("Hello " + x);
            }
            break;

            default:
                System.out.println("Unsupported type!");

        }
        scanner.close();
    }

}