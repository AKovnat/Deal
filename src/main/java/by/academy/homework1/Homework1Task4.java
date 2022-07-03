package by.academy.homework1;

public class Homework1Task4 {
    public static void main(String[] args) {
        int i = 2;
        long sum;
        for (sum = i; sum <= 1000000; sum = sum * i) {
            System.out.println(sum);
        }
    }
}

