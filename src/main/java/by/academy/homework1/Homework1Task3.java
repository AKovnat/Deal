package by.academy.homework1;
import java.util.Scanner;

public class Homework1Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число от 1 до 10: ");
        int r = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + r + " = " + (i * r));
        }
        scanner.close();
    }
}

