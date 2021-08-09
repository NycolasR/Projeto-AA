package algoritmos;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class QuickSort extends AlgoritmoOrdenacao {
	
	private long comparacoesDeChaves = 0;
	private long movimentacoesDeRegistros = 0;
	
	@Override
	public long[] sort(Long[] array) {
		Instant start = Instant.now();
		
		sort(array, 0, array.length-1);
		
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
	
	private void sort(Long[] array, int inicio, int fim) {
		int esquerda = inicio, direita = fim;
		
		// Pivô calculado aleatoriamente
		Random random = new Random();
		long pivot = array[esquerda + random.nextInt(direita - esquerda + 1)];
		
		while(esquerda <= direita) { // TODO Comparação de chaves (?)
			while(esquerda <= fim && array[esquerda] < pivot) // TODO Comparação de chaves (?)
				esquerda++;
			while(direita >= inicio && array[direita] > pivot) // TODO Comparação de chaves (?)
				direita--;
			
			if(esquerda <= direita) { // TODO Comparação de chaves (?)
				long aux = array[esquerda];
				array[esquerda] = array[direita]; // TODO Movimentação de registro (?)
				array[direita] = aux; // TODO Movimentação de registro (?)
				
				esquerda++;
				direita--;
			}
		}
		
		if(esquerda < fim) // TODO Comparação de chaves (?)
			sort(array, esquerda, fim);
		if(direita > inicio) // TODO Comparação de chaves (?)
			sort(array, inicio, direita);
	}
	
	@Override
	public String toString() {
		return "Quick Sort";
	}
}