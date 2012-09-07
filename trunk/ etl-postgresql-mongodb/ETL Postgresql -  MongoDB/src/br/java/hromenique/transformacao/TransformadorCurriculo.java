package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.List;
import br.java.hromenique.carga.doc.AreaAtuacaoDoc;
import br.java.hromenique.carga.doc.CurriculoDoc;
import br.java.hromenique.extracao.vo.AreaAtuacaoVO;
import br.java.hromenique.extracao.vo.AtuacaoVO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.NomeCitacaoVO;
import br.java.hromenique.extracao.vo.OrientacaoVO;

public class TransformadorCurriculo implements TransformadorInterface<CurriculoVO, CurriculoDoc> {
	
	public TransformadorCurriculo(){
		
	}
	
	
	@Override
	public CurriculoDoc transforma(CurriculoVO entidade) {
		CurriculoDoc documento = new CurriculoDoc();
		documento.setId(entidade.getLattesId());
		documento.setNome(entidade.getNome());
		documento.setUltimaAtualizacao(entidade.getUltimaAtualizacao());
		documento.setSexo(entidade.getSexo());
		documento.setBolsaProdutividade(entidade.getBolsaProdutividade());
		
		//nomesUsadosEmCitações
		if (entidade.getNomesUsadosEmCitacoes() != null) {
			
			List<String> nomesUsadosEmCitacoes = new ArrayList<String>();
			for (NomeCitacaoVO aux : entidade.getNomesUsadosEmCitacoes()) {
				nomesUsadosEmCitacoes.add(aux.getNome());
			}
			documento.setNomesUsadosEmCitacoes(nomesUsadosEmCitacoes);
		}
		
		//areasDeAtuacao
		if(entidade.getAreasAtuacao() != null){
			
			List<AreaAtuacaoDoc> areasAtuacao = new ArrayList<AreaAtuacaoDoc>();
			for(AreaAtuacaoVO vo : entidade.getAreasAtuacao()){
				AreaAtuacaoDoc doc = converterAreaAtuacaoDeVOparaDOC(vo);
				areasAtuacao.add(doc);
			}
			documento.setAreasAtuacao(areasAtuacao);
		}
		
		//atuacoes
		if(entidade.getAtuacoes() != null){
			
			List<String> atuacoes = new ArrayList();
			for(AtuacaoVO vo : entidade.getAtuacoes()){
				atuacoes.add(vo.getInstituicao());
			}
			documento.setAtuacoes(atuacoes);
		}
		
		//orientacoes
		if(entidade.getOrientacoes() != null){
			
			List<Integer> orientacoes = new ArrayList<Integer>();
			for(OrientacaoVO vo : entidade.getOrientacoes()){
				orientacoes.add(vo.getId());
			}
		}
		
		return documento;		
	}
	
	@Override
	public List<CurriculoDoc> transforma(List<CurriculoVO> entidades) {
		List<CurriculoDoc> documentos = new ArrayList<CurriculoDoc>();
		
		for(CurriculoVO vo :entidades){
			documentos.add(transforma(vo));
		}
		
		return documentos;
	}
	
	private AreaAtuacaoDoc converterAreaAtuacaoDeVOparaDOC(AreaAtuacaoVO vo){
		AreaAtuacaoDoc documento = new AreaAtuacaoDoc(vo.getGrandeArea(), vo.getArea(), vo.getSubArea(), vo.getEspecialidade());
		return documento;
	}
	

}
