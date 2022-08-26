package by.academy.homework6;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        File dir = new File("myPackage");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, "Result.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Can't create a new file" + e);

            }
        }
        try (
                FileInputStream fileIn = new FileInputStream("myPackage\\Task2.txt");
                FileOutputStream fileOut = new FileOutputStream(file)) {
            int a;
            while ((a = fileIn.read()) != -1) {
                if ((char) a != ' ') {
                    fileOut.write(a);
                }
            }

        } catch (IOException e) {
            System.out.println("Can't write data in a new file." + e);
        }
    }
}