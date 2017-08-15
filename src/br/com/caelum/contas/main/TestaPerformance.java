package br.com.caelum.contas.main;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		long addInicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long addFim = System.currentTimeMillis();
		long fimAdd = addFim - addInicio;
			System.out.println("Tempo gasto para adicionar: " + fimAdd);
			
		long procInicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long procFim = System.currentTimeMillis();
		long procAdd = procFim - procInicio;
		System.out.println("Tempo gasto para buscar: " + procAdd);
		
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
