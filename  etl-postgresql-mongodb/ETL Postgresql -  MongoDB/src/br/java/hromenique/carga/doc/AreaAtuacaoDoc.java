package br.java.hromenique.carga.doc;

public class AreaAtuacaoDoc {
	
	private String grandeArea;
	private String area;
	private String subArea;
	private String especialidade;	

	public AreaAtuacaoDoc(String grandeArea, String area, String subArea, String especialidade) {
		super();
		this.grandeArea = grandeArea;
		this.area = area;
		this.subArea = subArea;
		this.especialidade = especialidade;
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
		result = prime * result
				+ ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result
				+ ((grandeArea == null) ? 0 : grandeArea.hashCode());
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
		AreaAtuacaoDoc other = (AreaAtuacaoDoc) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
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
		if (subArea == null) {
			if (other.subArea != null)
				return false;
		} else if (!subArea.equals(other.subArea))
			return false;
		return true;
	}
	
	
	
}
