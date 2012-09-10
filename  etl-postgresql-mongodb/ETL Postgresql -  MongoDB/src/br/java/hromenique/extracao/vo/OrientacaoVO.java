package br.java.hromenique.extracao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista
 * 
 * Esta classe representa uma instância da tabela (entidade) 'orientacoes'
 * CREATE TABLE orientacoes (
 *     id integer NOT NULL,
 *     titulo character varying(1024),
 *     ano integer,
 *     financiador character varying(1024),
 *     lattesid character(16),
 *     nome character varying(512),
 *     orientadorlattesid character(16),
 *     orientadornome character varying(512),
 *     local character varying(1024),
 *     nivel character varying(128), 
 *     tipo integer,
 *     ehcoorientador character(1)
 *     );
 */
@Entity
@Table(name = "orientacoes")
public class OrientacaoVO implements Serializable, Tabela{
	
	private static final long serialVersionUID = 5394124085102197085L;
	@Id
	private int id;
	private String titulo;
	private Integer ano;
	private String financiador;
	private String lattesId;
	private String nome;	
	private String orientadorNome;
	private String local;
	private String nivel;
	private Integer tipo;
	private char ehCoorientador;
	@ManyToOne
	@JoinColumn(name = "orientadorLattesId")
	private CurriculoVO curriculo;
	
	public OrientacaoVO(){
		
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

	public String getFinanciador() {
		return financiador;
	}

	public void setFinanciador(String financiador) {
		this.financiador = financiador;
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

	public char getEhCoorientador() {
		return ehCoorientador;
	}

	public void setEhCoorientador(char ehCoorientador) {
		this.ehCoorientador = ehCoorientador;
	}

	public CurriculoVO getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(CurriculoVO curriculo) {
		this.curriculo = curriculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result
				+ ((curriculo == null) ? 0 : curriculo.hashCode());
		result = prime * result + ehCoorientador;
		result = prime * result
				+ ((financiador == null) ? 0 : financiador.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((orientadorNome == null) ? 0 : orientadorNome.hashCode());
		result = prime * result + tipo;
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
		OrientacaoVO other = (OrientacaoVO) obj;
		if (ano != other.ano)
			return false;
		if (curriculo == null) {
			if (other.curriculo != null)
				return false;
		} else if (!curriculo.equals(other.curriculo))
			return false;
		if (ehCoorientador != other.ehCoorientador)
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
		if (orientadorNome == null) {
			if (other.orientadorNome != null)
				return false;
		} else if (!orientadorNome.equals(other.orientadorNome))
			return false;
		if (tipo != other.tipo)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}	
}
