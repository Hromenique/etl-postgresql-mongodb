package br.java.hromenique.extracao.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author Hromenique Cezniowscki Leite Batista<br/><br/> * 
 * Esta classe representa um DAO (Data Object Acess) para buscas (find) nas tabelas correspondentes as classes do tipo parametrizado <T>.<br/> *
 * @param <T> Classe que representa uma entidade (tabela) do Banco de dados
 */
public class GenericDAO<T>{
	
	private EntityManager entityManager;	
	private Class<T> tipoClasse;
	
	public GenericDAO(String dataBase, Class<T> classe){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(dataBase);
		this.entityManager = entityManagerFactory.createEntityManager();
		entityManagerFactory.close();
	
		this.tipoClasse = classe;
	}	
	
	public T buscar(Object chavePrimaria){
		T elemento = (T) entityManager.find(this.tipoClasse, chavePrimaria);
		return elemento;
	}
	
	public List<T> buscarLista(Object[] listaChavePrimaria){
		List<T> resultList = new ArrayList<T>();
		
		for(Object chavePrimaria : listaChavePrimaria){
			T elemento = this.entityManager.find(tipoClasse, chavePrimaria);
			if(elemento == null){
				continue;
			}
			resultList.add(elemento);
		}
		
		return resultList;
	}
	
	public List<T> buscarTodos(){
		String nomeClasse = this.tipoClasse.getName();
		String sql = "SELECT t FROM "+nomeClasse+" t";
		TypedQuery<T> typedQuery = this.entityManager.createQuery(sql, this.tipoClasse);
		List<T> resultList = typedQuery.getResultList();
		
		return resultList;
	}
	
	public void close(){
		this.entityManager.close();
	}
}
