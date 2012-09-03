package br.java.hromenique.carga.doc;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(value="formacoes", noClassnameStored=true)
public class FormacaoDoc {
	
	@Id
	private ObjectId id;
	private String lattesId;		
	private String periodo;
	private Integer inicio;
	private Integer fim;
	private String titulo;
	private String instituicao;
	private String orientadorLattesId;
	private String orientadorNome;
	
	public FormacaoDoc(){
		
	}
	
	
	public ObjectId getId() {
		return id;
	}


	public void setId(ObjectId id) {
		this.id = id;
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
	public Integer getInicio() {
		return inicio;
	}
	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}
	public Integer getFim() {
		return fim;
	}
	public void setFim(Integer fim) {
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
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
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
		FormacaoDoc other = (FormacaoDoc) obj;
		if (fim == null) {
			if (other.fim != null)
				return false;
		} else if (!fim.equals(other.fim))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
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
