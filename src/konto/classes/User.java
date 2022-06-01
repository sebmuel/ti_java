package konto.classes;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstname, String lastName){
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
