package algoritmos;

import java.time.Duration;
import java.time.Instant;


/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class InsertionSort extends AlgoritmoOrdenacao {

	@Override
	public long[] sort(Long[] array) {
		long comparacoesDeChaves = 0;
		long movimentacoesDeRegistros = 0;
		
		Instant start = Instant.now();
		
		for(int i = 0; i < array.length - 1; i++) {			
			int j = i + 1;
			long number = array[j]; // Número a ser posicionado
			
			// Colocando um número de sequência desordenado na sequência ordenada
			while(j > 0 && number < array[j-1]) { // TODO Comparação de chaves (?)
				array[j] = array[j-1]; // TODO Movimentação de registro (?)
				j--;
			}
			
			array[j] = number;
		}
		
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);
		long durationInMillisseconds = duration.toMillis();

		long[] resultados = {
				durationInMillisseconds, 
				comparacoesDeChaves, 
				movimentacoesDeRegistros
		};
		
		return resultados;
	}
	
	@Override
	public String toString() {
		return "Insertion Sort";
	}
}