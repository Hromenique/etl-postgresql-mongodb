package teste.morphia;

import java.net.UnknownHostException;
import java.util.List;
import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.OrientacaoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.OrientacaoVO;
import br.java.hromenique.transformacao.TransformadorOrientacao;

import com.mongodb.MongoException;

public class TesteOrientacao {
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<OrientacaoDoc> daoDoc = new GenericDocumentDAO<OrientacaoDoc>("curriculo_teste", OrientacaoDoc.class);
		GenericDAO<OrientacaoVO> daoVO = new GenericDAO<OrientacaoVO>("curriculo_lattes_2", OrientacaoVO.class);		
		TransformadorOrientacao transformador = new TransformadorOrientacao();
		
		OrientacaoVO vo = daoVO.buscar(37);
		Integer[] listaPK = {40, 41, 42};
		List<OrientacaoVO> lsitaVO = daoVO.buscarLista(listaPK);
		
		OrientacaoDoc orientacaoDoc = transformador.transforma(vo);
		List<OrientacaoDoc> listaOrientacoes = transformador.transforma(lsitaVO);
		
		daoDoc.salvar(orientacaoDoc);
		
		for(OrientacaoDoc aux : listaOrientacoes){
			daoDoc.salvar(aux);
		}		
		
	}

}
