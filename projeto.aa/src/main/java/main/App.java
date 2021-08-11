package main;

import algoritmos.BubbleSort;
import algoritmos.HandlerOrdenacoes;
import algoritmos.InsertionSort;
import algoritmos.MergeSort;
import algoritmos.QuickSort;
import algoritmos.SelectionSort;
import sequencias.HandlerArrays;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
@SuppressWarnings("unused")
public class App {
	
	private static HandlerOrdenacoes handlerOrdenacoes = new HandlerOrdenacoes(null);
	
	
	private static Long[][] arraysTamanho10;
	private static Long[][] arraysTamanho100;
	private static Long[][] arraysTamanho1000;
	
	private static Long[][] arraysTamanho10000 = new Long[30][];
	private static Long[][] arraysTamanho100000 = new Long[30][];
	private static Long[][] arraysTamanho1000000 = new Long[30][];
	
	public static void main(String[] args) {
		arraysTamanho10 = HandlerArrays.getArraysTamanho10();
		arraysTamanho100 = HandlerArrays.getArraysTamanho100();
		arraysTamanho1000 = HandlerArrays.getArraysTamanho1000();
		
		arraysTamanho10000 = HandlerArrays.preencherArray(arraysTamanho10000, 10000);
		arraysTamanho100000 = HandlerArrays.preencherArray(arraysTamanho100000, 100000);
//		arraysTamanho1000000 = HandlerArrays.preencherArray(arraysTamanho1000000, 1000000);
		
		ordernar();

	}

	private static void ordernar() {
		handlerOrdenacoes.setAlgoritmoOrdenacao(new SelectionSort());
		
//		handlerOrdenacoes.sortArrays(arraysTamanho10);
//		handlerOrdenacoes.sortArrays(arraysTamanho100);
//		handlerOrdenacoes.sortArrays(arraysTamanho1000);
//		
//		handlerOrdenacoes.sortArrays(arraysTamanho10000);
		handlerOrdenacoes.sortArrays(arraysTamanho100000);
//		handlerOrdenacoes.sortArrays(arraysTamanho1000000);
		
	}
}

















