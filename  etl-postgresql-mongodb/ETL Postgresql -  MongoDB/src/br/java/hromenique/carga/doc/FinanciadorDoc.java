package br.java.hromenique.carga.doc;

import com.google.code.morphia.annotations.Embedded;

@Embedded
public class FinanciadorDoc {
	
	private String nome;
	private String tipoAuxilio;
	
	public FinanciadorDoc() {		
	}
	
	public FinanciadorDoc(String nome, String tipoAuxilio){
		this.nome = nome;
		this.tipoAuxilio = tipoAuxilio;
	}

	public String getNome() {
		return nome;
	}

	public String getTipoAuxilio() {
		return tipoAuxilio;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipoAuxilio(String tipoAuxilio) {
		this.tipoAuxilio = tipoAuxilio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((tipoAuxilio == null) ? 0 : tipoAuxilio.hashCode());
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
		FinanciadorDoc other = (FinanciadorDoc) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoAuxilio == null) {
			if (other.tipoAuxilio != null)
				return false;
		} else if (!tipoAuxilio.equals(other.tipoAuxilio))
			return false;
		return true;
	}
}
