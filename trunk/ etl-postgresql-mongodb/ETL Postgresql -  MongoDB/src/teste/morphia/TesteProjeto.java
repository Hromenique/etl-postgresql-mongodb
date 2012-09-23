package teste.morphia;

import java.net.UnknownHostException;
import java.util.List;
import com.mongodb.MongoException;
import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.ProjetoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.ContadorIdPK;
import br.java.hromenique.extracao.vo.ProjetoPesquisaVO;
import br.java.hromenique.transformacao.TransformadorProjeto;

public class TesteProjeto {
	
	public static void main(String[] args) throws UnknownHostException, MongoException{
		GenericDocumentDAO<ProjetoDoc> daoDoc = new GenericDocumentDAO<ProjetoDoc>("curriculo_teste", ProjetoDoc.class);
		GenericDAO<ProjetoPesquisaVO> daoVO = new GenericDAO<ProjetoPesquisaVO>("curriculo_lattes_2", ProjetoPesquisaVO.class);		
		TransformadorProjeto transformador = new TransformadorProjeto();
		//1;"0683040763784547"
		ContadorIdPK pk = new ContadorIdPK(1, "0683040763784547");
		ContadorIdPK[] listaPK = {new ContadorIdPK(8, "0013459450420724"), new ContadorIdPK(10, "1303396760085915")};
		
		ProjetoPesquisaVO projetoPesquisaVO = daoVO.buscar(pk);
		List<ProjetoPesquisaVO> listaProjetoPesquisaVO = daoVO.buscarLista(listaPK);		
		
		ProjetoDoc projetoDoc = transformador.transforma(projetoPesquisaVO);
		List<ProjetoDoc> listaProjetoDoc = transformador.transforma(listaProjetoPesquisaVO);
		
		daoDoc.salvar(projetoDoc);
		
		for(ProjetoDoc aux : listaProjetoDoc){
			daoDoc.salvar(aux);
		}
		
	}

}
