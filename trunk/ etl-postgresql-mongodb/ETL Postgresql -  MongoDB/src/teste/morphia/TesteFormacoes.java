package teste.morphia;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoException;

import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.FormacaoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.ContadorIdPK;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.transformacao.TransformadorCurriculo;
import br.java.hromenique.transformacao.TransformadorFormacao;

public class TesteFormacoes {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<FormacaoDoc> daoDoc = new GenericDocumentDAO<FormacaoDoc>("curriculo_teste", FormacaoDoc.class);
		GenericDAO<FormacaoVO> daoVO = new GenericDAO<FormacaoVO>("curriculo_lattes_2", FormacaoVO.class);		
		TransformadorFormacao transformador = new TransformadorFormacao();
		
		ContadorIdPK pk = new ContadorIdPK(1, "6414738466336890");
		FormacaoVO vo = daoVO.buscar(pk);
		
		FormacaoDoc formacaoDoc = transformador.transforma(vo);
		
		ContadorIdPK[] listaPK = {new ContadorIdPK(2, "6414738466336890"), new ContadorIdPK(3, "6414738466336890")};
		List<FormacaoVO> listaVO = daoVO.buscarLista(listaPK);
		
		List<FormacaoDoc> listaFormacaoDoc = transformador.transforma(listaVO);
		
		daoDoc.salvar(formacaoDoc);
		for(FormacaoDoc aux : listaFormacaoDoc){
			daoDoc.salvar(aux);
		}		
	}

}
