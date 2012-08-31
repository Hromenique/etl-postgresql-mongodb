package br.java.hromenique.extracao.vo;

import java.io.Serializable;

/**
 * @author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma chave primária composta por contador(int) e 
 * publicacaoId(int) e que será usada na classe AutorPublicacaoVO que guarda 
 * as informações da tabela autoresPublicacoes
 *
 */
public class AutorPublicacaoPK implements Serializable{	
	
	private static final long serialVersionUID = -6899110457043945657L;
	private int contador;
	private int publicacaoId;
	
	public AutorPublicacaoPK(){
		
	}
	
	public AutorPublicacaoPK(int contador, int id){
		this.contador = contador;
		this.publicacaoId = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		AutorPublicacaoPK other = (AutorPublicacaoPK) obj;
		if (contador != other.contador)
			return false;
		if (publicacaoId != other.publicacaoId)
			return false;
		return true;
	}

}
