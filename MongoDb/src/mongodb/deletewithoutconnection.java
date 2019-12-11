/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dinglasamo_sd2082
 */
public class deletewithoutconnection {

    public static void main(String args[]) {
        Instant start = Instant.now();
        System.out.println("Start time: " + start);
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("MonicaDB");
        DBCollection collection = db.getCollection("MongoWithoutConnectoion");
        try {

            for (int i = 1; i < 1001; i++) {
                BasicDBObject remove1000 = new BasicDBObject("col1", i);
                collection.remove(remove1000);
                System.out.println("Suuccessfully deleted!");

            }
            Instant exit = Instant.now();//exit time
            System.out.println("End Time : " + exit);
            Duration timeDifference = Duration.between(start, exit);
            System.out.println("Time taken: " + timeDifference.getSeconds() + " seconds");
        } catch (SecurityException e) {
            System.out.println("Error connecting to database!");
        }
    }

}
