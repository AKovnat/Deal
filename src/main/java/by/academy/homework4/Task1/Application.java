package by.academy.homework4.Task1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date in the format: dd-MM-yyyy");
        String date = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
        Matcher matcher = pattern.matcher(date);
        boolean a = matcher.matches();
        if(a == false) {
            System.out.println("Invalid date");
            return;
        }

        CustomDate newDate1 = new CustomDate(date);

        newDate1.getDayOfWeek();
        newDate1.checkLeapYear();

        System.out.println("Enter the day of the second date in the format: dd");
        int dateDay = scanner.nextInt();

        System.out.println("Enter the month of the second date in the format: MM");
        int dateMonth = scanner.nextInt();

        System.out.println("Enter the year of the second date in the format: yyyy");
        int dateYear = scanner.nextInt();

        CustomDate newDate2 = new CustomDate(dateDay, dateMonth, dateYear);

        newDate2.getDayOfWeek();
        newDate2.checkLeapYear();
        newDate2.calculateDays(newDate1);

        scanner.close();
    }
}

