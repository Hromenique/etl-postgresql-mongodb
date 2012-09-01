package br.java.hromenique.extracao.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'atuacao'
 * CREATE TABLE atuacoes (
 * contadoratuacao integer NOT NULL PK,
 * lattesid character varying(16) NOT NULL PK,
 * instituicao character varying(512)
 * );
 */
@Entity
@Table(name = "atuacoes")
@IdClass(value = ContadorIdPK.class)
public class AtuacaoVO{
	
	@Id
	@Column(name = "contadoratuacao")
	private int contador;
	@Id
	private String lattesId;
	private String instituicao;
	
	public AtuacaoVO(){
		
	}

	public int getContadorAtuacao() {
		return contador;
	}

	public void setContadorAtuacao(int contadorAtuacao) {
		this.contador = contadorAtuacao;
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
