package test.java.Utilities;

import com.mongodb.client.*;

import com.mongodb.client.model.Projections;
import org.bson.Document;
import org.bson.conversions.Bson;

public class DBManager extends Base{

    // Info source: https://www.youtube.com/watch?v=GiNMFI8wnIg
    public static FindIterable<Document> getDataFromDB(String dataType, String dataType2){

        client = MongoClients.create("mongodb+srv://HenB:HenB123123@cluster0.tybl6wh.mongodb.net/?retryWrites=true&w=majority");

        db = client.getDatabase("fbDB");

        collection = db.getCollection("FBLoginData");

        Bson projection = Projections.include(dataType, dataType2);
        FindIterable<Document> iterable = collection.find().projection(projection);

        return iterable;

//        """Add Data"""
//                Document doc = new Document("_id", "1").append("username", "yegati8771@dewareff.com")
//                .append("pass", "Lior96");
//        Document doc2 = new Document("_id", "2").append("username", "yofigi5953@dewareff.com")
//                .append("pass", "Topaz96");
//
//        collection.insertOne(doc);
//        collection.insertOne(doc2);

    }
}
