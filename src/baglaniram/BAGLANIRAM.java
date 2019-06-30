package baglaniram;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BAGLANIRAM {
    public static void main(String[] args) {
        try {
            // 1. Connection to DB
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadproject", "root", "AA12345aa!");

            // 2. Create statement
            Statement myStmt = (Statement) myConn.createStatement();

            // 1. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM test;");

            // 1. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
