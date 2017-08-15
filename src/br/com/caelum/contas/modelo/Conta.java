package br.com.caelum.contas.modelo; //esta minha classe está neste pacote

/**
 * Classe para representar uma conta
 * 
 * @author Thiago Martins
 *
 */

public abstract class Conta implements Comparable<Conta>{ // esta classe representa um conceito abstrato -
								// não pode virar um objeto
								//toda classe extende de object qdo ñ tem extends na classe; qdo tem extends, 

	// MÉTODO PARA RETORNAR O TIPO DE CONTA DECLARADO NAS CLASSES FILHAS - Assim
	// para ter polimorfismo
	public abstract String getTipo();
	// abaixo sem polimorfismo
	/*
	 * public abstract String getTipo(){ return "Conta"; }
	 */

	// esta não tem método main pq é o conceito - classe

	// atributos da classe conta
	// Titular cliente = new Titular();
	static int contador; // static p/ definir que ele pertence a classe e ñ aos
							// objetos
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private String dataAbertura;
	private String cpf;
	// private int id;

	// pode comentar o construtor para funcionar o ManipuladorDeContas
	// CONSTRUTOR
	public Conta() { // deixar sem argumento para deixar opcional a informação
	}

	public Conta(String titular, int numero) {
		// setTitular(titular);
		// System.out.println("\nSeguem informações das contas: ");
		this.titular = titular;
		this.numero = numero;
		contador++;
	}

	// public static int getContador(){
	// return contador;}

	// MÉTODO CRÉDITO
	/**
	 * Método responsável por incrementar o saldo
	 * 
	 * @param valor
	 *            - valor a ser creditado
	 */
	public void deposita(double valor) {
		// acima é a função ou método da classe Conta - void qdo ñ quero
		// retornar
		// nenhuma informação a quem solicitou
		// saldo = saldo + valor;
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}

		// this.saldo = this.saldo + valor;

		// o this funciona apenas nos atributos da classe - não funcionaria para
		// variável(this.valor) - valor é = parâmetro ou argumento
		// this.saldo += quantidade; //neste caso 0 += soma quantidade ao valor
		// antigo
		// do saldo e guarda no proprio saldo o valor resultante
	}

	// MÉTODO DÉBITO - método sem retorno devido ao polimorfismo em
	// ContaCorrente
	/**
	 * Método responsável por decrementar o saldo
	 * 
	 * @param valor
	 *            - Valor a ser debitado
	 * @return
	 * 
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		// método com retorno
		if (valor <= this.saldo) {
			this.saldo = (this.saldo - valor);
		}

	}

	// MÉTODO DE TRANSFERÊNCIA (Precisa ter na classe filha ManipuladorDeConta
	// tb)
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	// CÁLCULO DE RENDIMENTO MENSAgetTipo();L
	public double calculaRendimento() {
		// ñ precisa definir nada pq ele vai trabalhar em cima do saldo que já
		// está
		// definido
		return this.saldo * 0.1;
	}

	// IMPRESSÃO DAS INFORMAÇÕES DA CONTA - EXTRATO
	public String recuperaDadosParaImpressao() {
		System.out.println();
		String dados = "\nTitular: " + this.titular;
		dados += "\nCPF: " + this.cpf;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo atual: R$" + this.saldo;
		dados += "\nData de abertura da conta: " + this.dataAbertura;
		dados += "\nRendimento: R$ " + this.calculaRendimento() + (" ao mês (10%)");
		// dados += "\n\nQtd contas cadastradas: " + this.getContador() +
		// ("\n");
		dados += "\nTipo: " + this.getTipo(); // retornar tipo de conta (pg 132)
		return dados;

	}

	// GETTERS & SETTERS
	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getDataAbertura() {
		return this.dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getContador() {
		return Conta.contador;
	}
	
	@Override //exibe dados definidos da conta ao invés do hash code
	public String toString (){
			String dados = "Titular: " + this.titular.toUpperCase(); //toUpperCase mostra nome maiúsculo na caixa de transferência
		return dados;
	}
	/*
	@Override //sobrescrevendo o Object
	public boolean equals(Object obj){
		Conta outra = (Conta) obj;
		if(this.titular != outra.titular){
			return false;
		}
		if (this.saldo != outra.saldo){
			return false;
		}
		return true;
	}*/
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

}
