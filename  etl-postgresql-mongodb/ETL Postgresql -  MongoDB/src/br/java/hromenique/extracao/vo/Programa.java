package br.java.hromenique.extracao.vo;
/*
 * 
 * Esta classe representa uma instância da tabela (entidade) 'programas'
	CREATE TABLE programas (
		    id integer NOT NULL PK,
		    instituicao character varying(64),
		    nome character varying(512),
		    tipo character(1),
		    mestrado character(1),
		    iniciomestrado integer,
		    doutorado character(1),
		    iniciodoutorado integer,
		    docentespermantes integer,
		    nota integer
		);
*/

public class Programa{
	
	private int id;
	private String instituicao;
	private String nome;
	private char tipo;
	private char mestrado;
	private int inicioMestrado;
	private char doutorado;
	private int inicioDoutorado;
	private int nota;
	
	public Programa(){

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public char getMestrado() {
		return mestrado;
	}
	public void setMestrado(char mestrado) {
		this.mestrado = mestrado;
	}
	public int getInicioMestrado() {
		return inicioMestrado;
	}
	public void setInicioMestrado(int inicioMestrado) {
		this.inicioMestrado = inicioMestrado;
	}
	public char getDoutorado() {
		return doutorado;
	}
	public void setDoutorado(char doutorado) {
		this.doutorado = doutorado;
	}
	public int getInicioDoutorado() {
		return inicioDoutorado;
	}
	public void setInicioDoutorado(int inicioDoutorado) {
		this.inicioDoutorado = inicioDoutorado;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
}

