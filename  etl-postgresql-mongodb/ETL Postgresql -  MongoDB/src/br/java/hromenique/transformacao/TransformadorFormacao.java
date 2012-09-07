package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import br.java.hromenique.carga.doc.FormacaoDoc;
import br.java.hromenique.extracao.vo.FormacaoVO;

public class TransformadorFormacao implements TransformadorInterface<FormacaoVO, FormacaoDoc> {
	
	@Override
	public FormacaoDoc transforma(FormacaoVO entidade) {
		FormacaoDoc documento = new FormacaoDoc();
		documento.setId(new ObjectId());
		documento.setPeriodo(entidade.getPeriodo());
		documento.setInicio(entidade.getInicio());
		documento.setFim(entidade.getFim());
		documento.setTitulo(entidade.getTitulo());
		documento.setInstituicao(entidade.getInstituicao());
		documento.setOrientadorNome(entidade.getOrientadorNome());
		documento.setOrientadorLattesId(entidade.getLattesId());
		
		return documento;
	}
	
	@Override
	public List<FormacaoDoc> transforma(List<FormacaoVO> entidades) {
		List<FormacaoDoc> documentos = new ArrayList<FormacaoDoc>();
		
		for(FormacaoVO vo : entidades){
			documentos.add(transforma(vo));
		}
		return documentos;
	}
}
