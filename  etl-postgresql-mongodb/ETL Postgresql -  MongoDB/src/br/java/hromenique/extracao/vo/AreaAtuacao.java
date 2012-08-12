package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'areasdeatuacao'
 * CREATE TABLE areasdeatuacao (
    contador integer NOT NULL,
    lattesid character(16) NOT NULL,
    grandearea character varying(512),
    area character varying(512),
    subarea character varying(512),
    especialidade character varying(512)
);
 */

public class AreaAtuacao {	
	
	private int contador;
	private String lattesId;
	private String grandeArea;
	private String area;
	private String subArea;
	private String especialidade;
	
	public AreaAtuacao(){
		
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

	public String getGrandeArea() {
		return grandeArea;
	}

	public void setGrandeArea(String grandeArea) {
		this.grandeArea = grandeArea;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}	
}
