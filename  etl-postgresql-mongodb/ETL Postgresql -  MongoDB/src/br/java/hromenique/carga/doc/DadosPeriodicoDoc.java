package br.java.hromenique.carga.doc;

public class DadosPeriodicoDoc {
	
	private String nomePeriodico;
	private String numero;
	private String issn;
	
	public DadosPeriodicoDoc(String nomePeriodico, String numero, String issn) {
		super();
		this.nomePeriodico = nomePeriodico;
		this.numero = numero;
		this.issn = issn;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((issn == null) ? 0 : issn.hashCode());
		result = prime * result
				+ ((nomePeriodico == null) ? 0 : nomePeriodico.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		DadosPeriodicoDoc other = (DadosPeriodicoDoc) obj;
		if (issn == null) {
			if (other.issn != null)
				return false;
		} else if (!issn.equals(other.issn))
			return false;
		if (nomePeriodico == null) {
			if (other.nomePeriodico != null)
				return false;
		} else if (!nomePeriodico.equals(other.nomePeriodico))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
}
