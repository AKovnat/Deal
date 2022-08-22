package by.academy.homework5;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        int size = 10;

        ArrayList<Integer> marks = new ArrayList<Integer>();

        for (int i = 0; i < size; i++){
            int a = (int)(Math.random() * 10 + 1);
            marks.add(i, a);
        }
        System.out.println("Marks list: "+marks);

        ListIterator<Integer> listIterator = marks.listIterator();
        while (listIterator.hasNext()) {
            int maxmark=0;
            for (Integer element: marks) {
                element=listIterator.next();
                if (element>maxmark) {
                    maxmark=element;
                }
            }
            System.out.println("Max mark is: "+maxmark);

        }
    }

}