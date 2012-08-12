package br.java.hromenique.extracao.vo;

/*
 *  Esta classe representa uma instância da tabela (entidade) 'lattespublicacoes'
 * CREATE TABLE lattespublicacoes (
    contador integer NOT NULL,
    publicacaoid integer NOT NULL,
    lattesid character(16) NOT NULL
);
 */
public class LattesPublicacao {
	
	private int contador;
	private int publicacaoId;
	private String lattesId;
	
	public LattesPublicacao(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}
}
