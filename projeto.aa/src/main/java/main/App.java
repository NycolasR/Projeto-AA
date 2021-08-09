package main;

import sequencias.HandlerArrays;

/**
 * 
 * @author Nycolas R. Alves
 *
 */
public class App {
	
	public static void main(String[] args) {
//		HandlerArrays.executar();
		
		Long[][] arraysTamanho10 = HandlerArrays.getArraysTamanho10();
		System.out.println("1");
		
		Long[][] arraysTamanho100 = HandlerArrays.getArraysTamanho100();
		System.out.println("1");
		
		Long[][] arraysTamanho1000 = HandlerArrays.getArraysTamanho1000();
		System.out.println("1");
		
		Long[][] arraysTamanho10000 = HandlerArrays.getArraysTamanho10000();
		System.out.println("1");
		
		Long[][] arraysTamanho100000 = HandlerArrays.getArraysTamanho100000();
		System.out.println("Arrays recuperados");
	}
}

















