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
		try {
			gerarArrays();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void gerarArrays() throws InterruptedException {
//		int tamanho = 10;
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println("\nTamanho: " + tamanho);
//			
//			preencherArray(arrays[i], tamanho);
//			tamanho *= 10;
//		}
		
		preencherArray(arraysTamanho1000000, 1000000);
		
//		Thread.sleep(5000);
//		HandlerXMLFileArrays.converter(arraysTamanho1000000, "arraysTamanho1000000");
	}

	private static void preencherArray(Long[][] arrays, int tamanho) throws InterruptedException {
//		arrays[0] = GeradorDeSequencias.geradorSequenciaOrdenada(tamanho);
//		System.out.println("Gerada Sequencia Ordenada");
//		HandlerXMLFileArrays.converter(arrays[0], "arraysTamanho1000000Ordenado");
//		
//		arrays[1] = GeradorDeSequencias.geradorSequenciaInversamenteOrdenada(tamanho);
//		System.out.println("Gerada Sequencia Inversamente Ordenada");
//		HandlerXMLFileArrays.converter(arrays[1], "arraysTamanho1000000InversamenteOrdenado");
		
		Long[][] arrays1000000QuaseOrdenado = new Long[14][];
		for(int i = 0; i < 14; i++) {
			arrays1000000QuaseOrdenado[i] = GeradorDeSequencias.geradorSequenciaQuaseOrdenada(tamanho);
		}
		System.out.println("Gerada Sequencia Quase Ordenada");
		HandlerXMLFileArrays.converter(arrays1000000QuaseOrdenado, "arraysTamanho1000000QuaseOrdenado");
		
//		Long[][] arrays1000000Aleatorio = new Long[14][];
//		for(int j = 0; j < 14; j++) {
//			arrays1000000Aleatorio[j] = GeradorDeSequencias.geradorSequenciaAleatoria(tamanho);
//		}
//		System.out.println("Gerada Sequencia Aleatoria");
//		HandlerXMLFileArrays.converter(arrays1000000Aleatorio, "arraysTamanho1000000Aleatorio");
	}
}

















