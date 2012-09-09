package br.java.hromenique.carga.doc;

import java.util.List;
import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(value = "publicacoes", noClassnameStored = true)
public class PublicacaoDoc implements Documento {
	@Id
	private int id;
	private String titulo;
	private String local;
	private String paginas;
	private String volume;
	private String autores;
	private Integer ano;
	private Integer tipo;
	private Integer idUnico;
	private List<String> autoresNomes;
	private List<String> autoresLattesId;
	@Embedded("periodico")
	private DadosPeriodicoDoc dadosPeriodico;
	@Embedded("conferencia")
	private DadosConferenciaDoc dadosConferencia;
	
	public PublicacaoDoc(){
		
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getPaginas() {
		return paginas;
	}
	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Integer getIdUnico() {
		return idUnico;
	}
	public void setIdUnico(Integer idUnico) {
		this.idUnico = idUnico;
	}
	public List<String> getAutoresNomes() {
		return autoresNomes;
	}
	public void setAutoresNomes(List<String> autoresNomes) {
		this.autoresNomes = autoresNomes;
	}
	public List<String> getAutoresLattesId() {
		return autoresLattesId;
	}
	public void setAutoresLattesId(List<String> autoresLattesId) {
		this.autoresLattesId = autoresLattesId;
	}
	public DadosPeriodicoDoc getDadosPeriodico() {
		return dadosPeriodico;
	}
	public void setDadosPeriodico(DadosPeriodicoDoc dadosPeriodico) {
		this.dadosPeriodico = dadosPeriodico;
	}
	public DadosConferenciaDoc getDadosConferencia() {
		return dadosConferencia;
	}
	public void setDadosConferencia(DadosConferenciaDoc dadosConferencia) {
		this.dadosConferencia = dadosConferencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result
				+ ((autoresLattesId == null) ? 0 : autoresLattesId.hashCode());
		result = prime * result
				+ ((autoresNomes == null) ? 0 : autoresNomes.hashCode());
		result = prime
				* result
				+ ((dadosConferencia == null) ? 0 : dadosConferencia.hashCode());
		result = prime * result
				+ ((dadosPeriodico == null) ? 0 : dadosPeriodico.hashCode());
		result = prime * result + id;
		result = prime * result + ((idUnico == null) ? 0 : idUnico.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
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
		PublicacaoDoc other = (PublicacaoDoc) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (autoresLattesId == null) {
			if (other.autoresLattesId != null)
				return false;
		} else if (!autoresLattesId.equals(other.autoresLattesId))
			return false;
		if (autoresNomes == null) {
			if (other.autoresNomes != null)
				return false;
		} else if (!autoresNomes.equals(other.autoresNomes))
			return false;
		if (dadosConferencia == null) {
			if (other.dadosConferencia != null)
				return false;
		} else if (!dadosConferencia.equals(other.dadosConferencia))
			return false;
		if (dadosPeriodico == null) {
			if (other.dadosPeriodico != null)
				return false;
		} else if (!dadosPeriodico.equals(other.dadosPeriodico))
			return false;
		if (id != other.id)
			return false;
		if (idUnico == null) {
			if (other.idUnico != null)
				return false;
		} else if (!idUnico.equals(other.idUnico))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
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
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}
}
