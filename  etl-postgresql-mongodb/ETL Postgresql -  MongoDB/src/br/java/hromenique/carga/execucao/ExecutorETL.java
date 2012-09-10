package br.java.hromenique.carga.execucao;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoException;

import br.java.hromenique.carga.dao.FormacaoDocDAO;
import br.java.hromenique.carga.dao.GenericDocumentDAO;
import br.java.hromenique.carga.doc.CurriculoDoc;
import br.java.hromenique.carga.doc.FormacaoDoc;
import br.java.hromenique.carga.doc.OrientacaoDoc;
import br.java.hromenique.carga.doc.ProjetoDoc;
import br.java.hromenique.carga.doc.PublicacaoDoc;
import br.java.hromenique.extracao.dao.GenericDAO;
import br.java.hromenique.extracao.vo.CurriculoVO;
import br.java.hromenique.extracao.vo.FormacaoVO;
import br.java.hromenique.extracao.vo.OrientacaoVO;
import br.java.hromenique.extracao.vo.ProjetoPesquisaVO;
import br.java.hromenique.extracao.vo.PublicacaoVO;
import br.java.hromenique.transformacao.TransformadorCurriculo;
import br.java.hromenique.transformacao.TransformadorFormacao;
import br.java.hromenique.transformacao.TransformadorOrientacao;
import br.java.hromenique.transformacao.TransformadorProjeto;
import br.java.hromenique.transformacao.TransformadorPublicacao;

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
		GenericDAO<PublicacaoVO> daoPublicacaoVO = new GenericDAO<PublicacaoVO>("curriculo_lattes_2", PublicacaoVO.class);
		GenericDocumentDAO<PublicacaoDoc> daoPublicacaoDoc = new GenericDocumentDAO<PublicacaoDoc>("curriculo_teste", PublicacaoDoc.class);
		TransformadorPublicacao tp = new TransformadorPublicacao();
		
		List<PublicacaoVO> publicacoesVO = daoPublicacaoVO.buscarTodos();
		List<PublicacaoDoc> publicacoesDoc = tp.transforma(publicacoesVO);
		
		for(PublicacaoDoc aux : publicacoesDoc){
			daoPublicacaoDoc.salvar(aux);
		}
		
		daoPublicacaoVO.close();
		
		//Orientacoes
		GenericDAO<OrientacaoVO> daoOrientacaoVO = new GenericDAO<OrientacaoVO>("curriculo_lattes_2", OrientacaoVO.class);
		GenericDocumentDAO<OrientacaoDoc> daoOrientacaoDoc = new GenericDocumentDAO<OrientacaoDoc>("curriculo_teste", OrientacaoDoc.class);
		TransformadorOrientacao to = new TransformadorOrientacao();
		
		List<OrientacaoVO> orientacoesVO = daoOrientacaoVO.buscarTodos();
		List<OrientacaoDoc> orientacoesDoc = to.transforma(orientacoesVO);
		
		for(OrientacaoDoc aux : orientacoesDoc){
			daoOrientacaoDoc.salvar(aux);
		}
		daoCurriculosVO.close();
		
		//Projetos de Pesquisa
		GenericDAO<ProjetoPesquisaVO> daoProjetoVO = new GenericDAO<ProjetoPesquisaVO>("curriculo_lattes_2", ProjetoPesquisaVO.class);
		GenericDocumentDAO<ProjetoDoc> daoProjetoDoc = new GenericDocumentDAO<ProjetoDoc>("curriculo_teste", ProjetoDoc.class);
		TransformadorProjeto tpp = new TransformadorProjeto();
		
		List<ProjetoPesquisaVO> projetosVO = daoProjetoVO.buscarTodos();
		List<ProjetoDoc> projetosDoc = tpp.transforma(projetosVO);
		
		for(ProjetoDoc aux : projetosDoc){
			daoProjetoDoc.salvar(aux);
		}
		
		daoProjetoVO.close();		
	}

}
