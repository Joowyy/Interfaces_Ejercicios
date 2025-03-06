package Ejercicio_1;

public class Coche implements Vehiculo{

//	ATRIBUTOS
	private boolean frenado = false;
	
//	CONSTRUCTORES
	public Coche () {
		
	}
	public Coche (boolean frenado) {
		this.frenado = frenado;
	}
	
//	GETTERS SETTERS
	public boolean isFrenado() {
		return frenado;
	}

	public void setFrenado(boolean frenado) {
		this.frenado = frenado;
	}

//	METODOS
	@Override
	public void acelerar(int velocidad) {
		
		System.out.println("Coche acelerando... \nVelocidad -> " + velocidad + "km/h\n");
		frenado = false;
		
	}

	@Override
	public void frenar() {
		
		System.out.println("Coche esta frenando poco a poco...\n");
		frenado = true;
		
	}

}
