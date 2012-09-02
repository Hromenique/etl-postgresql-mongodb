package br.java.hromenique.extracao.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista
 * Esta classe representa uma instância da tabela (entidade) 'integrantesprojetos'
 * CREATE TABLE integrantesprojetos (
 * contador integer NOT NULL,
 * contadorprojeto integer NOT NULL,
 * lattesid character(16) NOT NULL,
 * integrantelattesid character(16),
 * integrantenome character varying(512) NOT NULL
 * );
 */

@Entity
@Table(name = "integrantesprojetos")
@IdClass(value = IntegranteProjetoPK.class)
public class IntegranteProjetoVO {
	@Id
	private int contador;
	@Id
	private int contadorProjeto;
	@Id
	private String lattesId;
	private String integranteLattesId;
	private String integranteNome;
	
	public IntegranteProjetoVO(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getContadorProjeto() {
		return contadorProjeto;
	}

	public void setContadorProjeto(int contadorProjeto) {
		this.contadorProjeto = contadorProjeto;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getIntegranteLattesId() {
		return integranteLattesId;
	}

	public void setIntegranteLattesId(String integranteLattesId) {
		this.integranteLattesId = integranteLattesId;
	}

	public String getIntegranteNome() {
		return integranteNome;
	}

	public void setIntegranteNome(String integranteNome) {
		this.integranteNome = integranteNome;
	}	
}
