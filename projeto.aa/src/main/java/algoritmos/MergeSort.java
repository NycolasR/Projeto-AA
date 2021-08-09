package algoritmos;

import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class MergeSort extends AlgoritmoOrdenacao {
	
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
		
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			sort(array, inicio, meio);
			sort(array, meio+1, fim);
			merge(array, inicio, meio, fim);
		}
	}

	private void merge(Long array[], int esquerda, int meio, int direita) { 
        // Obtendo o tamanho dos subarrays a serem intercalados 
        int n1 = meio - esquerda + 1; 
        int n2 = direita - meio; 
  
        // Criação dos arrays temporários
        Long arrayEsquerdo[] = new Long[n1]; 
        Long arrayDireito[] = new Long[n2]; 
  
        // Respectivos valores copiados para os arrays temporários
        for (int i = 0; i < n1; ++i) 
            arrayEsquerdo[i] = array[esquerda + i]; // TODO Movimentação de registro (?)
        for (int j = 0; j < n2; ++j) 
            arrayDireito[j] = array[meio + 1 + j]; // TODO Movimentação de registro (?)
        
        /* Intercalando os arrays temporários */
        // Indices iniciais do primeiro e segundo sub-arrays 
        int i = 0, j = 0; 
  
        // Indicice inicial do array intercalado 
        int k = esquerda; 
        while (i < n1 && j < n2) { 
            if (arrayEsquerdo[i] <= arrayDireito[j]) { // TODO Comparação de chaves (?)
                array[k] = arrayEsquerdo[i]; // TODO Movimentação de registro (?)
                i++; 
            } else { // TODO Comparação de chaves (?)
                array[k] = arrayDireito[j]; // TODO Movimentação de registro (?)
                j++; 
            } 
            k++; 
        } 
  
        // Cópia dos elementos restantes de arrayEsquerdo[] se existirem
        while (i < n1) { // TODO Comparação de chaves (?)
            array[k] = arrayEsquerdo[i]; // TODO Movimentação de registro (?)
            i++; 
            k++; 
        } 
  
        // Cópia dos elementos restantes de arrayDireito[] se existirem
        while (j < n2) { // TODO Comparação de chaves (?)
            array[k] = arrayDireito[j]; // TODO Movimentação de registro (?)
            j++; 
            k++; 
        }
    }
	
	@Override
	public String toString() {
		return "Merge Sort";
	}
}