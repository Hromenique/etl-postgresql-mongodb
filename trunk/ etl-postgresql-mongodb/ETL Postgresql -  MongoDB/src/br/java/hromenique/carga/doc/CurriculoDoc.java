package br.java.hromenique.carga.doc;

import java.util.List;

public class CurriculoDoc {
	
	private  String id;
	private String nome;
	private String bolsaProdutividade;
	private Integer ultimaAtualizacao;
	private char sexo;
	private List<String> nomesUsadosEmCitacoes;
	private List<AreaAtuacaoDoc> areasAtuacao;
	private List<String> atuacoes;
	private List<Integer> formacoes;
	private List<Integer> orientacoes;	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public List<String> getNomesUsadosEmCitacoes() {
		return nomesUsadosEmCitacoes;
	}
	public void setNomesUsadosEmCitacoes(List<String> nomesUsadosEmCitacoes) {
		this.nomesUsadosEmCitacoes = nomesUsadosEmCitacoes;
	}
	public List<AreaAtuacaoDoc> getAreasAtuacao() {
		return areasAtuacao;
	}
	public void setAreasAtuacao(List<AreaAtuacaoDoc> areasAtuacao) {
		this.areasAtuacao = areasAtuacao;
	}
	public List<String> getAtuacoes() {
		return atuacoes;
	}
	public void setAtuacoes(List<String> atuacoes) {
		this.atuacoes = atuacoes;
	}
	public List<Integer> getFormacoes() {
		return formacoes;
	}
	public void setFormacoes(List<Integer> formacoes) {
		this.formacoes = formacoes;
	}
	public List<Integer> getOrientacoes() {
		return orientacoes;
	}
	public void setOrientacoes(List<Integer> orientacoes) {
		this.orientacoes = orientacoes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((areasAtuacao == null) ? 0 : areasAtuacao.hashCode());
		result = prime * result
				+ ((atuacoes == null) ? 0 : atuacoes.hashCode());
		result = prime
				* result
				+ ((bolsaProdutividade == null) ? 0 : bolsaProdutividade
						.hashCode());
		result = prime * result
				+ ((formacoes == null) ? 0 : formacoes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime
				* result
				+ ((nomesUsadosEmCitacoes == null) ? 0 : nomesUsadosEmCitacoes
						.hashCode());
		result = prime * result
				+ ((orientacoes == null) ? 0 : orientacoes.hashCode());
		result = prime * result + sexo;
		result = prime
				* result
				+ ((ultimaAtualizacao == null) ? 0 : ultimaAtualizacao
						.hashCode());
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
		CurriculoDoc other = (CurriculoDoc) obj;
		if (areasAtuacao == null) {
			if (other.areasAtuacao != null)
				return false;
		} else if (!areasAtuacao.equals(other.areasAtuacao))
			return false;
		if (atuacoes == null) {
			if (other.atuacoes != null)
				return false;
		} else if (!atuacoes.equals(other.atuacoes))
			return false;
		if (bolsaProdutividade == null) {
			if (other.bolsaProdutividade != null)
				return false;
		} else if (!bolsaProdutividade.equals(other.bolsaProdutividade))
			return false;
		if (formacoes == null) {
			if (other.formacoes != null)
				return false;
		} else if (!formacoes.equals(other.formacoes))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomesUsadosEmCitacoes == null) {
			if (other.nomesUsadosEmCitacoes != null)
				return false;
		} else if (!nomesUsadosEmCitacoes.equals(other.nomesUsadosEmCitacoes))
			return false;
		if (orientacoes == null) {
			if (other.orientacoes != null)
				return false;
		} else if (!orientacoes.equals(other.orientacoes))
			return false;
		if (sexo != other.sexo)
			return false;
		if (ultimaAtualizacao == null) {
			if (other.ultimaAtualizacao != null)
				return false;
		} else if (!ultimaAtualizacao.equals(other.ultimaAtualizacao))
			return false;
		return true;
	}
}
