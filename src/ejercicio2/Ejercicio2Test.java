package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void test() {
		//Arrange
		int[]myArray=new int[] {2,2,-1,-1,0,1,1,0,3,3},
				resV=new int[] {3,3},
				resF=new int[] {5,5},
				res=new int[2];
		
		//Act
		res=Ejercicio2.calcularPosicion(myArray);
		
		//Assert
		for (int i = 0; i < res.length; i++) {
			assertEquals(resV[i], res[i]);
			assertNotEquals(resF[i], res[i]);
		}
		
	}

}
