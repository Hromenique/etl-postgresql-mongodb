package br.java.hromenique.extracao.vo;

/*
 *  Esta classe representa uma instância da tabela (entidade) 'publicacoesindicess'
CREATE TABLE publicacoesindices (
    publicacaoid integer NOT NULL,
    indiceid integer NOT NULL,
    valor double precision
);
 */
public class PublicacaoIndice {
	
	private int publicacaoId;
	private int indeiceId;
	private double valor;
	
	public PublicacaoIndice(){
		
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public int getIndeiceId() {
		return indeiceId;
	}

	public void setIndeiceId(int indeiceId) {
		this.indeiceId = indeiceId;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
