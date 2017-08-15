class Conta {

	// esta não tem método main pq é o conceito - classe

	// atributos da classe conta
	// Titular cliente = new Titular();
	static int contador; // static p/ definir que ele pertence a classe e ñ aos objetos
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	private String cpf;
	//private int id;

	// CONSTRUTOR
	public Conta() { // deixar sem argumento para deixar opcional a informação
	}

	public Conta(String titular, int numero) {
		// setTitular(titular);
		//System.out.println("\nSeguem informações das contas: ");
		this.titular = titular;
		this.numero = numero;
		contador++;
	}

	 //public static int getContador(){
	 //return contador;}
	// {

	// }

	void deposita(double valor) {
		// acima é a função ou método da classe Conta - void qdo ñ quero retornar
		// nenhuma informação a quem solicitou
		// saldo = saldo + valor;
		this.saldo = this.saldo + valor;
		// o this funciona apenas nos atributos da classe - não funcionaria para
		// variável(this.valor) - valor é = parâmetro ou argumento
		// this.saldo += quantidade; //neste caso 0 += soma quantidade ao valor antigo
		// do saldo e guarda no proprio saldo o valor resultante
	}

	// SACAR+ ("\n")
	boolean saca(double valor) {
		// método com retorno
		if (valor <= this.saldo) {
			this.saldo = (this.saldo - valor);
			return true;
		}
		return false;
		// só chegará aqui se o resultado não for para o if - o return encerra
	}

	// CÁLCULO DE RENDIMENTO MENSAL
	double calculaRendimento() {
		// ñ precisa definir nada pq ele vai trabalhar em cima do saldo que já está
		// definido
		return this.saldo * 0.1;
	}

	// IMPRESSÃO DAS INFORMAÇÕES DA CONTA - EXTRATO
	String recuperaDadosParaImpressao() {
		System.out.println();
		String dados = "\nTitular: " + this.titular;
		dados += "\nCPF: " + this.cpf;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo atual: R$" + this.saldo;
		dados += "\nData de abertura da conta: " + this.dataAbertura;
		dados += "\nRendimento: R$ " + this.calculaRendimento() + (" ao mês (10%)");
		//dados += "\n\nQtd contas cadastradas: " + this.getContador() + ("\n");
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

}
