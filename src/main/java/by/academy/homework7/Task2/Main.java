package by.academy.homework7.Task2;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        User person1 = new User("Kate", "Bush", 64,
                "30.07.1958", "Catherine", "running up that hill", "KatieB@google.com");

        Class<? extends Person> userClass1 = person1.getClass();

        for (Field f : userClass1.getFields()
        ) {
            System.out.println(f);
        }
        for (Field f : userClass1.getDeclaredFields()
        ) {
            System.out.println(f);

        }
        try {
            System.out.println(userClass1.getField("password"));
        } catch (NoSuchFieldException e) {
            System.out.println("There is no field." + e);

        }
        try {
            System.out.println(userClass1.getDeclaredField("password"));
        } catch (NoSuchFieldException e) {
            System.out.println("There is no field." + e);

        }
        Field emailField = userClass1
                .getDeclaredField("email");
        emailField.setAccessible(true);

        String newEmail = "myNewEmail@mail.by";
        emailField.set(person1, newEmail);

        Field loginField = userClass1
                .getDeclaredField("login");
        loginField.setAccessible(true);

        String newLogin = "myNewLogin";
        loginField.set(person1, newLogin);

        Field passwordField = userClass1
                .getDeclaredField("password");
        passwordField.setAccessible(true);

        String newPassword = "myNewPassword";
        passwordField.set(person1, newPassword);

        try {
            Method userInfo = userClass1.getMethod("printUserInfo");
            userInfo.setAccessible(true);
            userInfo.invoke(person1);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        Field userPassword = userClass1.getDeclaredField("password");
        userPassword.setAccessible(true);
        System.out.println(userPassword.get(person1));

        Field userLogin = userClass1.getDeclaredField("login");
        userLogin.setAccessible(true);
        System.out.println(userLogin.get(person1));

        Field userEmail = userClass1.getDeclaredField("email");
        userEmail.setAccessible(true);
        System.out.println(userEmail.get(person1));


    }
}
