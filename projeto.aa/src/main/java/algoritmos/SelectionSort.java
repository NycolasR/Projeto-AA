package algoritmos;

import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class SelectionSort extends AlgoritmoOrdenacao {
	
	@Override
	public long[] sort(Long[] array) {
		long comparacoesDeChaves = 0;
		long movimentacoesDeRegistros = 0;
		
		Instant start = Instant.now();
		
		for (int i = 0; i < array.length; i++) {			
			// Identificando o índice de menor elemento de um vetor
			int indexSmaller = i; // assume-se que o menor é o i-ésimo
			
			// A iteração em busca do menor valor deve acontecer após
			// a posição do i, pois este trecho já está ordenado
			for (int j = i+1; j < array.length; j++) {
				
				comparacoesDeChaves++;
				if(array[j] < array[indexSmaller]) { // TODo Comparação de chaves
					indexSmaller = j;
				}
			}
			
			// troca do i-ésimo valor com o menor valor encontrado
			Long aux = array[i]; // TODo Movimentação de registro
			array[i] = array[indexSmaller]; // TODo Movimentação de registro
			array[indexSmaller] = aux; // TODo Movimentação de registro
			
			movimentacoesDeRegistros += 3;
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
		return "Selection Sort";
	}
}