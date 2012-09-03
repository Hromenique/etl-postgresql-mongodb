package teste.morphia;

import java.net.UnknownHostException;

import com.mongodb.MongoException;
import br.java.hromenique.carga.dao.GenericDocumentDAO;

public class TesteMorphia {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<String> dao = 
				new GenericDocumentDAO<String>("test", String.class);
		
		GenericDocumentDAO<String> dao2 = 
				new GenericDocumentDAO<String>("curriculo_teste", String.class);
	}

}
