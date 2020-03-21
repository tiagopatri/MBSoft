package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void test1() {
		fail("Not yet implemented");
	}

	@Test
	void verificarTest1() {
		// Arrange
		String codigo1 = new String("AAA-99999-45");
		boolean resultado;

		// Act
		resultado = Ejercicio3.verificar(codigo1);

		// Assert
		assertFalse(resultado);

	}

	@Test
	void verificarTest2() {
		//Arrange
		String codigo2 = new String("AAA-99999-9");
		boolean resultado;

		// Act
		resultado = Ejercicio3.verificar(codigo2);

		// Assert
		assertTrue(resultado);
	}

	@Test
	void interseccionTest() {
		//Arrange
		ArrayList<String>lista1=new ArrayList<>(Arrays.asList(	"AAA-11111-5",
																"BBB-22222-1",
																"CCC-33333-6"));
		ArrayList<String>lista2=new ArrayList<>(Arrays.asList(	"BBB-22222-1",
																"DDD-44444-2",
																"EEE-55555-7"));
		ArrayList<String>esperado=new ArrayList<>(Arrays.asList("BBB-22222-1"));
		ArrayList<String>resultado;
		
		//Act
		resultado=new ArrayList<String>(Ejercicio3.interseccionListas(lista1, lista2));
		
		//Assert
		for (int i = 0; i < resultado.size(); i++) {
			assertEquals(esperado.get(i), resultado.get(i));
		}
	}
	@Test
	void unionTest() {
		//Arrange
		ArrayList<String>lista1=new ArrayList<>(Arrays.asList(	"AAA-11111-5",
																"BBB-22222-1",
																"CCC-33333-6"));
		ArrayList<String>lista2=new ArrayList<>(Arrays.asList(	"BBB-22222-1",
																"DDD-44444-2",
																"EEE-55555-7"));
		ArrayList<String>esperado=new ArrayList<>(Arrays.asList("AAA-11111-5",
																"BBB-22222-1",
																"CCC-33333-6",
																"DDD-44444-2",
																"EEE-55555-7"));
		ArrayList<String>resultado;
		
		//Act
		resultado=new ArrayList<String>(Ejercicio3.unionListas(lista1, lista2));
		
		//Assert
		for (int i = 0; i < resultado.size(); i++) {
			assertEquals(esperado.get(i), resultado.get(i));
		}
	}
	@Test
	void ordenarAlfabeticamenteTest() {
		//Arrange
		ArrayList<String>lista=new ArrayList<>(Arrays.asList(	"DDD-44444-2",
																"AAA-11111-5",
																"BBB-22222-1",
																"EEE-55555-7",
																"CCC-33333-6"));
		ArrayList<String>esperado=new ArrayList<>(Arrays.asList("AAA-11111-5",
				"BBB-22222-1",
				"CCC-33333-6",
				"DDD-44444-2",
				"EEE-55555-7"));
				
		//Act
		Ejercicio3.ordenarAlfabeticamente(lista);
		
		//Assert
		for (int i = 0; i < lista.size(); i++) {
			assertEquals(esperado.get(i), lista.get(i));
		}
	}
}
