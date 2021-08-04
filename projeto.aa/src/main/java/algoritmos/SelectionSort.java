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
	public long sort(Long[] array) {
		System.out.println("Selection Sort");
		Instant start = Instant.now();
		
		Long[] arrayCopy = array.clone();
		
		for (int i = 0; i < arrayCopy.length; i++) {			
			// Identificando o índice de menor elemento de um vetor
			int indexSmaller = i; // assume-se que o menor é o i-ésimo
			
			// A iteração em busca do menor valor deve acontecer ap�s
			// a posição do i, pois este trecho já está ordenado
			for (int j = i+1; j < arrayCopy.length; j++) {
				if(arrayCopy[j] < arrayCopy[indexSmaller])
					indexSmaller = j;
			}
			
			// troca do i-ésimo valor com o menor valor encontrado
			Long aux = arrayCopy[i];
			arrayCopy[i] = arrayCopy[indexSmaller];
			arrayCopy[indexSmaller] = aux;
		}
		
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);
		long durationInMillisseconds = duration.toMillis();
		return durationInMillisseconds;
	}
}