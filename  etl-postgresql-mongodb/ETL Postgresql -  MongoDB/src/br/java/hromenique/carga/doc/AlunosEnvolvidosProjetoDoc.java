package br.java.hromenique.carga.doc;

public class AlunosEnvolvidosProjetoDoc {
	
	private String tipo;
	private Integer quantidade;
	
	public AlunosEnvolvidosProjetoDoc(String tipo, Integer quantidade) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
