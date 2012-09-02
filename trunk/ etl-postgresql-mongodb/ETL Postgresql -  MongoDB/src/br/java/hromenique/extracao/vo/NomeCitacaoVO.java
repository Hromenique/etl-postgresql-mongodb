package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista
 *  Esta classe representa uma instância da tabela (entidade) 'nomesusadosemcitacoe'
 * CREATE TABLE nomesusadosemcitacoes (
 * lattesid character(16) NOT NULL,
 * nome character varying(512) NOT NULL
 *);
 */
@Entity
@Table(name = "nomesusadosemcitacoes")
@IdClass(value = NomeCitacaoPK.class)
public class NomeCitacaoVO implements Serializable {
	
	private static final long serialVersionUID = 2864929343931910414L;
	@Id
	private String lattesId;
	@Id
	private String nome;
	
	public NomeCitacaoVO(){
		
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		NomeCitacaoVO other = (NomeCitacaoVO) obj;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
