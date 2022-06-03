package Kontoverwaltung.classes;

public class User {
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String username;
    private int logginAttemps;
    public User(String username, String firstname, String lastName, String password, int logginAttemps){
        this.username = username;
        this.firstName = firstname;
        this.lastName = lastName;
        this.passwordHash = password;
        this.logginAttemps = logginAttemps;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPasswordHash() {
        return passwordHash;
    }
    public String getUsername(){
        return username;
    }
    public int getLogginAttemps() {
        return logginAttemps;
    }
    public void setLogginAttemps(int logginAttemps) {
        this.logginAttemps = logginAttemps;
    }
}
