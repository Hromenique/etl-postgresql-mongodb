package br.java.hromenique.carga.dao;

import java.net.UnknownHostException;
import java.util.List;

import br.java.hromenique.carga.doc.FormacaoDoc;

import com.google.code.morphia.query.Query;
import com.mongodb.MongoException;

public class FormacaoDocDAO extends GenericDocumentDAO<FormacaoDoc> {
	
	public FormacaoDocDAO(String database) throws UnknownHostException, MongoException{
		super(database, FormacaoDoc.class);
	}
	
	public FormacaoDocDAO (String servidor, String database) throws UnknownHostException, MongoException{
		super(servidor, database, FormacaoDoc.class);
	}
	
	public FormacaoDocDAO (String servidor, int porta, String database) throws UnknownHostException, MongoException{
		super(servidor, porta, database,FormacaoDoc.class);
	}
	
	public List<FormacaoDoc> buscarPorLattesId(String lattesId){
		Query<FormacaoDoc> query = this.getDatastore().createQuery(FormacaoDoc.class).field("lattesId").equal(lattesId);
		return query.asList();
	}
	

}
