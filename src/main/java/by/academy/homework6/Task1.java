package by.academy.homework6;
import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File dir = new File("myPackage");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, "Task1.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        String myString = scanner.nextLine();
        while (!myString.equals("stop")) {
            try (FileWriter fw = new FileWriter(file, true)) {
                fw.write(myString);
                fw.write("\n");
            }
            myString = scanner.nextLine();
        }
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        }
        scanner.close();
    }
}

