package br.java.hromenique.extracao.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * 
 *  Esta classe representa uma instância da tabela (entidade) 'formacoes'
 * CREATE TABLE formacoes (
 *    contador integer NOT NULL,
 *    lattesid character(16) NOT NULL,
 *    periodo character varying(512),
 *    inicio integer,
 *    fim integer,
 *    titulo character varying(1024),
 *    instituicao character varying(1024),
 *    orientadorlattesid character(16),
 *    orientadornome character varying(512)
 *    );
 */
@Entity
@Table(name = "formacoes")
@IdClass(value=ContadorIdPK.class)
public class FormacaoVO implements Serializable{	

	private static final long serialVersionUID = -5803001298297036922L;
	@Id
	private int contador;
	@Id
	private String lattesId;	
	private String periodo;
	private int inicio;
	private int fim;
	private String titulo;
	private String instituicao;
	private String orientadorLattesId;
	private String orientadorNome;	
	
	public FormacaoVO(){
		
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getOrientadorLattesId() {
		return orientadorLattesId;
	}

	public void setOrientadorLattesId(String orientadorLattesId) {
		this.orientadorLattesId = orientadorLattesId;
	}

	public String getOrientadorNome() {
		return orientadorNome;
	}

	public void setOrientadorNome(String orientadorNome) {
		this.orientadorNome = orientadorNome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contador;
		result = prime * result + fim;
		result = prime * result + inicio;
		result = prime * result
				+ ((instituicao == null) ? 0 : instituicao.hashCode());
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime
				* result
				+ ((orientadorLattesId == null) ? 0 : orientadorLattesId
						.hashCode());
		result = prime * result
				+ ((orientadorNome == null) ? 0 : orientadorNome.hashCode());
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormacaoVO other = (FormacaoVO) obj;
		if (contador != other.contador)
			return false;
		if (fim != other.fim)
			return false;
		if (inicio != other.inicio)
			return false;
		if (instituicao == null) {
			if (other.instituicao != null)
				return false;
		} else if (!instituicao.equals(other.instituicao))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (orientadorLattesId == null) {
			if (other.orientadorLattesId != null)
				return false;
		} else if (!orientadorLattesId.equals(other.orientadorLattesId))
			return false;
		if (orientadorNome == null) {
			if (other.orientadorNome != null)
				return false;
		} else if (!orientadorNome.equals(other.orientadorNome))
			return false;
		if (periodo == null) {
			if (other.periodo != null)
				return false;
		} else if (!periodo.equals(other.periodo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}
