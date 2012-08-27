package testes.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.FormacaoPK;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.extracao.vo.OrientacaoVO;

public class TesteConsulta {
	
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("curriculo_lattes_2");
		EntityManager entityManager = factory.createEntityManager();		
	
		CurriculoVO c = entityManager.find(CurriculoVO.class, "6414738466336890");
		System.out.println(c.getNome());
		System.out.println(c.getLattesId());
		System.out.println(c.getSexo());	
		for(OrientacaoVO o:c.getOrientacoes()){
			System.out.println(o.getOrientadorNome());
		}
		
		
		System.out.println("--------------");
		
		OrientacaoVO o = entityManager.find(OrientacaoVO.class, 1);
		System.out.println(o.getOrientadorNome());
		System.out.println(o.getCurriculo().getLattesId());
		
		
		
	}

}
