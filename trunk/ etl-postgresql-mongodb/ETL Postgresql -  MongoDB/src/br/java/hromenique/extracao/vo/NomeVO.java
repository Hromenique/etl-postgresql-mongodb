package br.java.hromenique.extracao.vo;

import java.io.Serializable;
/**@author Hromenique Cezniowscki Leite Batista
 * Esta classe representa uma instância da tabela (entidade) 'nomes'
 * CREATE TABLE nomes (
 * nomepadrao character varying(512) NOT NULL,
 * nomeusado character varying(512) NOT NULL
 * );
 */

public class NomeVO implements Serializable, Tabela{
	
	private static final long serialVersionUID = -3778221281415098209L;
	private String nomePadrao;
	private String nomeUsado;
	
	public NomeVO(){
		
	}

	public String getNomePadrao() {
		return nomePadrao;
	}

	public void setNomePadrao(String nomePadrao) {
		this.nomePadrao = nomePadrao;
	}

	public String getNomeUsado() {
		return nomeUsado;
	}

	public void setNomeUsado(String nomeUsado) {
		this.nomeUsado = nomeUsado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomePadrao == null) ? 0 : nomePadrao.hashCode());
		result = prime * result
				+ ((nomeUsado == null) ? 0 : nomeUsado.hashCode());
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
		NomeVO other = (NomeVO) obj;
		if (nomePadrao == null) {
			if (other.nomePadrao != null)
				return false;
		} else if (!nomePadrao.equals(other.nomePadrao))
			return false;
		if (nomeUsado == null) {
			if (other.nomeUsado != null)
				return false;
		} else if (!nomeUsado.equals(other.nomeUsado))
			return false;
		return true;
	}
}
