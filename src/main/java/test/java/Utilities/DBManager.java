package test.java.Utilities;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class DBManager {

    // Info source: https://www.youtube.com/watch?v=GiNMFI8wnIg
    public static void main(String[] args){

        MongoClient client = MongoClients.create("mongodb+srv://HenB:HenB123123@cluster0.tybl6wh.mongodb.net/?retryWrites=true&w=majority");

        MongoDatabase db = client.getDatabase("MyDBCollection");

        MongoCollection<Document> col = db.getCollection("sampleCol");

//        Document sampleDoc = new Document("_id", "2").append("name", "Lior");
//
//        Document sampleDoc1 = new Document("_id", "2").append("name", "Hen");

        Document sampleDoc2 = new Document("_id", "3").append("name", "Jondi");

//        col.insertOne(sampleDoc);
//        col.insertOne(sampleDoc1);
        col.insertOne(sampleDoc2);

    }
}
