package br.java.hromenique.extracao.vo;

/*
 *  Esta classe representa uma instância da tabela (entidade) 'formacoes'
 * CREATE TABLE formacoes (
    contador integer NOT NULL,
    lattesid character(16) NOT NULL,
    periodo character varying(512),
    inicio integer,
    fim integer,
    titulo character varying(1024),
    instituicao character varying(1024),
    orientadorlattesid character(16),
    orientadornome character varying(512)
);
 */

public class Formacao {
	
	private int contador;
	private String lattesId;
	private String periodo;
	private int inicio;
	private int fim;
	private String titulo;
	private String instituicao;
	private String orientadorLattesId;
	private String orientadorNome;
	
	public Formacao(){
		
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

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
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

}
