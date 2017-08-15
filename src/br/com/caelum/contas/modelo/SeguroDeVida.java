package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{ //implementa a interface Tributável devido a taxa fixa de R$ 42.00 + 2% do valor do seguro

	private double valor;
	private String titular;
	private int numeroApolice;
	
	//GETTERS & SETTERS
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 42 + this.valor * 0.02;
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Seguro de Vida"; //modificado de return null para return "Seguro de Vida", pois o tipo é Seguro de Vida (e não Conta Corrente ou Conta Poupança)
	}
	
}
