package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'curriculos'
 * CREATE TABLE curriculos (
    lattesid character(16) NOT NULL,
    nome character varying(512) NOT NULL,
    bolsaprodutividade character(2),
    ultimaatualizacao integer,
    sexo character(1)
);
 */
public class Curriculo {
	
	private  String lattesId;
	private String nome;
	private int bolsaProdutividade;
	private int ultimaAtualizacao;
	private char sexo;
	
	public Curriculo(){
		
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

	public int getBolsaProdutividade() {
		return bolsaProdutividade;
	}

	public void setBolsaProdutividade(int bolsaProdutividade) {
		this.bolsaProdutividade = bolsaProdutividade;
	}

	public int getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(int ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}	
}
