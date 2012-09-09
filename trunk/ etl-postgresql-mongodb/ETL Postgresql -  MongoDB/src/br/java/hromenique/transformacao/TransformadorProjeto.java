package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;

import br.java.hromenique.carga.doc.AlunosEnvolvidosProjetoDoc;
import br.java.hromenique.carga.doc.FinanciadorDoc;
import br.java.hromenique.carga.doc.ProjetoDoc;
import br.java.hromenique.extracao.vo.CoordenadorProjetoVO;
import br.java.hromenique.extracao.vo.IntegranteProjetoVO;
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
		documento.setDescricao(entidade.getDescricao().getDescricao());
		documento.setSituacao(entidade.getSituacao());
		documento.setNatureza(entidade.getNatureza());
		documento.setAlunosEnvolvidos(gerarAlunosEnvolvidos(entidade.getAlunosEnvolvidos()));
		documento.setNomesIntegrantes(gerarListaNomes(entidade.getIntegrantes()));
		
		//LattesId dos Integrantes
		if(entidade.getCurriculosIntegrantes() != null){
			List<String> lattesIdIntegrantes = new ArrayList<String>();
			
			for(IntegranteProjetoVO vo : entidade.getCurriculosIntegrantes()){				
				if(vo.getIntegranteLattesId() != null){
					lattesIdIntegrantes.add(vo.getIntegranteLattesId());
				}
			}
			
			documento.setLattesIdIntegrantes(lattesIdIntegrantes);			
		}
		
		documento.setNomeCoordenadores(gerarListaNomes(entidade.getCoordenadores()));
		
		//LattesId dos Coordenadores
		if (entidade.getCurriculosCoordenadores() != null) {
			List<String> lattesIdIntegrantes = new ArrayList<String>();

			for (CoordenadorProjetoVO vo : entidade.getCurriculosCoordenadores()) {
				if(vo.getIntegrantelattesId()!= null){
					lattesIdIntegrantes.add(vo.getIntegrantelattesId());
				}
			}

			documento.setLattesIdCoordenadores(lattesIdIntegrantes);
		}
		
		documento.setFinanciadores(gerarFinanciadores(entidade.getFinanciadores()));
		documento.setNumeroDeOrientacoes(entidade.getNumeroDeOrientacoes());
		documento.setNumeroDeProducoesCTA(entidade.getNumeroDeProducoesCTA());
		
		return documento;
	}
	
	@Override
	public List<ProjetoDoc> transforma(List<ProjetoPesquisaVO> entidades) {
		
		List<ProjetoDoc> documentos = new ArrayList<ProjetoDoc>();
		for(ProjetoPesquisaVO vo : entidades){
			documentos.add(transforma(vo));
		}
		
		return documentos;
	}
	
	
	private List<AlunosEnvolvidosProjetoDoc> gerarAlunosEnvolvidos(String alunosEnvolvidos){
		
		if(alunosEnvolvidos == null){
			return null;
		}
		
		if(alunosEnvolvidos.endsWith("''") || alunosEnvolvidos.equals("")){ 
			return null;
		}		
		
		List<AlunosEnvolvidosProjetoDoc> alunosEnvolvidosProjeto = new ArrayList<AlunosEnvolvidosProjetoDoc>();
		
		//Dividir string em listas de 'tipo (quantidade)'
		String[] listaStr = alunosEnvolvidos.split("/");
		
		for (String aux : listaStr) {			
			String[] strs = aux.split("\\(");			
			// Extração da quantidade
			String quantidade = strs[1].replaceAll("\\)", "").replace(" ", "");
			// Extração do tipo
			String tipo = strs[0].trim();
			alunosEnvolvidosProjeto.add(new AlunosEnvolvidosProjetoDoc(tipo, quantidade));
		}		
		return alunosEnvolvidosProjeto;
	}
	
	private List<String> gerarListaNomes(String strlistaNomes){
		if(strlistaNomes == null){
			return null;
		}		
		return Arrays.asList(strlistaNomes.split(" ; "));	
	}
	
	
	//"Conselho Nacional de Desenvolvimento Científico e Tecnológico - Bolsa / Conselho Nacional de Desenvolvimento Científico e Tecnológico - Auxílio financeiro"
	public List<FinanciadorDoc> gerarFinanciadores(String strFinanciadores){
		List<FinanciadorDoc> financiadores = new ArrayList<FinanciadorDoc>();
		
		if(strFinanciadores == null){
			return null;
		}
		
		if(strFinanciadores.equals("''") || strFinanciadores.equals("")){
			return null;
		}		
		
		//split para gerar lista de financiadores		
		for(String aux : strFinanciadores.split("/")){
			//Extrair nome instituição
			String nome = aux.split("-")[0].trim();
			
			//Extrair tipo do auxílio
			String auxilio = aux.split("-")[1].trim();
			
			financiadores.add(new FinanciadorDoc(nome, auxilio));			
		}
		
		return financiadores;		
	}

}
