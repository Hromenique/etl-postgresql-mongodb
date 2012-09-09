package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.List;
import br.java.hromenique.carga.doc.DadosConferenciaDoc;
import br.java.hromenique.carga.doc.DadosPeriodicoDoc;
import br.java.hromenique.carga.doc.PublicacaoDoc;
import br.java.hromenique.extracao.vo.AutorPublicacaoVO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.PublicacaoVO;
import br.java.hromenique.utils.ETLUtil;

public class TransformadorPublicacao implements TransformadorInterface<PublicacaoVO, PublicacaoDoc> {
	
	public TransformadorPublicacao(){
		
	}
	
	@Override
	public PublicacaoDoc transforma(PublicacaoVO entidade) {
		PublicacaoDoc documento = new PublicacaoDoc();
		
		documento.setId(entidade.getId());
		
		//Lista de latesIds
		List<String> lattesIds = new ArrayList<String>();
		for(CurriculoVO vo : entidade.getCurriculosAutores()){
			lattesIds.add(vo.getLattesId());			
		}
		documento.setLattesId(lattesIds);
		
		
		documento.setTitulo(entidade.getTitulo());		
		documento.setLocal(ETLUtil.seIgualTrocar(entidade.getLocal(), "''", null));		
		documento.setPaginas(entidade.getPaginas());
		documento.setVolume(entidade.getVolume());
		documento.setAno(entidade.getAno());
		documento.setTipo(entidade.getTipo());
		documento.setIdUnico(entidade.getIdUnico());
		
		//Nomes dos autores		
		if(entidade.getAutoresPublicacao() != null){
			List<String> nomesAutores = new ArrayList<String>();			
			Object[] autoresArray = entidade.getAutoresPublicacao().toArray();
			for(int i=0; i < autoresArray.length;i++){
				nomesAutores.add(i, ((AutorPublicacaoVO) autoresArray[i]).getAutorNome());
			}
			
			documento.setAutoresNomes(nomesAutores);
		}		
		
		documento.setAutores(entidade.getAutores());
		
		//LattesId dos autores
		if(entidade.getAutoresPublicacao() != null){
			List<String> lattesIdAutores = new ArrayList<String>();
			for(AutorPublicacaoVO vo : entidade.getAutoresPublicacao()){				
				if(!vo.getAutorLattesId().equals("null            ")){
					lattesIdAutores.add(vo.getAutorLattesId());
				}
			}
			documento.setAutoresLattesId(lattesIdAutores);
		}
		
		/*
		if(entidade.getCurriculosAutores() != null){
			List<String> lattesIdAutores = new ArrayList<String>();
			
			for(CurriculoVO vo : entidade.getCurriculosAutores()){
				lattesIdAutores.add(vo.getLattesId());
			}
			documento.setAutoresLattesId(lattesIdAutores);
		}
		*/
		
		//periódico
		if(entidade.getPeriodico() != null){
			String nomePeriodico = entidade.getPeriodico().getNomePeriodico();
			nomePeriodico = ETLUtil.seIgualTrocar(nomePeriodico, "''", null);
			String numero = entidade.getPeriodico().getNumero();
			String issn = entidade.getPeriodico().getIssn();
			DadosPeriodicoDoc dadosPeriodico = 
					new DadosPeriodicoDoc(nomePeriodico, numero, issn);
			
			documento.setDadosPeriodico(dadosPeriodico);
		}
		
		//conferência
		if(entidade.getConferencia() != null){
			DadosConferenciaDoc dadosConferencia = new DadosConferenciaDoc(entidade.getConferencia().getNomeEvento(), entidade.getConferencia().getTituloAnais());
			documento.setDadosConferencia(dadosConferencia);
		}		
		
		return documento;
	}
	
	@Override
	public List<PublicacaoDoc> transforma(List<PublicacaoVO> entidades) {
		
		List<PublicacaoDoc> documentos = new ArrayList<PublicacaoDoc>();
		for(PublicacaoVO vo : entidades){
			documentos.add(transforma(vo));
		}
		
		return documentos;
	}
}
