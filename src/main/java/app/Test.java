package app;

import java.sql.*;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver") ;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serviceA", "root", "misha6138") ;
        Statement stmt = conn.createStatement() ;
        String query = "select word from words where id = 1;" ;
        ResultSet rs = stmt.executeQuery(query) ;

        System.out.println(rs.next());
        System.out.println(rs.getString("word"));
    }
}

