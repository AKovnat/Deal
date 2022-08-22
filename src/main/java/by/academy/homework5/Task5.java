package by.academy.homework5;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {


        String text = "Glory glory Man united,Glory glory Man united,Glory glory Man united,\n" +
                "As the reds go marching on on on!";


        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            Integer n = map.get(text.charAt(i));
            if (n == null) {
                map.put(text.charAt(i), 1);
            } else {
                map.put(text.charAt(i), ++n);
            }
        }
        System.out.println(map);
    }
}