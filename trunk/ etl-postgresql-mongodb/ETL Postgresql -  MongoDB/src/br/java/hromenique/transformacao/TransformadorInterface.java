package br.java.hromenique.transformacao;

import java.util.List;
/**
 * @author Hromenique Cezniowscki Leite Batista
 *
 * @param <R> Classe representando uma tabela de um SGBD relacional (origem dos dados)
 * @param <D> Classe representando um documento do MongoDB, que receberá os dados de <R>
 */
public interface TransformadorInterface<R,D> {
	
	public D transforma(R entidade);
	public List<D> transforma(List<R> entidades);

}
