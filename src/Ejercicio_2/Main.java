package Ejercicio_2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
//		Creamos los objetos nombre
		Nombre eduardo = new Nombre("Eduardo", 45, "DAM-1A");
		Nombre miguel = new Nombre("Miguel", 19, "DAM-1B");
		Nombre maria = new Nombre("Maria", 22, "DAM-2A");
		Nombre dolores = new Nombre("Dolores", 78, "DAM-2B");
		
//		Declaramos el array con los objetos 'Nombre'
		Nombre[] nombres = {eduardo, miguel, maria, dolores};
		
//		Ordena el array
		Arrays.sort(nombres);
		
//		Imprime el array
		verNombres(nombres);
		
	}
	
	public static void verNombres (Nombre[] nombres) {
		
		for (Nombre n : nombres) {
			
			n.mostrarNombre();
			
		}
		
	}

}
