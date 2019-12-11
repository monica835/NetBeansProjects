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
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.connection.Connection;
import java.sql.DriverManager;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author dinglasamo_sd2082
 */
public class MongoDb {

    public static void main(String args[]) {

        Instant start = Instant.now();
        System.out.println("Start time: " + start);
        for (int i = 1; i < 201; i++) {
            try {
                Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
                mongoLogger.setLevel(Level.SEVERE);
                MongoClient mongoClient = new MongoClient("localhost", 27017);
                DB db = mongoClient.getDB("MonicaDB");
                DBCollection collection = db.getCollection("MongoDBWithConnection");
                BasicDBObject add200 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(add200);
                System.out.println("Inserted!");
                mongoClient.close();
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
