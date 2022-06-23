package by.academy.homework.lesson1;

import java.util.Scanner;

public class Homework1Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите тип данных: ");
        String dataType = scanner.next();
        switch (dataType) {
            case "int":
                System.out.println("¬ведите число: ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.println("¬веден тип данных: " + dataType
                            + "остаток от делени€ введнного числа на 2" + " = " + number % 2);
                } else {
                    System.out.println("¬веден тип данных не int");
                }
                break;
            case "double":
                System.out.println("¬ведите число: ");
                if (scanner.hasNextDouble()) {
                    double number = scanner.nextDouble();
                    System.out.println("¬веден тип данных: " + dataType + " , "
                            + "70 % от введенного числа составл€ет " + " = " + number * 0.7);
                } else {
                    System.out.println("¬веден тип данных не double");
                }
                break;
            case "float":
                System.out.println("¬ведите число: ");
                if (scanner.hasNextFloat()) {
                    float number = scanner.nextFloat();
                    System.out.println("¬веден тип данных: " + dataType + " , " + '\n'
                            + " вадрат введенного числа составл€ет " + " : " + number * number);
                } else {
                    System.out.println("¬веден тип данных не float");
                }
                break;
            case "char":
                System.out.println("¬ведите символ:");
                if (scanner.hasNext()) {
                    String firstchar = scanner.next();
                    System.out.println("¬веден тип данных: " + dataType + " ; "  + '\n'
                            + " од символа: " + firstchar.codePointAt(0));
                } else {
                    System.out.println("¬вееден тип данных не char");
                }
                break;
            case "string":
                System.out.println("¬ведите строку: ");
                if (scanner.hasNext()) {
                    String Str = scanner.nextLine();
                    System.out.println("¬веден тип данных: " + dataType + '\n' + "Hello " + Str);
                } else {
                    System.out.println("¬веден тип данных не string");
                }
                break;
            default:
                System.out.println("Unsupported type.");
                break;
        }
        scanner.close();

    }

}