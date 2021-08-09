package algoritmos;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public abstract class AlgoritmoOrdenacao {
	
	/*
	 *  long[]: 
	 *  	[0]: Tempo de execução 
	 *  	[1]: Comparações de chaves 
	 *  	[2]: Movimentação de registros
	 */
	public long[] sort(Long[] array) {
		throw new UnsupportedOperationException("[ERRO] Operação de ordenação não suportada. Verifique os parâmetros de entrada");
	}
	
//	public void sort(Long[] array, int i, int f) {
//		throw new UnsupportedOperationException("[ERRO] Operação de ordenação não suportada. Verifique os parâmetros de entrada");
//	}
}