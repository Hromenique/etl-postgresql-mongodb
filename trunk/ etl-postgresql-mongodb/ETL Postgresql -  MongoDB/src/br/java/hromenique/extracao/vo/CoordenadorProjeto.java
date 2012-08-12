package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'coordenadoresprojetos'
 * CREATE TABLE coordenadoresprojetos (
    contador integer NOT NULL,
    contadorprojeto integer NOT NULL,
    lattesid character(16) NOT NULL,
    integrantelattesid character(16),
    integrantenome character varying(512) NOT NULL
);
 */
public class CoordenadorProjeto {
	
	private int contador;
	private int contadorProjeto;
	private String lattesId;
	private String integrantelattesId;
	private String integranteNome;
	
	public CoordenadorProjeto(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getContadorProjeto() {
		return contadorProjeto;
	}

	public void setContadorProjeto(int contadorProjeto) {
		this.contadorProjeto = contadorProjeto;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getIntegrantelattesId() {
		return integrantelattesId;
	}

	public void setIntegrantelattesId(String integrantelattesId) {
		this.integrantelattesId = integrantelattesId;
	}

	public String getIntegranteNome() {
		return integranteNome;
	}

	public void setIntegranteNome(String integranteNome) {
		this.integranteNome = integranteNome;
	}
}
