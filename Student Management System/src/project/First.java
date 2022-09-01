package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.*;
public class First {
    public static void main(String[] args) {
        try{
        //Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","1801029");
      
       //Statement st=conn.createStatement();
        Statement st1=conn.createStatement();
        Statement st2=conn.createStatement();
      // ResultSet rs=st.executeQuery("select *from department");
       ResultSet rs1=st1.executeQuery("select *from student1");
        ResultSet rs2=st2.executeQuery("select *from saving2");
       /*while(rs.next())
       {
    	   System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
       } */
       while(rs1.next())
       {
    	   System.out.println(rs1.getString(1)+"  "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));
       }
        while(rs2.next())
       {
    	   System.out.println(rs2.getString(1)+"  "+rs2.getString(2)+" "+rs2.getString(3));
       }
      // st.close();
       st1.close();
       st2.close();
       conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
}
