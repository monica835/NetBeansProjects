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
public class Compare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Instant start = Instant.now();
        System.out.println("Start time: " + start);
        for (int i = 1; i <1001; i++) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monica", "root", "");

                PreparedStatement rs = con.prepareStatement("insert into tbl1000 (col1, col2, col3, col4, col5)" + "values (?,?,?,?,?)");
                rs.setInt(1, i);
                rs.setInt(2, i + 1);
                rs.setInt(3, i + 2);
                rs.setInt(4, i + 3);
                rs.setInt(5, i + 4);

                rs.executeUpdate();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Instant exit = Instant.now();
        System.out.println("End Time : " + exit);
        Duration timeDifference = Duration.between(start, exit);
        System.out.println("Total time: " + timeDifference.getSeconds() + " seconds");
    }

}
