/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import java.sql.*;  
/**
 *
 * @author dinglasamo_sd2082
 */
public class DBConnect {


    public static void main(String args[])
    {  
    try
    {  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/monica","root","");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    String sqlString ="insert into users(name,age,role) values ('monica','20','student')";
    stmt.executeUpdate(sqlString);
    
    
    ResultSet rs=stmt.executeQuery("select * from users");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }
    catch(Exception e)
    { 
        System.out.println(e);
   }  
}  
}  

