package teste.morphia;

import java.net.UnknownHostException;
import java.util.List;

import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.PublicacaoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.PublicacaoVO;
import br.java.hromenique.transformacao.TransformadorPublicacao;

import com.mongodb.MongoException;

public class TestePublicacao  {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<PublicacaoDoc> daoDoc = new GenericDocumentDAO<PublicacaoDoc>("curriculo_teste", PublicacaoDoc.class);
		GenericDAO<PublicacaoVO> daoVO = new GenericDAO<PublicacaoVO>("curriculo_lattes_2", PublicacaoVO.class);		
		TransformadorPublicacao transformador = new TransformadorPublicacao();
		
		PublicacaoVO publicacaoVO = daoVO.buscar(30);
		Integer[] listaPK = {33,34,35,54};
		List<PublicacaoVO> listaPublicacaoVO = daoVO.buscarLista(listaPK);
		
		PublicacaoDoc publicacaoDoc = transformador.transforma(publicacaoVO);
		List<PublicacaoDoc> listaPublicacaoDoc = transformador.transforma(listaPublicacaoVO);
		
		daoDoc.salvar(publicacaoDoc);
		
		for(PublicacaoDoc doc : listaPublicacaoDoc){
			daoDoc.salvar(doc);
		}
		
	}

}
