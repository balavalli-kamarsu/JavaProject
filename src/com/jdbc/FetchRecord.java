package com.Database;

import java.sql.*;

public class FetchRecord {
    public static void main(String[] args)throws Exception{
        Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:54320/eca", "user", "user");
        Statement stmt=con.createStatement();

        int result =stmt.executeUpdate("insert into login values('siva','harika')");
        System.out.println(result+" records affected");
        int result1=stmt.executeUpdate("update login set password='Vimal' where username='siva'");
        System.out.println(result1+" records affected");
          int result2=stmt.executeUpdate("delete from login where username='siva'");
        System.out.println(result2+" records affected");
        con.close();
    }
}
