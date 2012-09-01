package br.java.hromenique.extracao.vo;

import java.io.Serializable;

/**
 * @author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma chave primária composta por lattesId(String) e 
 * nome(Stirng) e que será usada na classe NomesCitacao que guarda 
 * as informações da tabela nomesUsadosEmCitacoes
 *
 */
public class NomeCitacaoPK implements Serializable {
	
	private static final long serialVersionUID = 9121088716117868639L;
	private String lattesId;
	private  String nome;
	
	public NomeCitacaoPK(String id, String nome){
		this.lattesId = id;
		this.nome = nome;
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
		NomeCitacaoPK other = (NomeCitacaoPK) obj;
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
