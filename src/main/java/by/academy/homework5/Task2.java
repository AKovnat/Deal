package by.academy.homework5;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {

        ArrayList<Double> list1 = new ArrayList<>();
        LinkedList<Double> list2 = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            list1.add(Math.random());
            list2.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            list1.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            list2.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}