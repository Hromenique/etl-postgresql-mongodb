package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'nomes'
 * CREATE TABLE nomes (
    nomepadrao character varying(512) NOT NULL,
    nomeusado character varying(512) NOT NULL
);
 */
public class Nome {
	
	private String nomePadrao;
	private String nomeUsado;
	
	public Nome(){
		
	}

	public String getNomePadrao() {
		return nomePadrao;
	}

	public void setNomePadrao(String nomePadrao) {
		this.nomePadrao = nomePadrao;
	}

	public String getNomeUsado() {
		return nomeUsado;
	}

	public void setNomeUsado(String nomeUsado) {
		this.nomeUsado = nomeUsado;
	}
}
