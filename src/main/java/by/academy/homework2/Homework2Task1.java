package by.academy.homework2;

import java.util.Scanner;

public class Homework2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        boolean result = true;
        if (string1.length() != string2.length()) {
            result = false;
        } else {
            int[] letters = new int[256];
            char[] str1_array = string1.toCharArray();
            for (char c : str1_array) {
                letters[(int)c]++;
            }

            for (int i=0; i<string2.length(); i++) {
                int c = (int) string2.charAt(i);
                if (--letters[c]<0) {
                    result = false;
                }
            }
        }
        System.out.println(result);

        scanner.close();
    }
}