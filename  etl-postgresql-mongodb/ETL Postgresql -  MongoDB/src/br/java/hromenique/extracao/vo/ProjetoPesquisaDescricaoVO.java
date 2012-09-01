package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'projetosdepesquisa_descricao'
 * CREATE TABLE projetosdepesquisa_descricao (
 * contador integer NOT NULL,
 * lattesid character(16) NOT NULL,
 * descricao text
 * );
 */

@Entity
@Table(name = "projetosdepesquisa_descricao")
@IdClass(value = ContadorIdPK.class)
public class ProjetoPesquisaDescricaoVO implements Serializable{
	
	private static final long serialVersionUID = 758996204225863944L;
	@Id
	private int contador;
	@Id
	private String lattesId;
	private String descricao;
	
	public ProjetoPesquisaDescricaoVO(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contador;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjetoPesquisaDescricaoVO other = (ProjetoPesquisaDescricaoVO) obj;
		if (contador != other.contador)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		return true;
	}
}
