package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'publicacoesperiodicos'
 * CREATE TABLE publicacoesperiodicos (
    publicacaoid integer NOT NULL,
    nomeperiodico character varying(512),
    numero character(16),
    issn character varying(128)
);
 */
public class PublicacaoPeriodico {
	
	private int publicacaoId;
	private String nomePeriodico;
	private String numero;
	private String issn;
	
	public PublicacaoPeriodico(){
		
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public String getNomePeriodico() {
		return nomePeriodico;
	}

	public void setNomePeriodico(String nomePeriodico) {
		this.nomePeriodico = nomePeriodico;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}
}
