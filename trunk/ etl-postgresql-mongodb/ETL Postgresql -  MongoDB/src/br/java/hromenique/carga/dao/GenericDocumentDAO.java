package br.java.hromenique.carga.dao;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class GenericDocumentDAO<T> {
	
	//representa um DAO (ou ligação) com o MongoDB
	private Datastore datastore;
	private Class<T> entityClass;
	
	public GenericDocumentDAO(String database, Class<T> entityClass) throws UnknownHostException, MongoException{
		Mongo mongo = new Mongo();
		Morphia morphia = new Morphia();
		this.datastore = morphia.createDatastore(mongo, database);
		this.entityClass = entityClass;		
	}
	
	public GenericDocumentDAO(String servidor, String database, Class<T> entityClass) throws UnknownHostException, MongoException{
		Mongo mongo = new Mongo(servidor);
		Morphia morphia = new Morphia();
		this.datastore = morphia.createDatastore(mongo, database);
		this.entityClass = entityClass;		
	}	
	
	
	public GenericDocumentDAO(String servidor, int porta, String database, Class<T> entityClass) throws UnknownHostException, MongoException{
		Mongo mongo = new Mongo(servidor, porta);
		Morphia morphia = new Morphia();
		this.datastore = morphia.createDatastore(mongo, database);
		this.entityClass = entityClass;
	}
	
	public void salvar(T documento){
		this.datastore.save(documento);
	}
	
	
	
	
	
	

}
