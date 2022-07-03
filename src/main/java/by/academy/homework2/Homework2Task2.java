package by.academy.homework2;
import java.util.Scanner;

public class Homework2Task2 {
    private static int diffWords(String st){
        StringBuffer str = new StringBuffer();
        char c;
        for (int i=0;i<st.length();i++) {
            c = st.charAt(i);
            if (str.indexOf(String.valueOf(c))==-1)
                str.append(c);
        }

        return str.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        String goal = words[0];

        for (int i=1;i<words.length;i++){

            if ( diffWords(words[i])<diffWords(goal))
                goal = words[i];
        }

        System.out.println("Слово: "+goal+", число различных символов: "+diffWords(goal));

        scan.close();
    }
}

