package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'publicacoesconferencias'
 * CREATE TABLE publicacoesconferencias (
    publicacaoid integer NOT NULL,
    nomeevento character varying(512),
    tituloanais character varying(512)
);
 */
public class PublicacaoConferencia {
	
	private int publicacaoId;
	private String nomeEvento;
	private String tituloAnais;
	
	public PublicacaoConferencia(){
		
	}

	public int getPublicacaoId() {
		return publicacaoId;
	}

	public void setPublicacaoId(int publicacaoId) {
		this.publicacaoId = publicacaoId;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getTituloAnais() {
		return tituloAnais;
	}

	public void setTituloAnais(String tituloAnais) {
		this.tituloAnais = tituloAnais;
	}
}
