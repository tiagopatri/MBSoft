package ejercicio2;

public class Ejercicio2 {

	static int[] calcularPosicion(int[] myArray) {
		int[] posicion = new int[2];
		for (int i = 0; i < myArray.length; i = i + 2) {
			posicion[0] = posicion[0] + myArray[i] > 3 ? 3 : posicion[0] + myArray[i];
		}
		for (int i = 1; i < myArray.length; i = i + 2) {
			posicion[1] = posicion[1] + myArray[i] > 3 ? 3 : posicion[1] + myArray[i];
		}
		return posicion;
	}

	static void imprimirPosicion(int[] posicion) {
		for (int i = 0; i < 4; i++) {
			if(posicion[1]==i) {
				for (int j = 0; j < 4; j++) {
					if(posicion[0]==j)
						System.out.print("X");
					else
						System.out.print("O");
				}
				System.out.println("");
			}
				else
					System.out.println("OOOO");
		}
	}
}
