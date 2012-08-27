package br.java.hromenique.extracao.vo;
import java.io.Serializable;
/**
 * @author Hromenique Cezniowscki 
 * 
 * Objeto representando a primary key da tabela 'formacoes' *
 */

public class FormacaoPK implements Serializable{	
	
	private static final long serialVersionUID = 4528044681320258478L;
	
	private int contador;	
	private String lattesId;	
	
	public FormacaoPK(){
		
	}
	
	public FormacaoPK(int contador, String lattesId){
		this.contador = contador;
		this.lattesId = lattesId;
	}
	
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
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
		FormacaoPK other = (FormacaoPK) obj;
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
