package algoritmos;

import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class BubbleSort extends AlgoritmoOrdenacao {
	
	@Override
	public long sort(Long[] array) {
		System.out.println("Bubble Sort");
		Instant start = Instant.now();
		
		Long[] arrayCopy = array.clone();
		
		// Se não houveram mudanças, o array já está ordenado
		boolean hasChanged = true;
		
		while (hasChanged) {
			hasChanged = false;
			
			// Contador para que o último elemento não seja analisado
			int j = 0;
			
			for (int i = 0; i < arrayCopy.length -1 - j; i++) {
				
				if(arrayCopy[i] > arrayCopy[i+1]) {
					// Troca do valor com seu sucessor
					long aux = arrayCopy[i];
					arrayCopy[i] = arrayCopy[i+1];
					arrayCopy[i+1] = aux;
					hasChanged = true;			
				}
			}
			j++;
		}
		
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);
		long durationInMillisseconds = duration.toMillis();
		return durationInMillisseconds;
	}
}
