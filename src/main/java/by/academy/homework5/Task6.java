package by.academy.homework5;

public class Task6 {
    public static void main(String[] args) {
        int array1[] = new int[8];

        try {
            array1[9] = 9;
            array1[10] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array is to small, expand the array.");
        }
    }
}
