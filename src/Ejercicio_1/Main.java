package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		
		Bicicleta b = new Bicicleta (false);
		Coche c = new Coche (false);
		
		c.acelerar(1000);
		b.acelerar(200);
		
		b.frenar();
		
	}

}
