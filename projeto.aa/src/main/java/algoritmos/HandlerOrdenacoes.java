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
		
//		// Ordenando e obtendo os resultados da sequencia ordenada
//		System.err.println("\nOrdenando sequência ordenada com " + algoritmoOrdenacao);
//		long[] resultadosSequenciaOrdenada = algoritmoOrdenacao.sort(arraysCopy[0]);
//		printResultado(tamanho, arraysCopy[0]); // Se o array for muito grande, exibi-lo no console não é viável
//		
//		System.err.println("\n>>>> RELATÓRIO GERAL <<<<");
//		System.err.println("Tamanho dos arrays: " + tamanho);
//		System.err.println("Algoritmo utilizado: " + algoritmoOrdenacao);
//		
//		System.err.println("\n>> ORDENADA <<");
//		System.err.println("Tempo de execução:          " + resultadosSequenciaOrdenada[0] + " milissegundo(s).");
//		System.err.println("Comparações de chaves:      " + resultadosSequenciaOrdenada[1] + " comparações.");
//		System.err.println("Movimentações de registros: " + resultadosSequenciaOrdenada[2] + " movimentações.");
		
		
		
		// Ordenando e obtendo os resultados da sequencia inversamente ordenada
//		System.err.println("\nOrdenando sequência inversamente ordenada com " + algoritmoOrdenacao);
//		long[] resultadosSequenciaInversamenteOrdenada = algoritmoOrdenacao.sort(arraysCopy[1]);
//		printResultado(tamanho, arraysCopy[1]);
//		
//		System.err.println("\n>>>> RELATÓRIO GERAL <<<<");
//		System.err.println("Tamanho dos arrays: " + tamanho);
//		System.err.println("Algoritmo utilizado: " + algoritmoOrdenacao);
//		
//		System.err.println("\n>> INVERSAMENTE ORDENADA <<");		
//		System.err.println("Tempo de execução:          " + resultadosSequenciaInversamenteOrdenada[0] + " milissegundo(s).");
//		System.err.println("Comparações de chaves:      " + resultadosSequenciaInversamenteOrdenada[1] + " comparações.");
//		System.err.println("Movimentações de registros: " + resultadosSequenciaInversamenteOrdenada[2] + " movimentações.");
		
		
		
		System.err.println("\nOrdenando sequência quase ordenada com " + algoritmoOrdenacao);
		long tempoTotalQuaseOrdenada = 0;
		long comparacoesTotaisDeChavesQuaseOrdenada = 0;
		long movimentacoesTotaisDeRegistrosQuaseOrdenada = 0;
		
		for (int i = 5; i < 16; i++) {
			long[] resultadosSequenciaQuaseOrdenada = algoritmoOrdenacao.sort(arraysCopy[i]);
			System.out.println("(posição [" + i + "]) Sequência ordenada em " + resultadosSequenciaQuaseOrdenada[0] + " milissegundos."
					+ " Comparações de chaves: " + resultadosSequenciaQuaseOrdenada[1] 
					+ " | Movimentações de registros: " + resultadosSequenciaQuaseOrdenada[2]);
			
			tempoTotalQuaseOrdenada += resultadosSequenciaQuaseOrdenada[0];
			comparacoesTotaisDeChavesQuaseOrdenada += resultadosSequenciaQuaseOrdenada[1];
			movimentacoesTotaisDeRegistrosQuaseOrdenada += resultadosSequenciaQuaseOrdenada[2];
			
			printResultado(tamanho, arraysCopy[i]);
		}
		
		System.err.println("\n>>>> RELATÓRIO GERAL <<<<");
		System.err.println("Tamanho dos arrays: " + tamanho);
		System.err.println("Algoritmo utilizado: " + algoritmoOrdenacao);

		System.err.println("\n>> QUASE ORDENADA <<");
		System.err.println("Tempo de execução:          " + (tempoTotalQuaseOrdenada / 14) + " milissegundo(s).");
		System.err.println("Comparações de chaves:      " + (comparacoesTotaisDeChavesQuaseOrdenada / 14) + " comparações.");
		System.err.println("Movimentações de registros: " + (movimentacoesTotaisDeRegistrosQuaseOrdenada / 14) + " movimentações.");
		
		
		
		System.err.println("\nOrdenando sequência aleatória com " + algoritmoOrdenacao);
		long tempoTotalAleatoria = 0;
		long comparacoesTotaisDeChavesAleatoria = 0;
		long movimentacoesTotaisDeRegistrosAleatoria = 0;
		
		for (int j = 16; j < 30; j++) {
			long[] resultadosSequenciaAleatoria = algoritmoOrdenacao.sort(arraysCopy[j]);
			System.out.println("(posição [" + j + "]) Sequência ordenada em " + resultadosSequenciaAleatoria[0] + " milissegundos."
					+ " Comparações de chaves: " + resultadosSequenciaAleatoria[1] 
					+ " | Movimentações de registros: " + resultadosSequenciaAleatoria[2]);
			
			tempoTotalAleatoria += resultadosSequenciaAleatoria[0];
			comparacoesTotaisDeChavesAleatoria += resultadosSequenciaAleatoria[1];
			movimentacoesTotaisDeRegistrosAleatoria += resultadosSequenciaAleatoria[2];
			
			printResultado(tamanho, arraysCopy[j]);
		}
		
		System.err.println("\n>>>> RELATÓRIO GERAL <<<<");
		System.err.println("Tamanho dos arrays: " + tamanho);
		System.err.println("Algoritmo utilizado: " + algoritmoOrdenacao);
		
		System.err.println("\n>> ALEATÓRIA <<");
		System.err.println("Tempo de execução:          " + (tempoTotalAleatoria / 14) + " milissegundo(s).");
		System.err.println("Comparações de chaves:      " + (comparacoesTotaisDeChavesAleatoria / 14) + " comparações.");
		System.err.println("Movimentações de registros: " + (movimentacoesTotaisDeRegistrosAleatoria / 14) + " movimentações.");
	}

	private void printResultado(int tamanho, Long[] array) {
		if(tamanho < 1000) {
			System.out.println("Resultado:");
			System.out.println(Arrays.toString(array));
		}
	}
}
