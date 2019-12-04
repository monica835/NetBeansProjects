
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
public class deletewithoutconnection {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        try {
            int id = 1;
            Instant start = Instant.now();
            System.out.println("Start time: " + start);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monica", "root", "");
//            
            for (int i = 1; i < 200; i++) {
                PreparedStatement rs = con.prepareStatement("DELETE  from tbl1000 WHERE id= " + id + "");
//                PreparedStatement rs = con.prepareStatement("insert into tbl1000 (col1, col2, col3, col4, col5)" + "values (?,?,?,?,?)");
//                rs.setInt(1, i);
//                rs.setInt(2, i + 1);
//                rs.setInt(3, i + 2);
//                rs.setInt(4, i + 3);
//                rs.setInt(5, i + 4);

                rs.executeUpdate();
                id++;
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
