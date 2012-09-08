package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'coordenadoresprojetos'
 * CREATE TABLE coordenadoresprojetos (
 * contador integer NOT NULL,
 * contadorprojeto integer NOT NULL,
 * lattesid character(16) NOT NULL,
 * integrantelattesid character(16),
 * integrantenome character varying(512) NOT NULL
 * );
 */
@Entity
@Table(name = "coordenadoresprojetos")
@IdClass(value=IntegranteProjetoPK.class)
public class CoordenadorProjetoVO implements Serializable, Tabela {
	
	private static final long serialVersionUID = -8119513460463369272L;
	@Id
	private int contador;
	@Id
	private int contadorProjeto;
	@Id
	private String lattesId;
	private String integrantelattesId;
	private String integranteNome;
	
	public CoordenadorProjetoVO(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getContadorProjeto() {
		return contadorProjeto;
	}

	public void setContadorProjeto(int contadorProjeto) {
		this.contadorProjeto = contadorProjeto;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getIntegrantelattesId() {
		return integrantelattesId;
	}

	public void setIntegrantelattesId(String integrantelattesId) {
		this.integrantelattesId = integrantelattesId;
	}

	public String getIntegranteNome() {
		return integranteNome;
	}

	public void setIntegranteNome(String integranteNome) {
		this.integranteNome = integranteNome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contador;
		result = prime * result + contadorProjeto;
		result = prime * result
				+ ((integranteNome == null) ? 0 : integranteNome.hashCode());
		result = prime
				* result
				+ ((integrantelattesId == null) ? 0 : integrantelattesId
						.hashCode());
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
		CoordenadorProjetoVO other = (CoordenadorProjetoVO) obj;
		if (contador != other.contador)
			return false;
		if (contadorProjeto != other.contadorProjeto)
			return false;
		if (integranteNome == null) {
			if (other.integranteNome != null)
				return false;
		} else if (!integranteNome.equals(other.integranteNome))
			return false;
		if (integrantelattesId == null) {
			if (other.integrantelattesId != null)
				return false;
		} else if (!integrantelattesId.equals(other.integrantelattesId))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		return true;
	}
}
