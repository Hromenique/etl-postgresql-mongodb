package br.java.hromenique.extracao.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *  @author Hromenique Cezniowscki Leite Batista
 *  
 *  Esta classe representa uma instância da tabela (entidade) 'curriculos'
 * CREATE TABLE curriculos (
 *     lattesid character(16) NOT NULL,
 *     nome character varying(512) NOT NULL,
 *     bolsaprodutividade character(2), 
 *     ultimaatualizacao integer,
 *     sexo character(1)
 *     )
 */
@Entity
@Table(name="curriculos")
public class CurriculoVO implements Serializable, Tabela{		
	
	private static final long serialVersionUID = 8311777714242955844L;
	@Id	
	private  String lattesId;
	private String nome;
	private String bolsaProdutividade;
	private Integer ultimaAtualizacao;
	private char sexo;
	@OneToMany
	@JoinColumn(name = "lattesid")
	private List<FormacaoVO> formacoes;
	
	@OneToMany
	@JoinColumn(name = "orientadorlattesId")
	private List<OrientacaoVO> orientacoes;
	
	@OneToMany
	@JoinColumn(name = "lattesid")
	private List<AreaAtuacaoVO> areasAtuacao;
	
	@OneToMany
	@JoinColumn(name = "lattesid")
	private List<AtuacaoVO> atuacoes;
	
	@OneToMany
	@JoinColumn(name = "lattesId")
	private List<NomeCitacaoVO> nomesUsadosEmCitacoes;
	
	public CurriculoVO(){
		
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

	public String getBolsaProdutividade() {
		return bolsaProdutividade;
	}

	public void setBolsaProdutividade(String bolsaProdutividade) {
		this.bolsaProdutividade = bolsaProdutividade;
	}

	public Integer getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(Integer ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public List<FormacaoVO> getFormacoes() {
		return formacoes;
	}

	public void setFormacoes(List<FormacaoVO> formacoes) {
		this.formacoes = formacoes;
	}

	public List<OrientacaoVO> getOrientacoes() {
		return orientacoes;
	}

	public void setOrientacoes(List<OrientacaoVO> orientacoes) {
		this.orientacoes = orientacoes;
	}

	public List<AreaAtuacaoVO> getAreasAtuacao() {
		return areasAtuacao;
	}

	public void setAreasAtuacao(List<AreaAtuacaoVO> areasAtuacao) {
		this.areasAtuacao = areasAtuacao;
	}

	public List<AtuacaoVO> getAtuacoes() {
		return atuacoes;
	}

	public void setAtuacoes(List<AtuacaoVO> atuacoes) {
		this.atuacoes = atuacoes;
	}

	public List<NomeCitacaoVO> getNomesUsadosEmCitacoes() {
		return nomesUsadosEmCitacoes;
	}

	public void setNomesUsadosEmCitacoes(List<NomeCitacaoVO> nomesUsadosEmCitacoes) {
		this.nomesUsadosEmCitacoes = nomesUsadosEmCitacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((bolsaProdutividade == null) ? 0 : bolsaProdutividade
						.hashCode());
		result = prime * result
				+ ((lattesId == null) ? 0 : lattesId.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + sexo;
		result = prime * result + ultimaAtualizacao;
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
		CurriculoVO other = (CurriculoVO) obj;
		if (bolsaProdutividade == null) {
			if (other.bolsaProdutividade != null)
				return false;
		} else if (!bolsaProdutividade.equals(other.bolsaProdutividade))
			return false;
		if (lattesId == null) {
			if (other.lattesId != null)
				return false;
		} else if (!lattesId.equals(other.lattesId))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		if (ultimaAtualizacao != other.ultimaAtualizacao)
			return false;
		return true;
	}
	
}
