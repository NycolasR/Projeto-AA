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
	private static Long[][] arraysTamanho10000;
	private static Long[][] arraysTamanho100000;
	private static Long[][] arraysTamanho1000000;
	
	public static void main(String[] args) {
		arraysTamanho10 = HandlerArrays.getArraysTamanho10();
//		arraysTamanho100 = HandlerArrays.getArraysTamanho100();
//		arraysTamanho1000 = HandlerArrays.getArraysTamanho1000();
//		arraysTamanho10000 = HandlerArrays.getArraysTamanho10000();
//		arraysTamanho100000 = HandlerArrays.getArraysTamanho100000();
		
		ordernar();

	}

	private static void ordernar() {
//		handlerOrdenacoes.setAlgoritmoOrdenacao(new BubbleSort());
//		handlerOrdenacoes.sortArrays(arraysTamanho1000);
		
		handlerOrdenacoes.setAlgoritmoOrdenacao(new SelectionSort());
		handlerOrdenacoes.sortArrays(arraysTamanho10);
		
		handlerOrdenacoes.setAlgoritmoOrdenacao(new InsertionSort());
		handlerOrdenacoes.sortArrays(arraysTamanho10);
		
		handlerOrdenacoes.setAlgoritmoOrdenacao(new MergeSort());
		handlerOrdenacoes.sortArrays(arraysTamanho10);
		
		handlerOrdenacoes.setAlgoritmoOrdenacao(new QuickSort());
		handlerOrdenacoes.sortArrays(arraysTamanho10);
	}
}

















