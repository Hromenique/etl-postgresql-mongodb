package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'atuacao'
 * CREATE TABLE atuacoes (
    contadoratuacao integer NOT NULL PK,
    lattesid character varying(16) NOT NULL PK,
    instituicao character varying(512)
);
 */
public class Atuacao{
	
	private int contadorAtuacao;
	private String lattesId;
	private String instituicao;
	
	public Atuacao(){
		
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

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

}
