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
public class DeleteWithConnection {

    public static void main(String args[]) {
        try {
            int id = 1;
            Instant start = Instant.now();
            System.out.println("Start time: " + start);

            for (int i = 1; i < 200; i++) {
                Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
                mongoLogger.setLevel(Level.SEVERE);
                MongoClient mongoClient = new MongoClient("localhost", 27017);
                DB db = mongoClient.getDB("MonicaDB");
                DBCollection collection = db.getCollection("WithConnection");
                BasicDBObject remove = new BasicDBObject("col1", i);
                System.out.println("Suuccessfully deleted!");
                collection.remove(remove);
                mongoClient.close();
            }

            Instant exit = Instant.now();//exit time
            System.out.println("End Time : " + exit);
            Duration timeDifference = Duration.between(start, exit);
            System.out.println("Time taken: " + timeDifference.getSeconds() + " seconds");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
