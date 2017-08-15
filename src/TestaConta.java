//package br.com.caelum.contas.pj; //esta minha classe está neste pacote
//import br.com.caelum.conta.pj; //roda os código consideração esta estrutura

class TestaConta {
	public static void main(String[] args) {

		Conta c1 = new Conta("Thiago Martins", 123);

		// c1.settitular ("thiago martins"); //método

		// c1.setnumero (659401);
		c1.setAgencia("0890-1");
		//c1.setSaldo(500.00);
		c1.setDataAbertura("10/07/2017");
		c1.setCpf("123.456.789-12");

		c1.deposita(1000.00); // utiliza o () quando for método

		c1.saca(10.00);
		c1.saca(100.00);

		Conta c2 = new Conta("André Martins", 456);
		c2.setAgencia("0890-1");
		//c2.setSaldo(500.00);
		c2.setDataAbertura("20/07/2017");
		c2.setCpf("999.999.999-99");

		c2.deposita(100.00); // utiliza o () quando for método
		c2.saca(10.00);

		System.out.println(c1.recuperaDadosParaImpressao());
		
		System.out.println(c2.recuperaDadosParaImpressao());
		
		System.out.println("\nTotal de contas cadastradas: " + c1.getContador());

		// System.out.println(Conta.getContador);

		// impressão dos dados já definidos no class Conta, dispensando os SYSOUTs
		// abaixo
		// System.out.println("\nTitular: " + c1.titular);
		// System.out.println("Agência nº: " + c1.agencia);
		// System.out.println("Conta nº: " + c1.numero);
		// System.out.println("Saldo Atual: " + c1.saldo);
		// System.out.println("Rendimento mensal: " + c1.calculaRendimento());

		// ************************ composição
		// Titular t1 = new Titular ();
		// t1.nome = "Lucas";
		// t1.cpf = "200.200";
		// c1.cliente = t1;

		// System.out.println(c1.cliente.cpf); //mostra o cpf cadastrado
		// c1.cliente.cpf = "345";
		// System.out.println(t1.cpf);

	}
}
