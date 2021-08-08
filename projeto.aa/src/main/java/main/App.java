package main;

import conversor.HandlerXMLFileArrays;
import sequencias.GeradorDeSequencias;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class App {
	
	
	private static Long[][] arraysTamanho10 = new Long[30][];
	private static Long[][] arraysTamanho100 = new Long[30][];
	private static Long[][] arraysTamanho1000 = new Long[30][];
	private static Long[][] arraysTamanho10000 = new Long[30][];
	private static Long[][] arraysTamanho100000 = new Long[30][];
	private static Long[][] arraysTamanho1000000 = new Long[30][];
	
	private static Long[][][] arrays = {
			arraysTamanho10,
			arraysTamanho100,
			arraysTamanho1000,
			arraysTamanho10000,
			arraysTamanho100000,
			arraysTamanho1000000,
	};

	public static void main(String[] args) {
		executar();
		// Teste
		// Teste 2
		// Teste 3
	}

	private static void executar() {
		gerarArrays();
	}

	private static void gerarArrays() {
//		int tamanho = 10;
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println("\nTamanho: " + tamanho);
//			
//			preencherArray(arrays[i], tamanho);
//			tamanho *= 10;
//		}
		
		preencherArray(arraysTamanho1000000, 1000000);
		
		HandlerXMLFileArrays.converter(arraysTamanho1000000, "arraysTamanho1000000");
	}

	private static void preencherArray(Long[][] arrays, int tamanho) {
		arrays[0] = GeradorDeSequencias.geradorSequenciaOrdenada(tamanho);
		System.out.println("Gerada Sequencia Ordenada");
		
		arrays[1] = GeradorDeSequencias.geradorSequenciaInversamenteOrdenada(tamanho);
		System.out.println("Gerada Sequencia Inversamente Ordenada");
		
		for(int i = 2; i < 16; i++) {
			arrays[i] = GeradorDeSequencias.geradorSequenciaQuaseOrdenada(tamanho);
		}
		System.out.println("Gerada Sequencia Quase Ordenada");
		
		for(int k = 16; k < 30; k++) {
			arrays[k] = GeradorDeSequencias.geradorSequenciaAleatoria(tamanho);
		}
		System.out.println("Gerada Sequencia Aleatoria");
	}
}

















