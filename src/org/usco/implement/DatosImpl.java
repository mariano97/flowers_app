package org.usco.implement;

import org.usco.conexion.ConexionMongo;
import org.usco.dao.DatosDAO;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

public class DatosImpl implements DatosDAO{

	@Override
	public void insertar(BasicDBObject dato) {
		
		ConexionMongo conexion = new ConexionMongo();
		
		DBCollection collection = conexion.getConexion().getCollection("dato");
		
		collection.insert(dato);
		
	}

}
