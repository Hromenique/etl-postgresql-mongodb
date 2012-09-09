package br.java.hromenique.carga.doc;

import java.util.List;
import org.bson.types.ObjectId;
import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(value = "projetos", noClassnameStored=true)
public class ProjetoDoc implements Documento {
	
	@Id
	private ObjectId id;
	private String lattesId;
	private String periodo;
	private Integer inicio;
	private Integer fim;
	private String titulo;
	private String situacao;
	private String natureza;
	@Embedded
	private List<AlunosEnvolvidosProjetoDoc> alunosEnvolvidos;
	private List<String> nomesIntegrantes;
	private List<String> lattesIdIntegrantes;
	private List<String> nomeCoordenadores;
	private List<String> lattesIdCoordenadores;
	@Embedded
	private List<FinanciadorDoc> financiadores;
	private Integer numeroDeOrientacoes;
	private Integer numeroDeProducoesCTA;		
	
	public ProjetoDoc(){
		
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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public List<AlunosEnvolvidosProjetoDoc> getAlunosEnvolvidos() {
		return alunosEnvolvidos;
	}

	public void setAlunosEnvolvidos(
			List<AlunosEnvolvidosProjetoDoc> alunosEnvolvidos) {
		this.alunosEnvolvidos = alunosEnvolvidos;
	}

	public List<String> getNomesIntegrantes() {
		return nomesIntegrantes;
	}

	public void setNomesIntegrantes(List<String> nomesIntegrantes) {
		this.nomesIntegrantes = nomesIntegrantes;
	}

	public List<String> getLattesIdIntegrantes() {
		return lattesIdIntegrantes;
	}

	public void setLattesIdIntegrantes(List<String> lattesIdIntegrantes) {
		this.lattesIdIntegrantes = lattesIdIntegrantes;
	}

	public List<String> getNomeCoordenadores() {
		return nomeCoordenadores;
	}

	public void setNomeCoordenadores(List<String> nomeCoordenadores) {
		this.nomeCoordenadores = nomeCoordenadores;
	}

	public List<String> getLattesIdCoordenadores() {
		return lattesIdCoordenadores;
	}

	public void setLattesIdCoordenadores(List<String> lattesIdCoordenadores) {
		this.lattesIdCoordenadores = lattesIdCoordenadores;
	}	

	public Integer getNumeroDeOrientacoes() {
		return numeroDeOrientacoes;
	}

	public void setNumeroDeOrientacoes(Integer numeroDeOrientacoes) {
		this.numeroDeOrientacoes = numeroDeOrientacoes;
	}

	public List<FinanciadorDoc> getFinanciadores() {
		return financiadores;
	}

	public void setFinanciadores(List<FinanciadorDoc> financiadores) {
		this.financiadores = financiadores;
	}

	public Integer getNumeroDeProducoesCTA() {
		return numeroDeProducoesCTA;
	}

	public void setNumeroDeProducoesCTA(Integer numeroDeProducoesCTA) {
		this.numeroDeProducoesCTA = numeroDeProducoesCTA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((alunosEnvolvidos == null) ? 0 : alunosEnvolvidos.hashCode());
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result
				+ ((financiadores == null) ? 0 : financiadores.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime
				* result
				+ ((lattesIdCoordenadores == null) ? 0 : lattesIdCoordenadores
						.hashCode());
		result = prime
				* result
				+ ((lattesIdIntegrantes == null) ? 0 : lattesIdIntegrantes
						.hashCode());
		result = prime * result
				+ ((natureza == null) ? 0 : natureza.hashCode());
		result = prime
				* result
				+ ((nomeCoordenadores == null) ? 0 : nomeCoordenadores
						.hashCode());
		result = prime
				* result
				+ ((nomesIntegrantes == null) ? 0 : nomesIntegrantes.hashCode());
		result = prime
				* result
				+ ((numeroDeOrientacoes == null) ? 0 : numeroDeOrientacoes
						.hashCode());
		result = prime
				* result
				+ ((numeroDeProducoesCTA == null) ? 0 : numeroDeProducoesCTA
						.hashCode());
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		result = prime * result
				+ ((situacao == null) ? 0 : situacao.hashCode());
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
		ProjetoDoc other = (ProjetoDoc) obj;
		if (alunosEnvolvidos == null) {
			if (other.alunosEnvolvidos != null)
				return false;
		} else if (!alunosEnvolvidos.equals(other.alunosEnvolvidos))
			return false;
		if (fim == null) {
			if (other.fim != null)
				return false;
		} else if (!fim.equals(other.fim))
			return false;
		if (financiadores == null) {
			if (other.financiadores != null)
				return false;
		} else if (!financiadores.equals(other.financiadores))
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
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (lattesIdCoordenadores == null) {
			if (other.lattesIdCoordenadores != null)
				return false;
		} else if (!lattesIdCoordenadores.equals(other.lattesIdCoordenadores))
			return false;
		if (lattesIdIntegrantes == null) {
			if (other.lattesIdIntegrantes != null)
				return false;
		} else if (!lattesIdIntegrantes.equals(other.lattesIdIntegrantes))
			return false;
		if (natureza == null) {
			if (other.natureza != null)
				return false;
		} else if (!natureza.equals(other.natureza))
			return false;
		if (nomeCoordenadores == null) {
			if (other.nomeCoordenadores != null)
				return false;
		} else if (!nomeCoordenadores.equals(other.nomeCoordenadores))
			return false;
		if (nomesIntegrantes == null) {
			if (other.nomesIntegrantes != null)
				return false;
		} else if (!nomesIntegrantes.equals(other.nomesIntegrantes))
			return false;
		if (numeroDeOrientacoes == null) {
			if (other.numeroDeOrientacoes != null)
				return false;
		} else if (!numeroDeOrientacoes.equals(other.numeroDeOrientacoes))
			return false;
		if (numeroDeProducoesCTA == null) {
			if (other.numeroDeProducoesCTA != null)
				return false;
		} else if (!numeroDeProducoesCTA.equals(other.numeroDeProducoesCTA))
			return false;
		if (periodo == null) {
			if (other.periodo != null)
				return false;
		} else if (!periodo.equals(other.periodo))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}	
}
