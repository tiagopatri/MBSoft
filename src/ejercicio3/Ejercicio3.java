package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
	static boolean esPrioritario(String codigo) {
		return codigo.charAt(0)=='P'||codigo.charAt(0)=='W';
	}

	static boolean verificar(String codigo) {
		String[] division = codigo.split("-");
		int verificador = Integer.parseInt(division[2]), sum;
		String[] verificar;
		do {
			sum = 0;
			verificar = division[1].split("");
			for (int i = 0; i < verificar.length; i++) {
				sum += Integer.parseInt(verificar[i]);
			}
			division[1] = String.valueOf(sum);
		} while (sum > 9);

		return sum == verificador;
	}

	static void ordenarAlfabeticamente(ArrayList<String> lista) {
		String aux;
		int i,j;
		for (i = 1; i < lista.size(); i++){
			aux = lista.get(i);
			j = i - 1;
			while ( (j >= 0) && lista.get(j).compareTo(aux)>0 )
				lista.set(j+1, lista.get(j--));
			lista.set(j+1, aux);
		}	
	}

	static ArrayList<String> unionListas(ArrayList<String> lista1, ArrayList<String> lista2) {
		ArrayList<String>union=lista1;
		for (String string : lista2) {
			if(!lista1.contains(string))
				union.add(string);
		}
		return union;
	}


	static ArrayList<String> interseccionListas(ArrayList<String> lista1, ArrayList<String> lista2) {
		ArrayList<String>interseccion = new ArrayList<String>(lista1);
		for (String string : lista1) {
			if(!lista2.contains(string))
				interseccion.remove(string);
		}
		return interseccion;
	}
	static void mostrarLista(ArrayList<String>lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}
}
