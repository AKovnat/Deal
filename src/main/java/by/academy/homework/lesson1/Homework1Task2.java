package by.academy.homework.lesson1;

import java.util.Scanner;

public class Homework1Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ������: ");
        String dataType = scanner.next();
        switch (dataType) {
            case "int":
                System.out.println("������� �����: ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.println("������ ��� ������: " + dataType
                            + "������� �� ������� ��������� ����� �� 2" + " = " + number % 2);
                } else {
                    System.out.println("������ ��� ������ �� int");
                }
                break;
            case "double":
                System.out.println("������� �����: ");
                if (scanner.hasNextDouble()) {
                    double number = scanner.nextDouble();
                    System.out.println("������ ��� ������: " + dataType + " , "
                            + "70 % �� ���������� ����� ���������� " + " = " + number * 0.7);
                } else {
                    System.out.println("������ ��� ������ �� double");
                }
                break;
            case "float":
                System.out.println("������� �����: ");
                if (scanner.hasNextFloat()) {
                    float number = scanner.nextFloat();
                    System.out.println("������ ��� ������: " + dataType + " , " + '\n'
                            + "������� ���������� ����� ���������� " + " : " + number * number);
                } else {
                    System.out.println("������ ��� ������ �� float");
                }
                break;
            case "char":
                System.out.println("������� ������:");
                if (scanner.hasNext()) {
                    String firstchar = scanner.next();
                    System.out.println("������ ��� ������: " + dataType + " ; "  + '\n'
                            + "��� �������: " + firstchar.codePointAt(0));
                } else {
                    System.out.println("������� ��� ������ �� char");
                }
                break;
            case "string":
                System.out.println("������� ������: ");
                if (scanner.hasNext()) {
                    String Str = scanner.nextLine();
                    System.out.println("������ ��� ������: " + dataType + '\n' + "Hello " + Str);
                } else {
                    System.out.println("������ ��� ������ �� string");
                }
                break;
            default:
                System.out.println("Unsupported type.");
                break;
        }
        scanner.close();

    }

}