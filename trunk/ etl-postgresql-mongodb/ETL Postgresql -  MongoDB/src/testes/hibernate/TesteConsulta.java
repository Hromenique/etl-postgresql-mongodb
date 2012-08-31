package testes.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.java.hromenique.extracao.vo.AreaAtuacaoVO;
import br.java.hromenique.extracao.vo.AutorPublicacaoPK;
import br.java.hromenique.extracao.vo.AutorPublicacaoVO;
import br.java.hromenique.extracao.vo.ContadorIdPK;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.extracao.vo.OrientacaoVO;

public class TesteConsulta {
	
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("curriculo_lattes_2");
		EntityManager entityManager = factory.createEntityManager();		
	
		AutorPublicacaoPK chave = new AutorPublicacaoPK(1, 30);
		AutorPublicacaoVO ap = entityManager.find(AutorPublicacaoVO.class, chave);
		
		System.out.println(ap.getAutorNome());
		System.out.println(ap.getAutorLattesId());
		
		
		
		
		
		
		//CurriculoVO c = entityManager.find(CurriculoVO.class, "6414738466336890");
		//ContadorIdPK chave = new ContadorIdPK(2, "6414738466336890");
		//AreaAtuacaoVO areaAtuacaoVO = entityManager.find(AreaAtuacaoVO.class, chave);
		//System.out.println(areaAtuacaoVO.getArea());
		//System.out.println(areaAtuacaoVO.getEspecialidade());
		//System.out.println(areaAtuacaoVO.getGrandeArea());
		
		
		
	}

}
