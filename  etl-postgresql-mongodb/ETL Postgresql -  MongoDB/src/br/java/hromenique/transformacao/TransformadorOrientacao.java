package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.List;

import br.java.hromenique.carga.doc.OrientacaoDoc;
import br.java.hromenique.extracao.vo.OrientacaoVO;

public class TransformadorOrientacao implements TransformadorInterface<OrientacaoVO, OrientacaoDoc> {
	
	public TransformadorOrientacao(){
		
	}
	
	@Override
	public OrientacaoDoc transforma(OrientacaoVO entidade) {
		OrientacaoDoc documento = new OrientacaoDoc();
		documento.setId(entidade.getId());
		documento.setTitulo(entidade.getTitulo());
		documento.setAno(entidade.getAno());
		documento.setLattesId(entidade.getLattesId());
		documento.setNome(entidade.getNome());
		documento.setOrientadorLattesId(entidade.getCurriculo().getLattesId());
		documento.setLocal(entidade.getLocal());
		documento.setNivel(entidade.getNivel());
		documento.setTipo(entidade.getTipo());
		documento.setEhCoorientador(entidade.getEhCoorientador());
		
		if(!entidade.getFinanciador().equals("")){
			documento.setFinanciador(entidade.getFinanciador());
		}
		return documento;
	}
	
	@Override
	public List<OrientacaoDoc> transforma(List<OrientacaoVO> entidades) {
		List<OrientacaoDoc> documentos = new ArrayList<OrientacaoDoc>();
		
		for(OrientacaoVO vo : entidades){
			documentos.add(transforma(vo));
		}
	
		return documentos;
	}

}
