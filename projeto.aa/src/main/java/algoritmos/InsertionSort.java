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
	public long sort(Long[] array) {
		System.out.println("Insertion Sort");
		Instant start = Instant.now();
		
		Long[] arrayCopy = array.clone();
		
		for(int i = 0; i < arrayCopy.length - 1; i++) {			
			int j = i + 1;
			long number = arrayCopy[j]; // Número a ser posicionado
			
			// Colocando um número de sequência desordenado na sequência ordenada
			while(j > 0 && number < arrayCopy[j-1]) {
				arrayCopy[j] = arrayCopy[j-1];
				j--;
			}
			
			arrayCopy[j] = number;
		}
		
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);
		long durationInMillisseconds = duration.toMillis();
		return durationInMillisseconds;
	}
}