package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'projetosdepesquisa_descricao'
 * CREATE TABLE projetosdepesquisa_descricao (
    contador integer NOT NULL,
    lattesid character(16) NOT NULL,
    descricao text
);
 */
public class ProjetoPesquisaDescricao {
	
	private int contador;
	private String lattesId;
	private String descricao;
	
	public ProjetoPesquisaDescricao(){
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
