package br.java.hromenique.extracao.vo;

/*
 *  Esta classe representa uma instância da tabela (entidade) 'nomesusadosemcitacoe'
 * CREATE TABLE nomesusadosemcitacoes (
    lattesid character(16) NOT NULL,
    nome character varying(512) NOT NULL
);
 */
public class NomeCitacao {
	
	private String lattesId;
	private String nome;
	
	public NomeCitacao(){
		
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
}
