package br.java.hromenique.extracao.vo;

import java.io.Serializable;

/**
 * @author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma chave composta genérica formada por um contador(int) e um id(String).
 *
 */
public class ContadorIdPK implements Serializable{	
	
	private static final long serialVersionUID = -3370686953071864269L;
	private int contador;
	private String lattesId;
	
	public ContadorIdPK(){
		
	}
	
	public ContadorIdPK(int contador, String id){
		this.contador = contador;
		this.lattesId = id;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getId() {
		return lattesId;
	}

	public void setId(String id) {
		this.lattesId = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contador;
		result = prime * result + ((lattesId == null) ? 0 : lattesId.hashCode());
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
		ContadorIdPK other = (ContadorIdPK) obj;
		if (contador != other.contador)
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		return true;
	}
	
	

}
