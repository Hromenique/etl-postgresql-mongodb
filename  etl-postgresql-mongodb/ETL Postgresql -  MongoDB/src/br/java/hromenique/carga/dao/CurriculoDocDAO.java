package br.java.hromenique.carga.dao;

import java.net.UnknownHostException;
import br.java.hromenique.carga.doc.CurriculoDoc;
import com.google.code.morphia.Datastore;
import com.mongodb.MongoException;

public class CurriculoDocDAO extends GenericDocumentDAO<CurriculoDoc> {
	
	public CurriculoDocDAO(String database, Class<CurriculoDoc> entityClass) throws UnknownHostException, MongoException{
		super(database, entityClass);
	}
	
	public CurriculoDocDAO(String servidor, String database, Class<CurriculoDoc> entityClass) throws UnknownHostException, MongoException{
		super(servidor, database, entityClass);
	}
	
	public CurriculoDocDAO(String servidor, int porta, String database, Class<CurriculoDoc> entityClass) throws UnknownHostException, MongoException{
		super(servidor, porta, database, entityClass);
	}
	
	public CurriculoDoc busca(String id){
		Datastore datastore = this.getDatastore();
		return datastore.get(CurriculoDoc.class, id);		
	}

}
