package sequencias;

import java.util.Arrays;

public class GeradorDeSequencias {
	
	/**
	 * Gerador de sequências ordenadas. (I)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * A sequência é criada com os números ordenados.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência ordenada com valores long.
	 */
	public static  long[] geradorSequenciaOrdenada(int t) {
		long[] v = new long[t];
		
		for(int i = 0; i < t; i++) {
			long numero = (long) (Math.random() * 1000000);
			
			// Para evitar valores repetidos
			if(!possuiNumero(v, numero))
				v[i] = numero;
		}
		
		Arrays.sort(v);
		
		return v;
	}
	
	/**
	 * Gerador de sequências inversamente ordenadas. (II)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * A sequência contém os números na ordem decrescente.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência inversamente ordenada com valores long.
	 */
	public static long[] geradorSequenciaInversamenteOrdenada(int t) {
		long[] v = new long[t];
		
		for(int i = 0; i < t; i++) {
			long numero = (long) (Math.random() * 1000000);
			
			// Para evitar valores repetidos
			if(!possuiNumero(v, numero))
				v[i] = numero;
		}
		
		Arrays.sort(v);
		
		for(int i = 0; i < t/2; i++) {
			trocar(v, i, t-1-i);
		}
		
		return v;
	}
	
	/**
	 * Gerador de sequências quase ordenadas. (III)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * A sequência originalmente é criada com os números ordenados. 
	 * Entretanto, os elementos da primeira metade são trocados de posição com os elementos da segunda metade.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência quase ordenada com valores long.
	 */
	public static  long[] geradorSequenciaQuaseOrdenada(int t) {
		long[] v = new long[t];
		
		for(int i = 0; i < t; i++) {
			long numero = (long) (Math.random() * 1000000);
			
			// Para evitar valores repetidos
			if(!possuiNumero(v, numero))
				v[i] = numero;
		}
		
		Arrays.sort(v);
		
		for(int i = 0, j = (int) Math.ceil(t/2); i < t/2; i++, j++) {
			trocar(v, i, j);
		}
		
		return v;
	}
	
	/**
	 * Gerador de sequências aleatórias. (IV)
	 * Todos os números da sequência podem ter até seis dígitos. 
	 * Os elementos estão dispostos aleatoriamente.
	 * @param t Tamanho da sequência que deve ser gerada.
	 * @return A sequência aleatória com valores long.
	 */
	public static long[] geradorSequenciaAleatoria(int t) {
		long[] v = new long[t];
		for(int i = 0; i < t; i++) {
			long numero = /* 100 + */ (long) (Math.random() * 1000000);
			
			// Para evitar valores repetidos
			if(!possuiNumero(v, numero)) {				
				v[i] = numero;
			}
		}
		return v;
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
