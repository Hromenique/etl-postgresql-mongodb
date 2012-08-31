package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista <br/>
 * Esta classe representa uma instância da tabela (entidade) 'publicacoesconferencias'
 * CREATE TABLE publicacoesconferencias (
 * publicacaoid integer NOT NULL,
 * nomeevento character varying(512),
 * tituloanais character varying(512)
 * );
 */

@Entity
@Table(name = "publicacoesConferencias")
public class PublicacaoConferenciaVO implements Serializable{
	
	private static final long serialVersionUID = -2433929316033048891L;
	@Id
	private int publicacaoId;
	private String nomeEvento;
	private String tituloAnais;
	
	public PublicacaoConferenciaVO(){
		
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getTituloAnais() {
		return tituloAnais;
	}

	public void setTituloAnais(String tituloAnais) {
		this.tituloAnais = tituloAnais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomeEvento == null) ? 0 : nomeEvento.hashCode());
		result = prime * result + publicacaoId;
		result = prime * result
				+ ((tituloAnais == null) ? 0 : tituloAnais.hashCode());
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
		PublicacaoConferenciaVO other = (PublicacaoConferenciaVO) obj;
		if (nomeEvento == null) {
			if (other.nomeEvento != null)
				return false;
		} else if (!nomeEvento.equals(other.nomeEvento))
			return false;
		if (publicacaoId != other.publicacaoId)
			return false;
		if (tituloAnais == null) {
			if (other.tituloAnais != null)
				return false;
		} else if (!tituloAnais.equals(other.tituloAnais))
			return false;
		return true;
	}
}
