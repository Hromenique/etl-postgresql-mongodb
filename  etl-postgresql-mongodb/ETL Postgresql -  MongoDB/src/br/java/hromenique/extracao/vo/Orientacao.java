package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma inst�ncia da tabela (entidade) 'orientacoes'
 * CREATE TABLE orientacoes (
    id integer NOT NULL,
    titulo character varying(1024),
    ano integer,
    financiador character varying(1024),
    lattesid character(16),
    nome character varying(512),
    orientadorlattesid character(16),
    orientadornome character varying(512),
    local character varying(1024),
    nivel character varying(128),
    tipo integer,
    ehcoorientador character(1)
);
 */
public class Orientacao {
	
	private int id;
	private String titulo;
	private int ano;
	private String financiador;
	private String lattesId;
	private String nome;
	private String orientadorLattesId;
	private String orientadorNome;
	private String local;
	private String nivel;
	private int tipo;
	private char ehCoorientador;
	
	public Orientacao(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getFinanciador() {
		return financiador;
	}

	public void setFinanciador(String financiador) {
		this.financiador = financiador;
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

	public String getOrientadorLattesId() {
		return orientadorLattesId;
	}

	public void setOrientadorLattesId(String orientadorLattesId) {
		this.orientadorLattesId = orientadorLattesId;
	}

	public String getOrientadorNome() {
		return orientadorNome;
	}

	public void setOrientadorNome(String orientadorNome) {
		this.orientadorNome = orientadorNome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public char getEhCoorientador() {
		return ehCoorientador;
	}

	public void setEhCoorientador(char ehCoorientador) {
		this.ehCoorientador = ehCoorientador;
	}
}
