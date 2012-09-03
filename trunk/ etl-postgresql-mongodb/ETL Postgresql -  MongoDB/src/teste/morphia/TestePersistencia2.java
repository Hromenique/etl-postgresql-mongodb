package teste.morphia;

import java.net.UnknownHostException;

import br.java.hromenique.carga.dao.GenericDocumentDAO;

import com.mongodb.MongoException;

public class TestePersistencia2 {
	public static void main(String[] args) throws UnknownHostException,	MongoException {
		GenericDocumentDAO<Estado> daoEstado = new GenericDocumentDAO<Estado>("curriculo_teste", Estado.class);
		
		GenericDocumentDAO<Cidade> daoCidade = new GenericDocumentDAO<Cidade>("curriculo_teste", Cidade.class);
		
		Estado e = new Estado("RJ", "Rio de Janeiro");
		e.id = 1;
		
		Cidade c = new Cidade("Copacabana", e);
		c.id = 2;
		c.estados = 1;
		
		
		daoEstado.salvar(e);
		daoCidade.salvar(c);

		
	}

}
