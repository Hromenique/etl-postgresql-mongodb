package br.java.hromenique.extracao.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * 
 * Esta classe representa uma instância da tabela (entidade) 'areasdeatuacao'
 * CREATE TABLE areasdeatuacao (
 * contador integer NOT NULL,
 *  lattesid character(16) NOT NULL,
 *  grandearea character varying(512),
 *  area character varying(512),
 *  subarea character varying(512),
 * especialidade character varying(512)
 *);
 */

@Entity
@Table(name = "AreasDeAtuacao")
@IdClass(value = ContadorIdPK.class)
public class AreaAtuacaoVO implements Serializable, Tabela{	
	
	private static final long serialVersionUID = -6915820100558703373L;
	@Id
	private int contador;
	@Id
	private String lattesId;
	private String grandeArea;
	private String area;
	private String subArea;
	private String especialidade;
	
	public AreaAtuacaoVO(){
		
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

	public String getGrandeArea() {
		return grandeArea;
	}

	public void setGrandeArea(String grandeArea) {
		this.grandeArea = grandeArea;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + contador;
		result = prime * result
				+ ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result
				+ ((grandeArea == null) ? 0 : grandeArea.hashCode());
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime * result + ((subArea == null) ? 0 : subArea.hashCode());
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
		AreaAtuacaoVO other = (AreaAtuacaoVO) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (contador != other.contador)
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (grandeArea == null) {
			if (other.grandeArea != null)
				return false;
		} else if (!grandeArea.equals(other.grandeArea))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (subArea == null) {
			if (other.subArea != null)
				return false;
		} else if (!subArea.equals(other.subArea))
			return false;
		return true;
	}	
}
