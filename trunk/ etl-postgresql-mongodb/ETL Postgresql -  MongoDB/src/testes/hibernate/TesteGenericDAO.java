package testes.hibernate;

import java.util.List;

import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.ContadorIdPK;
import br.java.hromenique.extracao.vo.CoordenadorProjetoVO;
import br.java.hromenique.extracao.vo.IntegranteProjetoPK;
import br.java.hromenique.extracao.vo.IntegranteProjetoVO;
import br.java.hromenique.extracao.vo.NomeCitacaoPK;
import br.java.hromenique.extracao.vo.PublicacaoPeriodicoVO;

public class TesteGenericDAO {

	public static void main(String[] args) {
		GenericDAO<PublicacaoPeriodicoVO> dao = new GenericDAO<PublicacaoPeriodicoVO>(
				"curriculo_lattes_2", PublicacaoPeriodicoVO.class);
		 //ContadorIdPK chave = new ContadorIdPK(3,"6414738466336890");//3;"6414738466336890"
		// AutorPublicacaoPK chave = new AutorPublicacaoPK(2, 30);
		//IntegranteProjetoPK chave = new IntegranteProjetoPK(3,2,"6414738466336890");
		//String chave = "6414738466336890";
		//NomeCitacaoPK chave = new NomeCitacaoPK("6414738466336890", "CHAIM, Marcos Lordello");
		Integer chave = 35;

		PublicacaoPeriodicoVO obj = dao.buscar(chave);		
	
		List<PublicacaoPeriodicoVO> lista = dao.buscarTodos();
		for (PublicacaoPeriodicoVO aux : lista) {
			System.out.println(aux.getNomePeriodico());
		}
	}

}
