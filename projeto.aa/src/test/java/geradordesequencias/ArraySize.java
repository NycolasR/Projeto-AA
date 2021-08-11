package geradordesequencias;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import sequencias.GeradorDeSequencias;

class ArraySize {

	@Test
	void test() {
		Long[] array10Ordenado = GeradorDeSequencias.					geradorSequenciaOrdenada(10);
		Long[] array10InversamenteOrdenado = GeradorDeSequencias.		geradorSequenciaInversamenteOrdenada(10);
		Long[] array10QuaseOrdenado = GeradorDeSequencias.				geradorSequenciaQuaseOrdenada(10);
		Long[] array10Aleatorio = GeradorDeSequencias.					geradorSequenciaAleatoria(10);
		
		System.out.println(Arrays.toString(array10InversamenteOrdenado));
		
//		assertEquals(9, array10Ordenado[9]);
//		assertEquals(9, array10InversamenteOrdenado[0]);
		assertNotEquals(0, array10QuaseOrdenado[9]);
		assertNotEquals(0, array10Aleatorio[9]);
		
		
		Long[] array100Ordenado = GeradorDeSequencias.					geradorSequenciaOrdenada(100);
		Long[] array100InversamenteOrdenado = GeradorDeSequencias.		geradorSequenciaInversamenteOrdenada(100);
		Long[] array100QuaseOrdenado = GeradorDeSequencias.				geradorSequenciaQuaseOrdenada(100);
		Long[] array100Aleatorio = GeradorDeSequencias.					geradorSequenciaAleatoria(100);
		
//		assertEquals(99, array100Ordenado[99]);
//		assertEquals(99, array100InversamenteOrdenado[0]);
		assertNotEquals(0,  array100QuaseOrdenado[99]);
		assertNotEquals(0,  array100Aleatorio[99]);
		
		Long[] array1000Ordenado = GeradorDeSequencias.					geradorSequenciaOrdenada(1000);
		Long[] array1000InversamenteOrdenado = GeradorDeSequencias.		geradorSequenciaInversamenteOrdenada(1000);
		Long[] array1000QuaseOrdenado = GeradorDeSequencias.			geradorSequenciaQuaseOrdenada(1000);
		Long[] array1000Aleatorio = GeradorDeSequencias.				geradorSequenciaAleatoria(1000);
		
//		assertEquals(999, array1000Ordenado[999]);
//		assertEquals(999, array1000InversamenteOrdenado[0]);
		assertNotEquals(0,  array1000QuaseOrdenado[999]);
		assertNotEquals(0,  array1000Aleatorio[999]);
		
		Long[] array10000Ordenado = GeradorDeSequencias.				geradorSequenciaOrdenada(10000);
		Long[] array10000InversamenteOrdenado = GeradorDeSequencias.	geradorSequenciaInversamenteOrdenada(10000);
		Long[] array10000QuaseOrdenado = GeradorDeSequencias.			geradorSequenciaQuaseOrdenada(10000);
		Long[] array10000Aleatorio = GeradorDeSequencias.				geradorSequenciaAleatoria(10000);
		
//		assertEquals(9999, array10000Ordenado[9999]);
//		assertEquals(9999, array10000InversamenteOrdenado[0]);
		assertNotEquals(0,  array10000QuaseOrdenado[9999]);
		assertNotEquals(0,  array10000Aleatorio[9999]);
		
		Long[] array100000Ordenado = GeradorDeSequencias.				geradorSequenciaOrdenada(100000);
		Long[] array100000InversamenteOrdenado = GeradorDeSequencias.	geradorSequenciaInversamenteOrdenada(100000);
		Long[] array100000QuaseOrdenado = GeradorDeSequencias.			geradorSequenciaQuaseOrdenada(100000);
		Long[] array100000Aleatorio = GeradorDeSequencias.				geradorSequenciaAleatoria(100000);
		
//		assertEquals(99999, array100000Ordenado[99999]);
//		assertEquals(99999, array100000InversamenteOrdenado[0]);
		assertNotEquals(0,  array100000QuaseOrdenado[99999]);
		assertNotEquals(0,  array100000Aleatorio[99999]);
		
		Long[] array1000000Ordenado = GeradorDeSequencias.				geradorSequenciaOrdenada(1000000);
		Long[] array1000000InversamenteOrdenado = GeradorDeSequencias.	geradorSequenciaInversamenteOrdenada(1000000);
		Long[] array1000000QuaseOrdenado = GeradorDeSequencias.			geradorSequenciaQuaseOrdenada(1000000);
		Long[] array1000000Aleatorio = GeradorDeSequencias.				geradorSequenciaAleatoria(1000000);
		
//		assertEquals(999999, array1000000Ordenado[999999]);
//		assertEquals(999999, array1000000InversamenteOrdenado[0]);
		assertNotEquals(0,  array1000000QuaseOrdenado[999999]);
		assertNotEquals(0,  array1000000Aleatorio[999999]);

	}
}
