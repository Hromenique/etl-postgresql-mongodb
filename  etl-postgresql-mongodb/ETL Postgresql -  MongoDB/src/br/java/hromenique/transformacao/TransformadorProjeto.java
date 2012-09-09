package br.java.hromenique.transformacao;

import java.util.List;

import org.bson.types.ObjectId;

import br.java.hromenique.carga.doc.AlunosEnvolvidosProjetoDoc;
import br.java.hromenique.carga.doc.ProjetoDoc;
import br.java.hromenique.extracao.vo.ProjetoPesquisaVO;

public class TransformadorProjeto implements TransformadorInterface<ProjetoPesquisaVO, ProjetoDoc> {
	
	public TransformadorProjeto(){
		
	}
	
	@Override
	public ProjetoDoc transforma(ProjetoPesquisaVO entidade) {
		ProjetoDoc documento = new ProjetoDoc();
		documento.setId(new ObjectId());
		documento.setLattesId(entidade.getLattesId());
		documento.setPeriodo(entidade.getPeriodo());
		documento.setInicio(entidade.getInicio());
		documento.setFim(entidade.getFim());
		documento.setTitulo(entidade.getTitulo());
		documento.setSituacao(entidade.getSituacao());
		documento.setNatureza(entidade.getNatureza());
		
		return null;
	}
	
	@Override
	public List<ProjetoDoc> transforma(List<ProjetoPesquisaVO> entidades) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<AlunosEnvolvidosProjetoDoc> gerarAlunosEnvolvidos(String alunosEnvolvidos){
		ListAlunosEnvolvidosProjetoDoc alunosEnvolvidosProjeto
		
		String str = alunosEnvolvidos.replaceAll(" ", "");
		String[] listaStr = str.split("/");
		
		for(String aux : listaStr){
			String strQuantidade = aux.split("(")[1];
			strQuantidade = strQuantidade.replaceAll(")", "");
			Integer quantidade = new Integer(strQuantidade);
			
			String tipo = aux.split("(")[0];
			
			AlunosEnvolvidosProjetoDoc
			
			
			
		}
		
		
		return null;
	}

}
