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
import br.java.hromenique.utils.ETLUtil;

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
		documento.setBolsaProdutividade(ETLUtil.deStringVaziaParaNull(entidade.getBolsaProdutividade()));
	
		
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
		String grandeArea = ETLUtil.deStringVaziaParaNull(vo.getGrandeArea());
		String area = ETLUtil.deStringVaziaParaNull(vo.getArea());
		String subArea = ETLUtil.deStringVaziaParaNull(vo.getSubArea());
		String especialidade = ETLUtil.deStringVaziaParaNull(vo.getEspecialidade());		
		
		AreaAtuacaoDoc documento = new AreaAtuacaoDoc(grandeArea, area, subArea, especialidade);
		return documento;
	}
}
