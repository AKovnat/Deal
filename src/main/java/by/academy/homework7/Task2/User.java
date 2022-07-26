package by.academy.homework7.Task2;

public class User extends Person{
    private String login;
    private String password;
    private String email;

    public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
                String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("Person name: " + getFirstName() + "\n" + "Person lastName: " + getLastName() + "\n"
                + "Person age: " + getAge() + "\n" + "Person date of Birth: " + getDateOfBirth() + "\n"
                + "Person email: " + getEmail() + "\n" + "Person password: " + getPassword() + "\n"
                + "Person login: " + getLogin());
    }
}

