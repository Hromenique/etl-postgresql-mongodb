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
		
		//Descri��o
		if(entidade.getDescricao() != null){
			documento.setDescricao(entidade.getDescricao().getDescricao());
		}
		
		documento.setSituacao(entidade.getSituacao());
		documento.setNatureza(entidade.getNatureza());
		documento.setAlunosEnvolvidos(gerarAlunosEnvolvidos(entidade.getAlunosEnvolvidos(), documento.getId()));
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
		
		documento.setFinanciadores(gerarFinanciadores(entidade.getFinanciadores(), documento.getId()));
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
	
	
	private List<AlunosEnvolvidosProjetoDoc> gerarAlunosEnvolvidos(String alunosEnvolvidos, ObjectId id){
		
		if(alunosEnvolvidos == null){
			return null;
		}
		
		if(alunosEnvolvidos.equals("''") || alunosEnvolvidos.trim().equals("")){ 
			return null;
		}		
		
		List<AlunosEnvolvidosProjetoDoc> alunosEnvolvidosProjeto = new ArrayList<AlunosEnvolvidosProjetoDoc>();
		
		//Dividir string em listas de 'tipo (quantidade)'
		String[] listaStr = alunosEnvolvidos.split("/");
		
		for (String aux : listaStr) {	
			try{
				String[] strs = aux.split("\\(");			
				// Extra��o da quantidade
				String quantidade = strs[1].replaceAll("\\)", "").replace(" ", "");
				// Extra��o do tipo
				String tipo = strs[0].trim();
				alunosEnvolvidosProjeto.add(new AlunosEnvolvidosProjetoDoc(tipo, quantidade));
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Em Projetos, ID: "+id.toString()+". Em alunosEnvolvidos, ocorreu um erro de sintaxe em: "+aux);	
				alunosEnvolvidosProjeto.add(new AlunosEnvolvidosProjetoDoc(aux, null));
			}
		}
		
		return alunosEnvolvidosProjeto;
	}
	
	private List<String> gerarListaNomes(String strlistaNomes){
		if(strlistaNomes == null){
			return null;
		}		
		return Arrays.asList(strlistaNomes.split(" ; "));	
	}
	
	
	//"Conselho Nacional de Desenvolvimento Cient�fico e Tecnol�gico - Bolsa / Conselho Nacional de Desenvolvimento Cient�fico e Tecnol�gico - Aux�lio financeiro"
	public List<FinanciadorDoc> gerarFinanciadores(String strFinanciadores, ObjectId id){
		List<FinanciadorDoc> financiadores = new ArrayList<FinanciadorDoc>();
		
		if(strFinanciadores == null){
			return null;
		}
		
		if(strFinanciadores.equals("''") || strFinanciadores.equals("")){
			return null;
		}		
		
		//split para gerar lista de financiadores		
		for(String aux : strFinanciadores.split("/")){
			
			try{	
				//Extrair nome institui��o
				String nome = aux.split("-")[0].trim();
				
				//Extrair tipo do aux�lio
				String auxilio = aux.split("-")[1].trim();
				
				financiadores.add(new FinanciadorDoc(nome, auxilio));	
			}			
			catch (ArrayIndexOutOfBoundsException e) {				
				System.out.println("Em Projetos, ID: "+id.toString()+". Em financiadores, ocorreu um erro de sintaxe em: "+aux);	
				financiadores.add(new FinanciadorDoc(aux, null));
			}			
		}
		
		return financiadores;		
	}

}
