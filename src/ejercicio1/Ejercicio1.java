package ejercicio1;

public class Ejercicio1 {
	public static int[] calcularHistograma(int[] myArray) {
		int[] apariciones = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			apariciones[myArray[i] - 1]++;
		}
		return apariciones;
	}

	public static void imprimirHistograma(int[] apariciones) {
		for (int i = 0; i < apariciones.length; i++) {
			System.out.print(i + 1 + ": ");
			for (int j = 0; j < apariciones[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
