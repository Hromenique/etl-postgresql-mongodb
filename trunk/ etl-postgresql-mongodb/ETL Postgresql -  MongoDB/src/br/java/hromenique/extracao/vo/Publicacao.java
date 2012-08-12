package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'publicacoes '
 * CREATE TABLE publicacoes (
    id integer NOT NULL,
    titulo character varying(1024),
    local character varying(1024),
    paginas character varying(128),
    volume character varying(128),
    autores text,
    ano integer,
    tipo integer,
    idunico integer
);
 */
public class Publicacao {
	
	private int id;
	private String titulo;
	private String local;
	private String paginas;
	private String volume;
	private String autores;
	private int ano;
	private int tipo;
	private int idUnico;
	
	public Publicacao(){
		
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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getIdUnico() {
		return idUnico;
	}

	public void setIdUnico(int idUnico) {
		this.idUnico = idUnico;
	}
}
