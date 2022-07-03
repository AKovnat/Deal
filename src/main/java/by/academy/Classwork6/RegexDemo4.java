package by.academy.Classwork6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {

        String string = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String patternString = "Java\\s+\\d{0,9}";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {

        System.out.println(matcher.group());
        }
    }
}


