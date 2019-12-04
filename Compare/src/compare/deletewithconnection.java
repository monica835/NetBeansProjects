/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author dinglasamo_sd2082
 */
public class deletewithconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
       Instant s = Instant.now();
        System.out.println("Start time: " + s);
        int id=1;
        for (int i = 1; i < 201; i++) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monica", "root", "");
                PreparedStatement rs = con.prepareStatement("DELETE  from tbl1000 WHERE id= " + id + "");
//                PreparedStatement rs = con.prepareStatement("insert into tbl1000 (col1, col2, col3, col4, col5)" + "values (?,?,?,?,?)");
//                rs.setInt(1, i);
//                rs.setInt(2, i + 1);
//                rs.setInt(3, i + 2);
//                rs.setInt(4, i + 3);
//                rs.setInt(5, i + 4);

                rs.executeUpdate();
                id++;
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Instant e = Instant.now();
        System.out.println("End Time : " + e);
        Duration timeDifference = Duration.between(s, e);
        System.out.println("Time taken: " + timeDifference.getSeconds() + " seconds");
    }

    
}