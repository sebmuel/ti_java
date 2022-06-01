package konto;

import konto.model.LoginModel;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        LoginModel t = new LoginModel();
        t.login("seb", "Hallodu123");
    }
}
