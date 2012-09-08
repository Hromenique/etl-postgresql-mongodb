package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.List;
import br.java.hromenique.carga.doc.OrientacaoDoc;
import br.java.hromenique.extracao.vo.OrientacaoVO;
import br.java.hromenique.utils.ETLUtil;

public class TransformadorOrientacao implements TransformadorInterface<OrientacaoVO, OrientacaoDoc> {
	
	public TransformadorOrientacao(){
		
	}
	
	@Override
	public OrientacaoDoc transforma(OrientacaoVO entidade) {
		OrientacaoDoc documento = new OrientacaoDoc();
		documento.setId(entidade.getId());
		documento.setTitulo(entidade.getTitulo());
		documento.setAno(entidade.getAno());		
		documento.setLattesId(ETLUtil.seIgualTrocar(entidade.getLattesId(), "null            ", null));		
		documento.setNome(entidade.getNome());
		documento.setOrientadorLattesId(entidade.getCurriculo().getLattesId());	
		documento.setNivel(entidade.getNivel());
		documento.setTipo(entidade.getTipo());
		documento.setEhCoorientador(entidade.getEhCoorientador());		
		documento.setFinanciador(ETLUtil.seIgualTrocar(entidade.getFinanciador(), "''", null));		
		documento.setLocal(ETLUtil.seIgualTrocar(entidade.getLocal(), "''", null));		
		documento.setFinanciador(ETLUtil.deStringVaziaParaNull(entidade.getFinanciador()));

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
