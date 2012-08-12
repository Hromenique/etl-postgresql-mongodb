package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'projetosdepesquisa'
 * CREATE TABLE projetosdepesquisa (
    contador integer NOT NULL,
    lattesid character(16) NOT NULL,
    periodo character varying(512),
    inicio integer,
    fim integer,
    titulo character varying(2048),
    valorfinanciado character varying(1024),
    situacao character varying(1024),
    natureza character varying(1024),
    alunosenvolvidos text,
    integrantes text,
    coordenadores text,
    financiadores text,
    numerodeorientacoes integer,
    numerodeproducoescta integer
);
 */
public class ProjetoPesquisa {
	
	private int contador;
	private String lattesId;
	private String periodo;
	private int inicio;
	private int fim;
	private String titulo;
	private String valorFinanciado;
	private String situacao;
	private String natureza;
	private String alunosEnvolvidos;
	private String coordenadores;
	private String financiadores;
	private int numeroDeOrientacoes;
	private int numeroDeProducoesCTA;
	
	public ProjetoPesquisa(){
		
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

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getValorFinanciado() {
		return valorFinanciado;
	}

	public void setValorFinanciado(String valorFinanciado) {
		this.valorFinanciado = valorFinanciado;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getAlunosEnvolvidos() {
		return alunosEnvolvidos;
	}

	public void setAlunosEnvolvidos(String alunosEnvolvidos) {
		this.alunosEnvolvidos = alunosEnvolvidos;
	}

	public String getCoordenadores() {
		return coordenadores;
	}

	public void setCoordenadores(String coordenadores) {
		this.coordenadores = coordenadores;
	}

	public String getFinanciadores() {
		return financiadores;
	}

	public void setFinanciadores(String financiadores) {
		this.financiadores = financiadores;
	}

	public int getNumeroDeOrientacoes() {
		return numeroDeOrientacoes;
	}

	public void setNumeroDeOrientacoes(int numeroDeOrientacoes) {
		this.numeroDeOrientacoes = numeroDeOrientacoes;
	}

	public int getNumeroDeProducoesCTA() {
		return numeroDeProducoesCTA;
	}

	public void setNumeroDeProducoesCTA(int numeroDeProducoesCTA) {
		this.numeroDeProducoesCTA = numeroDeProducoesCTA;
	}	

}
