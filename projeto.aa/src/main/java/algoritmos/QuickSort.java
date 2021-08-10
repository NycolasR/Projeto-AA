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
		long pivot = array[esquerda + random.nextInt(direita - esquerda + 1)]; // TODo Movimentação de registro
		this.movimentacoesDeRegistros++;
		
		while(esquerda <= direita) {
			
			while(esquerda <= fim && array[esquerda] < pivot) { // TODo Comparação de chave
				this.comparacoesDeChaves++;
				esquerda++;
			}
			
			while(direita >= inicio && array[direita] > pivot) { // TODo Comparação de chaves
				this.comparacoesDeChaves++;
				direita--;
			}
			
			if(esquerda <= direita) {
				long aux = array[esquerda]; // TODo Movimentação de registro
				array[esquerda] = array[direita]; // TODo Movimentação de registro
				array[direita] = aux; // TODo Movimentação de registro
				
				this.movimentacoesDeRegistros += 3;
				
				esquerda++;
				direita--;
			}
		}
		
		if(esquerda < fim)
			sort(array, esquerda, fim);
		if(direita > inicio)
			sort(array, inicio, direita);
	}
	
	@Override
	public String toString() {
		return "Quick Sort";
	}
}