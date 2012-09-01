package br.java.hromenique.extracao.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista
 *  Esta classe representa uma instância da tabela (entidade) 'nomesusadosemcitacoe'
 * CREATE TABLE nomesusadosemcitacoes (
 * lattesid character(16) NOT NULL,
 * nome character varying(512) NOT NULL
 *);
 */
@Entity
@Table(name = "nomesusadosemcitacoes")
@IdClass(value = NomeCitacaoPK.class)
public class NomeCitacaoVO {
	@Id
	private String lattesId;
	@Id
	private String nome;
	
	public NomeCitacaoVO(){
		
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
