package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'publicacoesperiodicos'
 * CREATE TABLE publicacoesperiodicos (
 * publicacaoid integer NOT NULL,
 * nomeperiodico character varying(512),
 * numero character(16),
 * issn character varying(128)
 * );
 */

@Entity
@Table(name = "publicacoesPeriodicos")
public class PublicacaoPeriodicoVO implements Serializable, Tabela{
	
	private static final long serialVersionUID = -2921312745922181145L;
	@Id
	private int publicacaoId;
	private String nomePeriodico;
	private String numero;
	private String issn;
	
	public PublicacaoPeriodicoVO(){
		
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public String getNomePeriodico() {
		return nomePeriodico;
	}

	public void setNomePeriodico(String nomePeriodico) {
		this.nomePeriodico = nomePeriodico;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((issn == null) ? 0 : issn.hashCode());
		result = prime * result
				+ ((nomePeriodico == null) ? 0 : nomePeriodico.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + publicacaoId;
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
		PublicacaoPeriodicoVO other = (PublicacaoPeriodicoVO) obj;
		if (issn == null) {
			if (other.issn != null)
				return false;
		} else if (!issn.equals(other.issn))
			return false;
		if (nomePeriodico == null) {
			if (other.nomePeriodico != null)
				return false;
		} else if (!nomePeriodico.equals(other.nomePeriodico))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (publicacaoId != other.publicacaoId)
			return false;
		return true;
	}
}
