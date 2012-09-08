package br.java.hromenique.transformacao;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import br.java.hromenique.carga.doc.FormacaoDoc;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.utils.ETLUtil;

public class TransformadorFormacao implements TransformadorInterface<FormacaoVO, FormacaoDoc> {
	
	@Override
	public FormacaoDoc transforma(FormacaoVO entidade) {
		FormacaoDoc documento = new FormacaoDoc();
		documento.setId(new ObjectId());
		documento.setLattesId(entidade.getLattesId());		
		documento.setPeriodo(entidade.getPeriodo());
		documento.setInicio(entidade.getInicio());
		documento.setFim(entidade.getFim());
		documento.setTitulo(entidade.getTitulo());
		documento.setInstituicao(entidade.getInstituicao());		
		documento.setOrientadorNome(ETLUtil.deStringVaziaParaNull(entidade.getOrientadorNome()));
		
		//lattesId do orientador
		String orientadorLattesId = ETLUtil.seIgualTrocar(entidade.getOrientadorLattesId(), "', '            ", null);
		orientadorLattesId = ETLUtil.deStringVaziaParaNull(orientadorLattesId);		
		documento.setOrientadorLattesId(orientadorLattesId);
		
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
