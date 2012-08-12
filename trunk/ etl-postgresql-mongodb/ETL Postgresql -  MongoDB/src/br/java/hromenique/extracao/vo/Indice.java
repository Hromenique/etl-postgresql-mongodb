package br.java.hromenique.extracao.vo;

/*
 *  Esta classe representa uma instância da tabela (entidade) 'indices'
 * CREATE TABLE indices (
    id integer NOT NULL PK,
    nome character varying(512)
);
 */
public class Indice{
	
	private int id;
	private String nome;
	
	public Indice(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
