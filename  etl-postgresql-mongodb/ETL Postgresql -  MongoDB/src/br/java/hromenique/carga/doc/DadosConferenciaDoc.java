package br.java.hromenique.carga.doc;

public class DadosConferenciaDoc {
	
	private String nomeEvento;
	private String tituloAnais;
	
	public DadosConferenciaDoc(String nomeEvento, String tituloAnais) {
		super();
		this.nomeEvento = nomeEvento;
		this.tituloAnais = tituloAnais;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomeEvento == null) ? 0 : nomeEvento.hashCode());
		result = prime * result
				+ ((tituloAnais == null) ? 0 : tituloAnais.hashCode());
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
		DadosConferenciaDoc other = (DadosConferenciaDoc) obj;
		if (nomeEvento == null) {
			if (other.nomeEvento != null)
				return false;
		} else if (!nomeEvento.equals(other.nomeEvento))
			return false;
		if (tituloAnais == null) {
			if (other.tituloAnais != null)
				return false;
		} else if (!tituloAnais.equals(other.tituloAnais))
			return false;
		return true;
	}
}
