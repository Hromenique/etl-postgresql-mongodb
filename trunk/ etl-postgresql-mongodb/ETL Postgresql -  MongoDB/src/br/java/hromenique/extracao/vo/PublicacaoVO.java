package br.java.hromenique.extracao.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista <br/>
 * Esta classe representa uma instância da tabela (entidade) 'publicacoes '
 * CREATE TABLE publicacoes (
 * id integer NOT NULL,
 * titulo character varying(1024),
 * local character varying(1024),
 * paginas character varying(128),
 * volume character varying(128),
 * autores text,
 * ano integer,
 * tipo integer,
 * idunico integer
 *  );
 */
@Entity
@Table(name = "Publicacoes")
public class PublicacaoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String titulo;
	private String local;
	private String paginas;
	private String volume;
	private String autores;
	private int ano;
	private int tipo;
	private int idUnico;
	
	@ManyToMany
	@JoinTable(name = "lattesPublicacoes", joinColumns=@JoinColumn(name = "publicacaoId"),
	inverseJoinColumns = @JoinColumn(name = "lattesId"))
	private List<CurriculoVO> curriculosAutores;
	
	@OneToMany
	@JoinColumn(name = "publicacaoId")
	private List<AutorPublicacaoVO> autoresPublicacao;
	
	@OneToOne
	@JoinColumn(name = "publicacaoId")
	private PublicacaoConferenciaVO conferencia;
	
	@OneToOne
	@JoinColumn(name = "publicaoId")
	private PublicacaoPeriodicoVO periodico;
	
	public PublicacaoVO(){
		
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getIdUnico() {
		return idUnico;
	}

	public void setIdUnico(int idUnico) {
		this.idUnico = idUnico;
	}

	public List<CurriculoVO> getCurriculosAutores() {
		return curriculosAutores;
	}

	public void setCurriculosAutores(List<CurriculoVO> curriculosAutores) {
		this.curriculosAutores = curriculosAutores;
	}

	public List<AutorPublicacaoVO> getAutoresPublicacao() {
		return autoresPublicacao;
	}

	public void setAutoresPublicacao(List<AutorPublicacaoVO> autoresPublicacao) {
		this.autoresPublicacao = autoresPublicacao;
	}

	public PublicacaoConferenciaVO getConferencia() {
		return conferencia;
	}

	public void setConferencia(PublicacaoConferenciaVO conferencia) {
		this.conferencia = conferencia;
	}

	public PublicacaoPeriodicoVO getPeriodico() {
		return periodico;
	}

	public void setPeriodico(PublicacaoPeriodicoVO periodico) {
		this.periodico = periodico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime
				* result
				+ ((autoresPublicacao == null) ? 0 : autoresPublicacao
						.hashCode());
		result = prime * result
				+ ((conferencia == null) ? 0 : conferencia.hashCode());
		result = prime
				* result
				+ ((curriculosAutores == null) ? 0 : curriculosAutores
						.hashCode());
		result = prime * result + id;
		result = prime * result + idUnico;
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
		result = prime * result
				+ ((periodico == null) ? 0 : periodico.hashCode());
		result = prime * result + tipo;
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
		PublicacaoVO other = (PublicacaoVO) obj;
		if (ano != other.ano)
			return false;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (autoresPublicacao == null) {
			if (other.autoresPublicacao != null)
				return false;
		} else if (!autoresPublicacao.equals(other.autoresPublicacao))
			return false;
		if (conferencia == null) {
			if (other.conferencia != null)
				return false;
		} else if (!conferencia.equals(other.conferencia))
			return false;
		if (curriculosAutores == null) {
			if (other.curriculosAutores != null)
				return false;
		} else if (!curriculosAutores.equals(other.curriculosAutores))
			return false;
		if (id != other.id)
			return false;
		if (idUnico != other.idUnico)
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
		if (periodico == null) {
			if (other.periodico != null)
				return false;
		} else if (!periodico.equals(other.periodico))
			return false;
		if (tipo != other.tipo)
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
