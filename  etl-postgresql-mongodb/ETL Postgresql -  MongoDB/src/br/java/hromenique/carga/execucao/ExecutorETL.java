package br.java.hromenique.carga.execucao;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoException;

import br.java.hromenique.carga.dao.FormacaoDocDAO;
import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.CurriculoDoc;
import br.java.hromenique.carga.doc.FormacaoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.transformacao.TransformadorCurriculo;
import br.java.hromenique.transformacao.TransformadorFormacao;

public class ExecutorETL {
	
	public void executa() throws UnknownHostException, MongoException{
		
		//Formações
		GenericDAO<FormacaoVO> daoFormacoesVO = new GenericDAO<FormacaoVO>("curriculo_lattes_2", FormacaoVO.class);
		FormacaoDocDAO daoFormacaoDoc = new FormacaoDocDAO("curriculo_teste");
		TransformadorFormacao tf = new TransformadorFormacao();
		
		List<FormacaoVO> formacoesVO = daoFormacoesVO.buscarTodos();
		List<FormacaoDoc> formacoesDoc = tf.transforma(formacoesVO);
		
		for(FormacaoDoc aux : formacoesDoc){
			daoFormacaoDoc.salvar(aux);
		}
		
		daoFormacoesVO.close();
		
		//Currículos
		GenericDAO<CurriculoVO> daoCurriculosVO = new GenericDAO<CurriculoVO>("curriculo_lattes_2", CurriculoVO.class);
		GenericDocumentDAO<CurriculoDoc> daoCurriculosDoc = new GenericDocumentDAO<CurriculoDoc>("curriculo_teste", CurriculoDoc.class);
		TransformadorCurriculo tc = new TransformadorCurriculo(daoFormacaoDoc);
		
		List<CurriculoVO> curriculosVO = daoCurriculosVO.buscarTodos();
		List<CurriculoDoc> curriculosDoc = tc.transforma(curriculosVO);
		
		for(CurriculoDoc aux : curriculosDoc){
			daoCurriculosDoc.salvar(aux);
		}
		
		daoCurriculosVO.close();
		
		//Publicações
		
		
		
	}

}
