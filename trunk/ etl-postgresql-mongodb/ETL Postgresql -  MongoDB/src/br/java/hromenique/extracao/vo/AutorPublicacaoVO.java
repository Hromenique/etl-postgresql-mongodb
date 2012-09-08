package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'autorespublicacoes'
 * CREATE TABLE autorespublicacoes (
 * contador integer NOT NULL,
 * publicacaoid integer NOT NULL,
 * autorlattesid character(16),
 * autornome character varying(512) NOT NULL
 *);
 */

@Entity
@Table(name = "autoresPublicacoes")
@IdClass(value = AutorPublicacaoPK.class)
public class AutorPublicacaoVO implements Serializable, Tabela{
	
	private static final long serialVersionUID = 2136462455755547793L;
	@Id
	private int contador;
	@Id
	private int publicacaoId;
	private String autorLattesId;
	private String autorNome;
	
	public AutorPublicacaoVO(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public String getAutorLattesId() {
		return autorLattesId;
	}

	public void setAutorLattesId(String autorLattesId) {
		this.autorLattesId = autorLattesId;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((autorLattesId == null) ? 0 : autorLattesId.hashCode());
		result = prime * result
				+ ((autorNome == null) ? 0 : autorNome.hashCode());
		result = prime * result + contador;
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
		AutorPublicacaoVO other = (AutorPublicacaoVO) obj;
		if (autorLattesId == null) {
			if (other.autorLattesId != null)
				return false;
		} else if (!autorLattesId.equals(other.autorLattesId))
			return false;
		if (autorNome == null) {
			if (other.autorNome != null)
				return false;
		} else if (!autorNome.equals(other.autorNome))
			return false;
		if (contador != other.contador)
			return false;
		if (publicacaoId != other.publicacaoId)
			return false;
		return true;
	}
}
