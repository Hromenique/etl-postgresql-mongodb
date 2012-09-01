package testes.hibernate;

import java.util.List;

import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.NomeVO;
import br.java.hromenique.extracao.vo.OrientacaoVO;

public class TesteGenericDAO {
	
	public static void main(String[] args){
		GenericDAO<NomeVO> dao = new GenericDAO<NomeVO>("curriculo_lattes_2", NomeVO.class);	

		List<NomeVO> lista = dao.buscarTodos();
		for(NomeVO n : lista){
			System.out.println(n.getNomePadrao()+ " : "+n.getNomeUsado());
		}
	}

}
