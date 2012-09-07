package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import br.java.hromenique.carga.doc.DadosConferenciaDoc;
import br.java.hromenique.carga.doc.DadosPeriodicoDoc;
import br.java.hromenique.carga.doc.PublicacaoDoc;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.PublicacaoVO;

public class TransformadorPublicacao implements TransformadorInterface<PublicacaoVO, PublicacaoDoc> {
	
	public TransformadorPublicacao(){
		
	}
	
	@Override
	public PublicacaoDoc transforma(PublicacaoVO entidade) {
		PublicacaoDoc documento = new PublicacaoDoc();
		
		documento.setId(entidade.getId());
		documento.setTitulo(entidade.getTitulo());
		documento.setLocal(entidade.getLocal());
		documento.setPaginas(entidade.getPaginas());
		documento.setVolume(entidade.getVolume());
		documento.setAno(entidade.getAno());
		documento.setTipo(entidade.getTipo());
		documento.setIdUnico(entidade.getIdUnico());
		
		//Nomes dos autores
		List<String> autoresNomes = Arrays.asList(entidade.getAutores().split(" ; "));
		documento.setAutoresNomes(autoresNomes);		
		documento.setAutores(entidade.getAutores());
		
		//LattesId dos autores
		if(entidade.getCurriculosAutores() != null){
			List<String> lattesIdAutores = new ArrayList<String>();
			
			for(CurriculoVO vo : entidade.getCurriculosAutores()){
				lattesIdAutores.add(vo.getLattesId());
			}
			documento.setAutoresLattesId(lattesIdAutores);
		}
		
		//periódico
		if(entidade.getPeriodico() != null){
			DadosPeriodicoDoc dadosPeriodico = 
					new DadosPeriodicoDoc(entidade.getPeriodico().getNomePeriodico(), entidade.getPeriodico().getNomePeriodico(), entidade.getPeriodico().getIssn());
			
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
