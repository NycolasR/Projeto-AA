package sequencias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GeradorDeSequencias {
	
	private static Set<Long> sequencia;
	
	public static void main(String[] args) {
//		System.out.println(Arrays.toString(geradorSequenciaAleatoria(1000000)));
//		GeradorDeSequencias.linha();
//		System.out.println(Arrays.toString(geradorSequenciaAleatoria(100000)));
//		GeradorDeSequencias.linha();
//		System.out.println(Arrays.toString(geradorSequenciaAleatoria(10000)));
//		GeradorDeSequencias.linha();
//		System.out.println(Arrays.toString(geradorSequenciaAleatoria(1000)));
//		GeradorDeSequencias.linha();
//		System.out.println(Arrays.toString(geradorSequenciaAleatoria(100)));
//		GeradorDeSequencias.linha();
//		System.out.println(Arrays.toString(geradorSequenciaAleatoria(10)));
//		
//		GeradorDeSequencias.linha();
		
		System.out.println(Arrays.toString(geradorSequenciaOrdenada(10000)));
		GeradorDeSequencias.linha();
		System.out.println(Arrays.toString(geradorSequenciaOrdenada(1000)));
		GeradorDeSequencias.linha();
		System.out.println(Arrays.toString(geradorSequenciaOrdenada(100)));
		GeradorDeSequencias.linha();
		System.out.println(Arrays.toString(geradorSequenciaOrdenada(10)));
		
	}
	
	private static void linha() {
		System.err.println("\n-------------------------------\n");
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
		
		int contador = 0;
		
		for(int i = arr.length-1; i >= 0; i--) {
			arr[contador++] = arr[i];
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
		
		int contador = 0;
		
		for(int i = t/2; i >= 0; i--) {
			arr[contador++] = arr[i];
		}
		
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
	
	/**
	 * Método usado para verificar a existência de um valor
	 * num array com busca binária iterativa.
	 * @param array Array no qual se deseja saber se existe um dado valor.
	 * @param numero Valor que se deseja validar a presença no array.
	 * @return True para valor encontrado e False para valor não encontrado.
	 */
	private static boolean possuiNumero(long[] array, long numero) {
		long inicio = 0;
		long fim = array.length - 1;
		int meio;

		while(inicio <= fim) {
			
			meio = (int) (inicio + fim) / 2;

			if(array[meio] < numero)
				inicio = meio + 1;
			
			else if(array[meio] > numero)
				fim = meio - 1;
			
			else
				return true;
		}

		return false;
	}
	
	/**
	 * Método usado para realizar a troca de posição
	 * entre dois valores num dado array.
	 * @param v Array no qual a troca deve ocorrer
	 * @param i Índice de uma das posições
	 * @param j Índice da posição cujo valor trocará de lugar com o valor
	 * na posição i
	 */
	private static void trocar(long[] v, int i, int j) {
		long aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
