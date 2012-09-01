package br.java.hromenique.extracao.vo;

import java.io.Serializable;

public class IntegranteProjetoPK implements Serializable{
	
	private static final long serialVersionUID = 6242887418697425979L;
	private int contador;
	private int contadorProjeto;
	private String lattesId;
	
	public IntegranteProjetoPK(int contador, int contadorProjeto, String lattesId){
		this.contador = contador;
		this.contadorProjeto = contadorProjeto;
		this.lattesId = lattesId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contador;
		result = prime * result + contadorProjeto;
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
		IntegranteProjetoPK other = (IntegranteProjetoPK) obj;
		if (contador != other.contador)
			return false;
		if (contadorProjeto != other.contadorProjeto)
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		return true;
	}

}
