/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author dinglasamo_sd2082
 */
public class FilterHTML {

    public String removedHTML(String str) {
        str = str.replaceAll("the", "");
        return str;
    }

    public String removedCss(String str1) {

        // split text to array of words
        String[] words = str1.split("\\s");
        // frequency array
        int[] fr = new int[words.length];
        // init frequency array
        for (int i = 0; i < fr.length; i++) {
            fr[i] = 0;
        }
        // count words frequency
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {

                    fr[i]++;

                }
            }
        }

        // clean duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (i != j) {
                        words[i] = "";
                    }

                }
            }
        }

		// show the output
        int total = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if (words[i] != "") {
                list.add(words[i] + " = " + fr[i] + "\n");
                
              try
                {
                  // create a mysql database connection
                  String myDriver ="com.mysql.jdbc.Driver";
                  String myUrl = "jdbc:mysql://localhost/monica";
                  Class.forName(myDriver);
                  Connection conn = DriverManager.getConnection(myUrl, "root", "");
                  // the mysql insert statement
                  String query = " insert into countword(word,count,school)"
                    + " values (?,?,?)";
                  // create the mysql insert preparedstatement
                  PreparedStatement preparedStmt = conn.prepareStatement(query);
                  preparedStmt.setString (1,words[i]);
                  preparedStmt.setInt(2,fr[i]);
                  preparedStmt.setString (3,"USC");
                  // execute the preparedstatement
                  preparedStmt.execute();

                  conn.close();
                }
                catch (Exception e)
                {
                  System.err.println(e);

                }            

            }

        }
        
        return list.toString();

    }
}

