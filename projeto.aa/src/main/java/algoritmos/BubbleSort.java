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
	public long[] sort(Long[] array) {
		long comparacoesDeChaves = 0;
		long movimentacoesDeRegistros = 0;
		
		Instant start = Instant.now();
		
		// Se não houveram mudanças, o array já está ordenado
		boolean hasChanged = true;
		
		while (hasChanged) {
			hasChanged = false;
			
			// Contador para que o último elemento não seja analisado
			int j = 0;
			
			for (int i = 0; i < array.length - 1 - j; i++) {
				
				// TODo Comparação de chaves
				comparacoesDeChaves++;
				if(array[i] > array[i+1]) {
					
					// Troca do valor com seu sucessor
					long aux = array[i]; // TODo Movimentação de registro
					array[i] = array[i+1]; // TODo Movimentação de registro
					array[i+1] = aux; // TODo Movimentação de registro
					movimentacoesDeRegistros += 3;
					
					hasChanged = true;
				}
			}
			j++;
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
		return "Bubble Sort";
	}
}
