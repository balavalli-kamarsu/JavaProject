package com.Database;

import java.sql.*;

public class ScrollableResultSetExample {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
      /*  try {
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql:thin//localhost:54320/eca", "user", "user");
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from login");
            rs.last();
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
            rs.first();
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
            rs.absolute(3);
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
            rs.absolute(-1);
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
            con.close();
        }
        catch(SQLException se){

        }*/
    }
}
