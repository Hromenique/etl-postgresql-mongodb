package br.java.hromenique.carga.doc;

import java.util.List;

public class PublicacaoDoc {
	
	private int id;
	private String titulo;
	private String local;
	private String paginas;
	private String volume;
	private String autores;
	private Integer ano;
	private Integer tipo;
	private Integer idUnico;
	private List<String> autoresNomes;
	private List<String> autoresLattesId;
	
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
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Integer getIdUnico() {
		return idUnico;
	}
	public void setIdUnico(Integer idUnico) {
		this.idUnico = idUnico;
	}
	public List<String> getAutoresNomes() {
		return autoresNomes;
	}
	public void setAutoresNomes(List<String> autoresNomes) {
		this.autoresNomes = autoresNomes;
	}
	public List<String> getAutoresLattesId() {
		return autoresLattesId;
	}
	public void setAutoresLattesId(List<String> autoresLattesId) {
		this.autoresLattesId = autoresLattesId;
	}
}
