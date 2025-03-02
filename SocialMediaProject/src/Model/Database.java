package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Database {

    public String user = "root";
    public String pass = "";
    //private String url = "jdbc:mysql://localhost:3306/socialmedia?useSSL=false&serverTimezone=UTC";
    private String url = "jdbc:mysql://localhost:3306/socialmedia";

    private Statement statement;

    public Database() {

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Statement getStatement() {
        return statement;
    }

}
