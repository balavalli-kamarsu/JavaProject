package com.Database;

import java.sql.*;

public class ResultSetMetaDataExample {
    public static void main(String[] args){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:54320/eca", "user", "user");
            PreparedStatement ps=con.prepareStatement("select * from login");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
