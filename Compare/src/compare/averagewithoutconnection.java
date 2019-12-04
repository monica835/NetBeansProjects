/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author dinglasamo_sd2082
 */
public class averagewithoutconnection {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int id = 1;
            Instant start = Instant.now();
            System.out.println("Star"
                    + " time: " + start);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monica", "root", "");         
            for (int i = 1; i < 1001; i++) {
                Statement stmt=con.createStatement();  
                ResultSet rs = stmt.executeQuery("select avg(col1) from tbl1000");
                if (rs.next()) {
                    System.out.println("avg temp is " + rs.getFloat(1));
                }
            }
            con.close();
            Instant exit = Instant.now();//exit time
            System.out.println("End Time : " + exit);
            Duration timeDifference = Duration.between(start, exit);
            System.out.println("Time taken: " + timeDifference.getSeconds() + " seconds");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
