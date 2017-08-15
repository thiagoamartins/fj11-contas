package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	// RECUPERAR TIPO DE CONTA - usar este ao invés do método "criaConta" abaixo
	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();

		}
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));

	}

	/*
	 * //MÉTODO CRIA CONTA - com as informações public void criaConta(Evento
	 * evento) { conta = new Conta(); conta.setTitular("Thiago Martins");
	 * conta.setNumero(659401); conta.setAgencia("0890-7");
	 * conta.setDataAbertura("21/7/2017"); conta.setCpf("999.999.999.-63");
	 * 
	 * }
	 */

	// MÉTODO DÉBITO
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");

		conta.saca(valor);
	}

	// MÉTODO CRÉDITO
	public void deposita(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		conta.deposita(valor);

	}
	
	// MÉTODO DE TRANSFERÊNCIA (precisar ter na classe pai Conta)
	public void transfere(Evento evento){
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	
	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.reverse (contas);
	}
	
	
}
