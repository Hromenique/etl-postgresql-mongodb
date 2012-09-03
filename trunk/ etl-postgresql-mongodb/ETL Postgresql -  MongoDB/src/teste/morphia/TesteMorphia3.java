package teste.morphia;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;

import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.AreaAtuacaoDoc;
import br.java.hromenique.carga.doc.CurriculoDoc;

import com.mongodb.MongoException;

public class TesteMorphia3 {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<CurriculoDoc> dao = new GenericDocumentDAO<CurriculoDoc>("curriculo_teste", CurriculoDoc.class);
		
		CurriculoDoc c = new CurriculoDoc();
		String[] atuacoes = {"USP", "PUC"};
		ObjectId[] formacoes = {new ObjectId(), new ObjectId()};
		Integer[]orientacoes = {1,2,3,7,8};
		
		c.setAtuacoes(Arrays.asList(atuacoes));
		c.setFormacoes(Arrays.asList(formacoes));
		c.setOrientacoes(Arrays.asList(orientacoes));
		c.setId("6411463");
		c.setNome("Hromenique Cezniowscki Leite Batista");
		c.setSexo('M');
		
		List<AreaAtuacaoDoc>areasAtuacao = new ArrayList<AreaAtuacaoDoc>();
		areasAtuacao.add(new AreaAtuacaoDoc("Ciências", "Informática", "Linguagens de programação", "Java"));
		areasAtuacao.add(new AreaAtuacaoDoc("Ciências", "Engenharia", null, null));
		c.setAreasAtuacao(areasAtuacao);
		
		dao.salvar(c);
	}

}
