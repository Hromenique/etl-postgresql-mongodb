package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'autorespublicacoes'
 * CREATE TABLE autorespublicacoes (
    contador integer NOT NULL,
    publicacaoid integer NOT NULL,
    autorlattesid character(16),
    autornome character varying(512) NOT NULL
);
 */
public class AutorPublicacao {
	
	private int contador;
	private int publicacaoId;
	private String autorLattesId;
	private String autorNome;
	
	public AutorPublicacao(){
		
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

	public String getAutorLattesId() {
		return autorLattesId;
	}

	public void setAutorLattesId(String autorLattesId) {
		this.autorLattesId = autorLattesId;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}
}
