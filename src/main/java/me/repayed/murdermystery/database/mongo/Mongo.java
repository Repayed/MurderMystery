package me.repayed.murdermystery.database.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import me.repayed.murdermystery.MurderMystery;
import me.repayed.murdermystery.database.IDatabase;

public class Mongo implements IDatabase {

    private String username;
    private String password;
    private String host;

    private String connection;

    private MongoClient mongoClient;
    private MongoDatabase database;

    public Mongo(final MurderMystery murderMystery) {
        this.username = murderMystery.getConfig().getString("database.username");
        this.password = murderMystery.getConfig().getString("database.password");
        this.host = murderMystery.getConfig().getString("database.host");

        this.connection = "mongodb://" + username + password + "@" + host;

        this.mongoClient = new MongoClient(connection);

        this.database = mongoClient.getDatabase("mystery");
        MongoCollection mongoCollection = database.getCollection("profiles");

        System.out.println("Connected to database.");
        System.out.println(mongoCollection.countDocuments());

//        this.mongoClient = new MongoClient(host);
//        this.database = this.mongoClient.getDatabase(name);

    }

    @Override
    public void connect() {

    }

    @Override
    public void disconnect() {

    }
}
