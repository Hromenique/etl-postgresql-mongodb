package teste.morphia;

import java.net.UnknownHostException;
import java.util.List;

import br.java.hromenique.carga.dao.CurriculoDocDAO;
import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.CurriculoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.transformacao.TransformadorCurriculo;
import com.mongodb.MongoException;

public class TesteCurriculo {
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<CurriculoDoc> daoDoc = new GenericDocumentDAO<CurriculoDoc>("curriculo_teste", CurriculoDoc.class);
		GenericDAO<CurriculoVO> daoVO = new GenericDAO<CurriculoVO>("curriculo_lattes_2", CurriculoVO.class);		
		TransformadorCurriculo transformadorCurriculo = new TransformadorCurriculo();
		
		CurriculoVO vo = daoVO.buscar("6414738466336890");
		
		CurriculoDoc doc = transformadorCurriculo.transforma(vo);
		daoDoc.salvar(doc);
		CurriculoDoc curriculoDoc = daoDoc.buscar("6414738466336890");
		
		//"7010253429098301" e "2898143640207628"
		
		String[] lattesId = {"7010253429098301","2898143640207628"};
		List<CurriculoVO> listaVO = daoVO.buscarLista(lattesId);
		
		List<CurriculoDoc> listaDoc = transformadorCurriculo.transforma(listaVO);
		
		for(CurriculoDoc docAux : listaDoc){
			daoDoc.salvar(docAux);
		}
		
	}

}
