package br.java.hromenique.carga.doc;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(value = "orientacoes", noClassnameStored = true)
public class OrientacaoDoc implements Documento {
	@Id
	private int id;
	private String titulo;
	private Integer ano;
	private String lattesId;
	private String nome;
	private String orientadorNome;
	private String orientadorLattesId;
	private String financiador;		
	private String local;
	private String nivel;
	private Integer tipo;
	private Character ehCoorientador;
	
	public OrientacaoDoc(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
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

	public String getOrientadorNome() {
		return orientadorNome;
	}

	public void setOrientadorNome(String orientadorNome) {
		this.orientadorNome = orientadorNome;
	}

	public String getOrientadorLattesId() {
		return orientadorLattesId;
	}

	public void setOrientadorLattesId(String orientadorLattesId) {
		this.orientadorLattesId = orientadorLattesId;
	}

	public String getFinanciador() {
		return financiador;
	}

	public void setFinanciador(String financiador) {
		this.financiador = financiador;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Character getEhCoorientador() {
		return ehCoorientador;
	}

	public void setEhCoorientador(Character ehCoorientador) {
		this.ehCoorientador = ehCoorientador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result
				+ ((ehCoorientador == null) ? 0 : ehCoorientador.hashCode());
		result = prime * result
				+ ((financiador == null) ? 0 : financiador.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime
				* result
				+ ((orientadorLattesId == null) ? 0 : orientadorLattesId
						.hashCode());
		result = prime * result
				+ ((orientadorNome == null) ? 0 : orientadorNome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		OrientacaoDoc other = (OrientacaoDoc) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (ehCoorientador == null) {
			if (other.ehCoorientador != null)
				return false;
		} else if (!ehCoorientador.equals(other.ehCoorientador))
			return false;
		if (financiador == null) {
			if (other.financiador != null)
				return false;
		} else if (!financiador.equals(other.financiador))
			return false;
		if (id != other.id)
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nivel == null) {
			if (other.nivel != null)
				return false;
		} else if (!nivel.equals(other.nivel))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
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
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}
