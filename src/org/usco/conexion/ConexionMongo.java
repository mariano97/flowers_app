package org.usco.conexion;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class ConexionMongo {
	
	
	
	public ConexionMongo() {
	
		url = "mongodb://localhost:27017";
		dbName = "mediciones";
		
		
	}
	
	public DB getConexion(){
		
		MongoClientURI uri = new MongoClientURI(url);
		
		MongoClient mongoClient = new MongoClient(uri);
		
		DB bd = mongoClient.getDB(dbName);
		
		return bd;
		
	}
	private final String url;
	private final String dbName;

}
