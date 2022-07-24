package by.academy.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        boolean check = true;

        User seller = new User("Vlad",1000);
        User buyer = new User("Artem", 1000);

        Date date = new Date();

        while (true) {
            System.out.print("������� ���� ������ ��������: ");
            String date1 = scanner.next();
            if (date.checkDate1(date1)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date date2 = simpleDateFormat.parse(date1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                System.out.println("����: " + calendar.get(Calendar.DAY_OF_MONTH));
                System.out.println("�����: " + (calendar.get(Calendar.MONTH) + 1));
                System.out.println("���: " + calendar.get(Calendar.YEAR));
                break;
            }

            else if (date.checkDate2(date1)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date date2 = simpleDateFormat.parse(date1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                System.out.println("����: " + calendar.get(Calendar.DAY_OF_MONTH));
                System.out.println("�����: " + (calendar.get(Calendar.MONTH) + 1));
                System.out.println("���: " + calendar.get(Calendar.YEAR));
                break;
            }

            else{
                System.out.println("�� ����������� ����� ���� ������ ��������. ��������� �������.");
            }
        }

        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();

        while (true){
            System.out.print("������� ���� ����� ��������: ");
            String number = scanner.next();
            if (belarusPhoneValidator.validate(number)){
                seller.setPhone(number);
                break;
            }
            else{
                System.out.println("�� ����������� ����� ���� ����� ��������. ��������� �������.");
            }
        }

        EmailValidator emailValidator = new EmailValidator();

        while (true){
            System.out.print("������� ���� �����: ");
            String email = scanner.next();
            if (emailValidator.validate(email)){
                seller.setEmail(email);
                break;
            }
            else{
                System.out.println("�� ����������� ����� ���� �����. ��������� �������");
            }
        }


        Product[] products = new Product[0];

        Deal deal = new Deal(seller,buyer,products);

        while (true) {
            System.out.print("���� �� ������ �������� �������� � ������� ������� 1\n" +
                    "���� �� ������ ������� ������� �� ������� ������� 2\n" +
                    "���� �� ������ ����������� �������� � ������� ������� 3: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    products = deal.addProducts(products);
                    break;
                case 2:
                    products = deal.deleteProduct(products);
                    break;
                case 3:
                    deal.countingProducts(products);
                    break;
                default:
                    System.out.println("����������� �������");
                    break;
            }
            while (true) {
                System.out.print("������� 1, ���� ������ ���������� ����� ��������� � 2, ���� ������ �������� ����: ");
                int endOperation = scanner.nextInt();
                if (endOperation == 1) {
                    check = false;
                    break;
                } else if (endOperation == 2) {
                    deal.setProducts(products);
                    break;
                } else {
                    System.out.println("� �� ���� ����� �������. ��������� �������");
                }
            }
            if (check){
                break;
            }
            check = true;
        }
        deal.bill(deal);
    }
}