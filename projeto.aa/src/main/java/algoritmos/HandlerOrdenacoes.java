package algoritmos;

import java.util.Arrays;
public class HandlerOrdenacoes {
	
	private AlgoritmoOrdenacao algoritmoOrdenacao;
	
	public HandlerOrdenacoes(AlgoritmoOrdenacao algoritmoOrdenacao) {
		this.algoritmoOrdenacao = algoritmoOrdenacao;
	}

	public AlgoritmoOrdenacao getAlgoritmoOrdenacao() {
		return algoritmoOrdenacao;
	}

	public void setAlgoritmoOrdenacao(AlgoritmoOrdenacao algoritmoOrdenacao) {
		this.algoritmoOrdenacao = algoritmoOrdenacao;
	}
	
	public void sortArrays(Long[][] arrays) {
		int tamanho = arrays[0].length;
		System.out.println("\n>>>> Ordenando arrays de tamanho: " + tamanho);
		
		// Clone para não interferir no array original
		Long[][] arraysCopy = arrays.clone();
		
		System.err.println("\nOrdenando sequência ordenada com " + algoritmoOrdenacao);
		long tempoSequenciaOrdenada = algoritmoOrdenacao.sort(arraysCopy[0])[0];
		
		if(tamanho < 1000) {
			System.out.println("Resultado:");
			System.out.println(Arrays.toString(arraysCopy[0]));
		}
		
		System.err.println("\nOrdenando sequência inversamente ordenada com " + algoritmoOrdenacao);
		long tempoSequenciaInversamenteOrdenada = algoritmoOrdenacao.sort(arraysCopy[1])[0];
		
		if(tamanho < 1000) {
			System.out.println("Resultado:");
			System.out.println(Arrays.toString(arraysCopy[1]));
		}
		
		System.err.println("\nOrdenando sequência quase ordenada com " + algoritmoOrdenacao);
		long tempoTotalQuaseAleatorio = 0;
		for (int i = 2; i < 16; i++) {
			long tempoSequenciaQuaseOrdenada = algoritmoOrdenacao.sort(arraysCopy[i])[0];
			System.out.println("(posição [" + i + "]) Sequência ordenada em " + tempoSequenciaQuaseOrdenada + " milissegundos.");
			tempoTotalQuaseAleatorio += tempoSequenciaQuaseOrdenada;
			
			if(tamanho < 1000) {
				System.out.println("Resultado:");
				System.out.println(Arrays.toString(arraysCopy[i]));
			}
		}

		System.err.println("\nOrdenando sequência aleatória com " + algoritmoOrdenacao);
		long tempoTotalAleatoria = 0;
		for (int i = 16; i < 30; i++) {
			long tempoSequenciaAleatoria = algoritmoOrdenacao.sort(arraysCopy[i])[0];
			System.out.println("(posição [" + i + "]) Sequência ordenada em " + tempoSequenciaAleatoria + " milissegundos.");
			tempoTotalAleatoria += tempoSequenciaAleatoria;
			
			if(tamanho < 1000) {
				System.out.println("Resultado:");
				System.out.println(Arrays.toString(arraysCopy[i]));
			}
		}
		
		System.err.println("\n>>>> RELATÓRIO GERAL <<<<");
		System.err.println("Tamanho dos arrays: " + tamanho);
		System.err.println("Algoritmo utilizado: " + algoritmoOrdenacao);
		
		System.err.println("\nSequência ORDENADA ordenada em                                     " + tempoSequenciaOrdenada + " milissegundo(s).");
		System.err.println("Sequência INVERSAMENTE ORDENADA ordenada em                        " + tempoSequenciaInversamenteOrdenada + " milissegundo(s).");
		System.err.println("Sequência QUASE ORDENADA (média do tempo de execução) ordenada em: " + (tempoTotalQuaseAleatorio / 14) + " milissegundo(s).");
		System.err.println("Sequência ALEATÓRIA (média do tempo de execução) ordenada em:      " + (tempoTotalAleatoria / 14) + " milissegundo(s).");

	}
}
