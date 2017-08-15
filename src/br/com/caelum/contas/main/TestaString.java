package br.com.caelum.contas.main;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		//s.replaceAll("1", "2");
		
		s = s.toUpperCase().replaceAll("1", "2");
		
		System.out.println(s);
		
		//arrays
		int[] idades = new int[3];
		idades[0] = 20;
		idades[1] = 25;
		idades[2] = 35;
		
		int soma = 0;
		
		for (int i = 0; i<idades.length; i++){
			soma += idades[i];
			
		}
		double media = soma / idades.length;
		System.out.println(media);
		
		
				
	}

}
