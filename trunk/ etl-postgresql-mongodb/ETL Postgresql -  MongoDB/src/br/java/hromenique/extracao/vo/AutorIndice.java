package br.java.hromenique.extracao.vo;
/*
 * Esta classe representa uma instância da tabela (entidade) 'autoresindices'
 * CREATE TABLE autoresindices (
    lattesid character(16) NOT NULL PK,
    indiceid integer NOT NULL PFK(indices.id),
    valor double precision
);
 */
public class AutorIndice{
	
	private String id;
	private int indiceId;
	private double valor;
	
	public AutorIndice(){

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIndiceId() {
		return indiceId;
	}

	public void setIndiceId(int indiceId) {
		this.indiceId = indiceId;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}	

}
