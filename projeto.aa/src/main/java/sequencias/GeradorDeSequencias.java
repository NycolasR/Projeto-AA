package sequencias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class GeradorDeSequencias {
	
	private static Set<Long> sequencia;
	
	public static void main(String[] args) throws InterruptedException {
		System.err.println("<<< SEQUÊNCIA ORDENADA >>>");
		Thread.sleep(500);
		
		System.out.println("Tamanho 10:   " + Arrays.toString(geradorSequenciaOrdenada(10)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 100:  " + Arrays.toString(geradorSequenciaOrdenada(100)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 1000: " + Arrays.toString(geradorSequenciaOrdenada(1000)));
		Thread.sleep(500);
		
//		System.out.print("Tamanho 10000: ");
//		Long[] arr10000Ord = geradorSequenciaOrdenada(10000);
//		for (int i = 9999; i >= 0; i--) {
//			Thread.sleep(250);
//			System.out.print("[" + arr10000Ord[i] + "]");
//		}
//		
//		System.out.println();
		
//		System.out.print("Tamanho 100000: ");
//		Long[] arr100000Ord = geradorSequenciaOrdenada(100000);
//		for (int i = 99999; i >= 0; i--) {
//			Thread.sleep(250);
//			System.out.print("[" + arr100000Ord[i] + "]");
//		}
//		
//		System.out.println();
		
//		System.out.print("Tamanho 1000000: ");
//		Long[] arr1000000Ord = geradorSequenciaOrdenada(1000000);
//		for (int i = 999999; i >= 0; i--) {
//			Thread.sleep(250);
//			System.out.print("[" + arr1000000Ord[i] + "]");
//		}
		
		System.out.println();
		
		System.err.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		
		System.err.println("<<< SEQUÊNCIA ALEATÓRIA >>>");
		Thread.sleep(500);
		
		System.out.println("Tamanho 10:   " + Arrays.toString(geradorSequenciaAleatoria(10)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 100:  " + Arrays.toString(geradorSequenciaAleatoria(100)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 1000: " + Arrays.toString(geradorSequenciaAleatoria(1000)));
		Thread.sleep(500);
		
		System.out.print("Tamanho 10000: ");
		Long[] arr10000Ale = geradorSequenciaAleatoria(10000);
		for (int i = 9999; i >= 0; i--) {
			Thread.sleep(250);
			System.out.print("[" + arr10000Ale[i] + "]");
		}
		
		System.out.println();
		
//		System.out.print("Tamanho 100000: ");
//		Long[] arr100000Ale = geradorSequenciaAleatoria(100000);
//		for (int i = 99999; i >= 0; i--) {
//			Thread.sleep(250);
//			System.out.print("[" + arr100000Ale[i] + "]");
//		}
//		
//		System.out.println();
		
//		System.out.print("Tamanho 1000000: ");
//		Long[] arr1000000Ale = geradorSequenciaAleatoria(1000000);
//		for (int i = 999999; i >= 0; i--) {
//			Thread.sleep(250);
//			System.out.print("[" + arr1000000Ale[i] + "]");
//		}
		
		System.err.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		
		System.err.println("<<< SEQUÊNCIA QUASE ALEATÓRIA >>>");
		Thread.sleep(500);
		
		System.out.println("Tamanho 10: " + Arrays.toString(geradorSequenciaQuaseOrdenada(10)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 100: " + Arrays.toString(geradorSequenciaQuaseOrdenada(100)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 1000: " + Arrays.toString(geradorSequenciaQuaseOrdenada(1000)));
		Thread.sleep(500);
		
//		System.out.println("Tamanho 10000: " + Arrays.toString(geradorSequenciaQuaseOrdenada(10000)));
//		System.out.println("Tamanho 100000: " + Arrays.toString(geradorSequenciaQuaseOrdenada(100000)));
//		System.out.println("Tamanho 1000000: " + Arrays.toString(geradorSequenciaQuaseOrdenada(1000000)));

		System.err.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		
		System.err.println("<<< SEQUÊNCIA INVERSAMENTE ORDENADA >>>");
		Thread.sleep(500);
		
		System.out.println("Tamanho 10:   " + Arrays.toString(geradorSequenciaInversamenteOrdenada(10)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 100:  " + Arrays.toString(geradorSequenciaInversamenteOrdenada(100)));
		Thread.sleep(500);
		
		System.out.println("Tamanho 1000: " + Arrays.toString(geradorSequenciaInversamenteOrdenada(1000)));
		Thread.sleep(500);
		
//		System.out.println("Tamanho 10000: " + Arrays.toString(geradorSequenciaInversamenteOrdenada(10000)));
//		System.out.println("Tamanho 100000: " + Arrays.toString(geradorSequenciaInversamenteOrdenada(100000)));
//		System.out.println("Tamanho 1000000: " + Arrays.toString(geradorSequenciaInversamenteOrdenada(1000000)));
		
	}
	
	/**
	 * Gerador de sequências ordenadas. (I)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * A sequência é criada com os números ordenados.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência ordenada com valores long.
	 */
	public static Long[] geradorSequenciaOrdenada(int t) {
		
		sequencia = new LinkedHashSet<Long>();
		
		preencherSequencia(t);

		Long[] arr = new Long[t];
		arr = sequencia.toArray(arr);
		
		return arr;
	}

	private static void preencherSequencia(int t) {
		for(int i = 0; i < t; i++) {
			sequencia.add((long) i);
		}
	}
	
	/**
	 * Gerador de sequências inversamente ordenadas. (II)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * A sequência contém os números na ordem decrescente.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência inversamente ordenada com valores long.
	 */
	public static Long[] geradorSequenciaInversamenteOrdenada(int t) {
		Long[] arr = geradorSequenciaOrdenada(t);
		Long[] arrCopy = arr.clone();
		
		int contador = 0;

		for(int i = arr.length-1; i >= 0; i--) {
			arr[contador++] = arrCopy[i];
		}

		return arr;
	}
	
	/**
	 * Gerador de sequências quase ordenadas. (III)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * A sequência originalmente é criada com os números ordenados. 
	 * Entretanto, os elementos da primeira metade são trocados de posição com os elementos da segunda metade.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência quase ordenada com valores long.
	 */
	public static Long[] geradorSequenciaQuaseOrdenada(int t) {
		Long[] arr = geradorSequenciaOrdenada(t);
		
		Long[] metadeOrdenada = Arrays.copyOfRange(arr, 0, t/2);
		Long[] metadeDesordenada = Arrays.copyOfRange(arr, t/2, t);
		
		Collections.shuffle(Arrays.asList(metadeDesordenada));
		
		arr = ArrayUtils.addAll(metadeOrdenada, metadeDesordenada);

		return arr;
	}
	
	/**
	 * Gerador de sequências aleatórias. (IV)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * Os elementos estão dispostos aleatoriamente.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência aleatória com valores long.
	 */
	public static Long[] geradorSequenciaAleatoria(int t) {
		sequencia = new LinkedHashSet<Long>();
		
		preencherSequencia(t);
		
		List<Long> sequenciaList = new ArrayList<Long>(sequencia);
		
		Collections.shuffle(sequenciaList);

		Long[] arr = new Long[t];
		arr = sequenciaList.toArray(arr);

		return arr;
	}
}
