package br.com.caelum.contas.modelo;

public interface Tributavel { //interface é um contrato que deve ser cumprido - Ex. Interface possui dívida e quem extender dela deve pagar as dívidas abaixo
	public double getValorImposto();
	public String getTitular();
	public String getTipo();
	
}
