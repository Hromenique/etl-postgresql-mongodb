package br.java.hromenique.extracao.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**@author Hromenique Cezniowscki Leite Batista<br/>
 * Esta classe representa uma instância da tabela (entidade) 'projetosdepesquisa'
 * CREATE TABLE projetosdepesquisa (
 * contador integer NOT NULL,
 * lattesid character(16) NOT NULL,
 * periodo character varying(512),
 * inicio integer,
 * fim integer, 
 * titulo character varying(2048),
 * valorfinanciado character varying(1024),
 * situacao character varying(1024),
 * natureza character varying(1024),
 * alunosenvolvidos text,
 * integrantes text,
 * coordenadores text,
 * financiadores text,
 * numerodeorientacoes integer,
 * numerodeproducoescta integer
 * );
 */
@Entity
@Table(name = "projetosdepesquisa")
@IdClass(value = ContadorIdPK.class)
public class ProjetoPesquisaVO implements Serializable, Tabela{
	
	private static final long serialVersionUID = -4990027485851582552L;
	@Id
	@Column(updatable = false, insertable = false)
	private int contador;
	@Id
	@Column(updatable = false, insertable = false)
	private String lattesId;
	
	private String periodo;
	private Integer inicio;
	private Integer fim;
	private String titulo;
	private String valorFinanciado;
	private String situacao;
	private String natureza;
	private String alunosEnvolvidos;
	private String integrantes;
	private String coordenadores;
	private String financiadores;
	private Integer numeroDeOrientacoes;
	private Integer numeroDeProducoesCTA;
	
	@ManyToOne
	@JoinColumn(name = "lattesId")
	private CurriculoVO curriculo;	
	
	@OneToMany
	@JoinColumns(value = { @JoinColumn(name = "contador", referencedColumnName = "contador"),
			@JoinColumn(name = "lattesId", referencedColumnName = "lattesId") })
	private List<IntegranteProjetoVO> curriculosIntegrantes;
	
	@OneToMany
	@JoinColumns(value = { @JoinColumn(name = "contador", referencedColumnName = "contador"), 
			@JoinColumn(name = "lattesId", referencedColumnName = "lattesId") })
	private List<CoordenadorProjetoVO> curriculosCoordenadores;
	
	@OneToOne
	@JoinColumns(value = {@JoinColumn(name = "contador", referencedColumnName = "contador"), 
			@JoinColumn(name = "lattesId", referencedColumnName = "lattesId")})
	private ProjetoPesquisaDescricaoVO descricao;
	
	public ProjetoPesquisaVO(){
		
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

	public String getValorFinanciado() {
		return valorFinanciado;
	}

	public void setValorFinanciado(String valorFinanciado) {
		this.valorFinanciado = valorFinanciado;
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

	public String getAlunosEnvolvidos() {
		return alunosEnvolvidos;
	}

	public void setAlunosEnvolvidos(String alunosEnvolvidos) {
		this.alunosEnvolvidos = alunosEnvolvidos;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	public String getCoordenadores() {
		return coordenadores;
	}

	public void setCoordenadores(String coordenadores) {
		this.coordenadores = coordenadores;
	}

	public String getFinanciadores() {
		return financiadores;
	}

	public void setFinanciadores(String financiadores) {
		this.financiadores = financiadores;
	}

	public int getNumeroDeOrientacoes() {
		return numeroDeOrientacoes;
	}

	public void setNumeroDeOrientacoes(int numeroDeOrientacoes) {
		this.numeroDeOrientacoes = numeroDeOrientacoes;
	}

	public int getNumeroDeProducoesCTA() {
		return numeroDeProducoesCTA;
	}

	public void setNumeroDeProducoesCTA(int numeroDeProducoesCTA) {
		this.numeroDeProducoesCTA = numeroDeProducoesCTA;
	}

	public List<IntegranteProjetoVO> getCurriculosIntegrantes() {
		return curriculosIntegrantes;
	}

	public void setCurriculosIntegrantes(
			List<IntegranteProjetoVO> curriculosIntegrantes) {
		this.curriculosIntegrantes = curriculosIntegrantes;
	}

	public List<CoordenadorProjetoVO> getCurriculosCoordenadores() {
		return curriculosCoordenadores;
	}

	public void setCurriculosCoordenadores(
			List<CoordenadorProjetoVO> curriculosCoordenadores) {
		this.curriculosCoordenadores = curriculosCoordenadores;
	}

	public ProjetoPesquisaDescricaoVO getDescricao() {
		return descricao;
	}

	public void setDescricao(ProjetoPesquisaDescricaoVO descricaoVO) {
		this.descricao = descricaoVO;
	}

	public CurriculoVO getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(CurriculoVO curriculo) {
		this.curriculo = curriculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((alunosEnvolvidos == null) ? 0 : alunosEnvolvidos.hashCode());
		result = prime * result + contador;
		result = prime * result
				+ ((coordenadores == null) ? 0 : coordenadores.hashCode());
		result = prime * result
				+ ((curriculo == null) ? 0 : curriculo.hashCode());
		result = prime
				* result
				+ ((curriculosCoordenadores == null) ? 0
						: curriculosCoordenadores.hashCode());
		result = prime
				* result
				+ ((curriculosIntegrantes == null) ? 0 : curriculosIntegrantes
						.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result
				+ ((financiadores == null) ? 0 : financiadores.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result
				+ ((integrantes == null) ? 0 : integrantes.hashCode());
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime * result
				+ ((natureza == null) ? 0 : natureza.hashCode());
		result = prime * result + numeroDeOrientacoes;
		result = prime * result + numeroDeProducoesCTA;
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		result = prime * result
				+ ((situacao == null) ? 0 : situacao.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result
				+ ((valorFinanciado == null) ? 0 : valorFinanciado.hashCode());
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
		ProjetoPesquisaVO other = (ProjetoPesquisaVO) obj;
		if (alunosEnvolvidos == null) {
			if (other.alunosEnvolvidos != null)
				return false;
		} else if (!alunosEnvolvidos.equals(other.alunosEnvolvidos))
			return false;
		if (contador != other.contador)
			return false;
		if (coordenadores == null) {
			if (other.coordenadores != null)
				return false;
		} else if (!coordenadores.equals(other.coordenadores))
			return false;
		if (curriculo == null) {
			if (other.curriculo != null)
				return false;
		} else if (!curriculo.equals(other.curriculo))
			return false;
		if (curriculosCoordenadores == null) {
			if (other.curriculosCoordenadores != null)
				return false;
		} else if (!curriculosCoordenadores
				.equals(other.curriculosCoordenadores))
			return false;
		if (curriculosIntegrantes == null) {
			if (other.curriculosIntegrantes != null)
				return false;
		} else if (!curriculosIntegrantes.equals(other.curriculosIntegrantes))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
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
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (integrantes == null) {
			if (other.integrantes != null)
				return false;
		} else if (!integrantes.equals(other.integrantes))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (natureza == null) {
			if (other.natureza != null)
				return false;
		} else if (!natureza.equals(other.natureza))
			return false;
		if (numeroDeOrientacoes != other.numeroDeOrientacoes)
			return false;
		if (numeroDeProducoesCTA != other.numeroDeProducoesCTA)
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
		if (valorFinanciado == null) {
			if (other.valorFinanciado != null)
				return false;
		} else if (!valorFinanciado.equals(other.valorFinanciado))
			return false;
		return true;
	}
}
