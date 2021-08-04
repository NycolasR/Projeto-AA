package algoritmos;
import java.util.Random;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class QuickSort extends AlgoritmoOrdenacao {
	
	@Override
	public void sort(Long[] array, int i, int f) {
		int e = i, d = f;
		
		Long[] arrayCopy = array.clone();
		
		// Pivô calculado aleatoriamente
		Random random = new Random();
		long pivot = arrayCopy[e + random.nextInt(d - e + 1)];
		
		while(e <= d) {
			while(e <= f && arrayCopy[e] < pivot)
				e++;
			while(d >= i && arrayCopy[d] > pivot)
				d--;
			
			if(e <= d) {
				long aux = arrayCopy[e];
				arrayCopy[e] = arrayCopy[d];
				arrayCopy[d] = aux;
				
				e++;
				d--;
			}
		}
		
		if(e < f) 
			sort(arrayCopy, e, f);
		if(d > i)
			sort(arrayCopy, i, d);
	}
}