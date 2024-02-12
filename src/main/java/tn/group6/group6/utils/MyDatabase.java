package tn.group6.group6.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabase {
    private static MyDatabase instance;
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String URL = "jdbc:mysql://localhost:3306/group6";
    private Connection cnx;
    private MyDatabase(){
        try {
            cnx = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("DB Connected!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
    public static MyDatabase getInstance() {

        if(instance == null)
            instance = new MyDatabase();
        return instance;
    }
    public Connection getCnx() {
        return cnx;
    }

    public static class getInstance extends MyDatabase {
    }
}
