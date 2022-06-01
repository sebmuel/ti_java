package konto.model;

import konto.classes.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginModel extends conn{
    private User user;

    public boolean login(String username, String password) throws SQLException {
        initConnection();
        String query = String.format("SELECT * FROM users WHERE username LIKE \"%s\"", username);
        System.out.println(query);
        Statement statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        if (resultSet.next()){
            System.out.println("NO");
        };
        while(resultSet.next()){
            System.out.println(resultSet.getString("username"));
        }
        return true;
    }
}
