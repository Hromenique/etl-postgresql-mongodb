package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'atuacao'
 * CREATE TABLE atuacoes (
 * contadoratuacao integer NOT NULL PK,
 * lattesid character varying(16) NOT NULL PK,
 * instituicao character varying(512)
 * );
 */
@Entity
@Table(name = "atuacoes")
@IdClass(value = ContadorIdPK.class)
public class AtuacaoVO implements Serializable, Tabela{
	
	private static final long serialVersionUID = 180403749000122461L;
	@Id
	@Column(name = "contadoratuacao")
	private int contador;
	@Id
	private String lattesId;
	private String instituicao;
	
	public AtuacaoVO(){
		
	}

	public int getContadorAtuacao() {
		return contador;
	}

	public void setContadorAtuacao(int contadorAtuacao) {
		this.contador = contadorAtuacao;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contador;
		result = prime * result
				+ ((instituicao == null) ? 0 : instituicao.hashCode());
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
		AtuacaoVO other = (AtuacaoVO) obj;
		if (contador != other.contador)
			return false;
		if (instituicao == null) {
			if (other.instituicao != null)
				return false;
		} else if (!instituicao.equals(other.instituicao))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		return true;
	}

}
