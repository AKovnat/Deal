package by.academy.homework6.Task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Marcus", "Rashford", 24));
        users.add(new User("Jadon", "Sancho", 22));
        users.add(new User("Bruno", "Fernandes", 27));
        users.add(new User("David", "De Gea", 31));
        users.add(new User("Lisandro", "Martinez", 24));
        users.add(new User("Anthony", "Elanga", 20));
        users.add(new User("Donny", "van de Beek", 25));
        users.add(new User("Aaron", " Wan-Bissaka", 24));
        users.add(new User("Luke", "Shaw", 27));
        users.add(new User("Victor", "Lindelof", 28));
        File dir = new File("myPackage//users");
        if (!dir.exists()) {
            dir.mkdirs();

        }
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User current = iterator.next();
            File file = new File(dir, current.getName() + "_" + current.getSurname() + ".txt");
            if (!file.exists()) {

                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                     ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                    oos.writeObject("User name:" + current.getName());
                    oos.writeObject("User surname:" + current.getSurname());
                    oos.writeObject("User age:" + current.getAge());
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}


