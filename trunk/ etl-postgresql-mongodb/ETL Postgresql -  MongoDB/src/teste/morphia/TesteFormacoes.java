package teste.morphia;

import java.net.UnknownHostException;

import com.mongodb.MongoException;

import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.FormacaoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.transformacao.TransformadorCurriculo;

public class TesteFormacoes {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<FormacaoDoc> daoDoc = new GenericDocumentDAO<FormacaoDoc>("curriculo_teste", FormacaoDoc.class);
		GenericDAO<FormacaoVO> daoVO = new GenericDAO<FormacaoVO>("curriculo_lattes_2", FormacaoVO.class);		
		TransformadorCurriculo transformadorCurriculo = new TransformadorCurriculo();
		
	}

}
