/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbconnection;
import java.sql.*;  
import java.sql.Driver;
/**
 *
 * @author dinglasamo_sd2082
 */
public class DBConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    {  
    try
    {  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://172.16.3.17/monica","christian","guapo");  
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
}      // TODO code application logic here
}
    
}
