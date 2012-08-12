package br.java.hromenique.extracao.vo;

/*
 * Esta classe representa uma instância da tabela (entidade) 'curriculosprogramas'
 * CREATE TABLE curriculosprogramas (
    lattesid character(16),
    programaid integer FK(programas.id),
    anoinicio integer,
    anofim integer
);
 */
public class CurriculoPrograma{
	
	private String lattesId;
	private int programaId;
	private int anoInicio;
	private int anoFim;
	
	public CurriculoPrograma(){

	}
	
	public String getLattesId() {
		return lattesId;
	}
	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}
	public int getProgramaId() {
		return programaId;
	}
	public void setProgramaId(int programaId) {
		this.programaId = programaId;
	}
	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}
	public int getAnoFim() {
		return anoFim;
	}
	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}
	
	
}
