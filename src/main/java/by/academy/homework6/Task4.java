package by.academy.homework6;

import java.io.*;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int randomTextLength;
        File dir = new File("myPackage//Task4result");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file1 = new File(dir, "Result.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                System.out.println("Can't create a new file" + e);
            }
        }
        for (int i = 1; i < 101; i++) {
            File file = new File(dir, i + ".txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("Can't create a file!" + e);
                }
            }
            randomTextLength = random.nextInt(576);
            try (
                    FileInputStream fileIn = new FileInputStream("myPackage//Task2.txt");
                    FileOutputStream fileOut = new FileOutputStream(file)
            ) {
                int a;
                int fileLength = 0;
                while (fileLength <= randomTextLength) {
                    a = fileIn.read();
                    fileOut.write(a);
                    fileLength++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found." + e);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try (FileWriter fw = new FileWriter(file1, true)) {
                fw.write("Random length: " + randomTextLength + " ");
                fw.write("File name: " + file.getName());
                fw.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

