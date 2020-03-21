package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	void test() {
		//Arrange
		int[]myArray=new int[]{5,2,3,4,1,2,3,5,1,2};
		int[]apariciones=new int[] {2,3,2,1,2};
		int[]resultado=new int[5];
		
		
		//Act
		resultado=Ejercicio1.calcularHistograma(myArray);
		
		//Assert
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(apariciones[i], resultado[i]);
		}
		
	}

}
