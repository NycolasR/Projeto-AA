package sequencias;

import java.util.Arrays;

import conversor.HandlerXMLFileArrays;

public class HandlerArrays {
	
	private static Long[][] arraysTamanho10 = new Long[30][];
	private static Long[][] arraysTamanho100 = new Long[30][];
	private static Long[][] arraysTamanho1000 = new Long[30][];
	private static Long[][] arraysTamanho10000 = new Long[30][];
	private static Long[][] arraysTamanho100000 = new Long[30][];
	private static Long[][] arraysTamanho1000000 = new Long[30][];
	
//	private static Long[][][] arrays = {
//			arraysTamanho10,
//			arraysTamanho100,
//			arraysTamanho1000,
//			arraysTamanho10000,
//			arraysTamanho100000,
//			arraysTamanho1000000,
//	};

	public static void executar() {
		try {
			gerarArrays();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void gerarArrays() throws InterruptedException {
//		preencherArray(arraysTamanho500000, 500000);
		
//		Thread.sleep(5000);
//		HandlerXMLFileArrays.converter(arraysTamanho500000, "arraysTamanho500000");
	}

	public static Long[][] preencherArray(Long[][] arrays, int tamanho) {
		arrays[0] = GeradorDeSequencias.geradorSequenciaOrdenada(tamanho);
		System.out.println("Gerada Sequencia Ordenada");
		
		arrays[1] = GeradorDeSequencias.geradorSequenciaInversamenteOrdenada(tamanho);
		System.out.println("Gerada Sequencia Inversamente Ordenada");
		
		for(int i = 2; i < 16; i++) {
			arrays[i] = GeradorDeSequencias.geradorSequenciaQuaseOrdenada(tamanho);
		}
		System.out.println("Gerada Sequencia Quase Ordenada");
		
		for(int j = 16; j < 30; j++) {
			arrays[j] = GeradorDeSequencias.geradorSequenciaAleatoria(tamanho);
		}
		System.out.println("Gerada Sequencia Aleatoria");
		
		return arrays;
	}

	
	public static Long[][] getArraysTamanho10() {
		arraysTamanho10 = HandlerXMLFileArrays.loadArrays(arraysTamanho10, "arraysTamanho10");
		return arraysTamanho10;
	}
	

	public static Long[][] getArraysTamanho100() {
		arraysTamanho100 = HandlerXMLFileArrays.loadArrays(arraysTamanho100, "arraysTamanho100");
		return arraysTamanho100;
	}
	

	public static Long[][] getArraysTamanho1000() {
		arraysTamanho1000 = HandlerXMLFileArrays.loadArrays(arraysTamanho1000, "arraysTamanho1000");
		return arraysTamanho1000;
	}
	

	public static Long[][] getArraysTamanho10000() {
		arraysTamanho10000 = HandlerXMLFileArrays.loadArrays(arraysTamanho10000, "arraysTamanho10000");
		return arraysTamanho10000;
	}
	

	public static Long[][] getArraysTamanho100000() {
		arraysTamanho100000 = HandlerXMLFileArrays.loadArrays(arraysTamanho100000, "arraysTamanho100000");
		return arraysTamanho100000;
	}
	

	public static Long[][] getArraysTamanho1000000() {
		arraysTamanho1000000 = HandlerXMLFileArrays.loadArrays(arraysTamanho1000000, "arraysTamanho1000000");
		return arraysTamanho1000000;
	}
	
	public static void printArrays(Long[][] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(Arrays.toString(arrays[i]));
		}
	}
}
