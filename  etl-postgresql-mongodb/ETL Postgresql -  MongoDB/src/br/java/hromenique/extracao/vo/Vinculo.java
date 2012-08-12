package br.java.hromenique.extracao.vo;

/*
 *  Esta classe representa uma instância da tabela (entidade) 'vinculos'
 * CREATE TABLE vinculos (
    contadoratuacao integer NOT NULL,
    lattesid character varying(16) NOT NULL,
    contadorvinculo integer NOT NULL,
    inicio character varying(15),
    fim character varying(15),
    tipo character varying(512),
    enquadramentofuncional character varying(512),
    cargahoraria integer,
    regime character varying(256)
);
 */
public class Vinculo {
	
	private int contadorAtuacao;
	private String lattesId;
	private int contadorVinculo;
	private String inicio;
	private String fim;
	private String tipo;
	private String enquadramentoFuncional;
	private int cargaHoraria;
	private String regime;
	
	public Vinculo(){
		
	}

	public int getContadorAtuacao() {
		return contadorAtuacao;
	}

	public void setContadorAtuacao(int contadorAtuacao) {
		this.contadorAtuacao = contadorAtuacao;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public int getContadorVinculo() {
		return contadorVinculo;
	}

	public void setContadorVinculo(int contadorVinculo) {
		this.contadorVinculo = contadorVinculo;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEnquadramentoFuncional() {
		return enquadramentoFuncional;
	}

	public void setEnquadramentoFuncional(String enquadramentoFuncional) {
		this.enquadramentoFuncional = enquadramentoFuncional;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}
}
