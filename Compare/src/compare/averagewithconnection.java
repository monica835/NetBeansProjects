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
public class averagewithconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Instant start = Instant.now();
        System.out.println("Start time: " + start);
        for (int i = 1; i < 201; i++) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monica", "root", "");
//                PreparedStatement rs = con.prepareStatement("SELECT AVG(col2) FROM tbl1000");         
//                rs.executeQuery();
//                con.close();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select avg(col1) from tbl1000");
                if (rs.next()) {
                    System.out.println("avg temp is " + rs.getFloat(1));
                }
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
