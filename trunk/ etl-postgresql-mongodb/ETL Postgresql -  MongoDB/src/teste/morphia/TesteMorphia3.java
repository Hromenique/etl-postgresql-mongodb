package teste.morphia;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;

import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.AreaAtuacaoDoc;
import br.java.hromenique.carga.doc.CurriculoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.transformacao.TransformadorCurriculo;

import com.mongodb.MongoException;

public class TesteMorphia3 {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<CurriculoDoc> daoDoc = new GenericDocumentDAO<CurriculoDoc>("curriculo_teste", CurriculoDoc.class);
		GenericDAO<CurriculoVO> daoVO = new GenericDAO<CurriculoVO>("curriculo_lattes_2", CurriculoVO.class);
		TransformadorCurriculo transformadorCurriculo = new TransformadorCurriculo();
		
		CurriculoVO vo = daoVO.buscar("6414738466336890");
		
		CurriculoDoc doc = transformadorCurriculo.transforma(vo);
		daoDoc.salvar(doc);
		/*
		CurriculoDoc c = new CurriculoDoc();
		String[] atuacoes = {"USP", "PUC"};
		ObjectId[] formacoes = {new ObjectId(), new ObjectId()};
		Integer[]orientacoes = {1,2,3,7,8};
		
		c.setAtuacoes(Arrays.asList(atuacoes));
		c.setFormacoes(Arrays.asList(formacoes));
		c.setOrientacoes(Arrays.asList(orientacoes));
		c.setId("404628813");
		c.setNome("Hromenique Cezniowscki Leite Batista");
		c.setSexo('M');
		
		//List<AreaAtuacaoDoc>areasAtuacao = new ArrayList<AreaAtuacaoDoc>();
		//areasAtuacao.add(new AreaAtuacaoDoc("Ciências", "Informática", "Linguagens de programação", "Java"));
		//areasAtuacao.add(new AreaAtuacaoDoc("Ciências", "Engenharia", null, null));
		//c.setAreasAtuacao(areasAtuacao);
		
		dao.salvar(c);*/
	}

}
