package Ejercicio_1;

public class Bicicleta implements Vehiculo{

//	ATRIBUTO
	private boolean frenado = false;
	
	//	CONSTRUCTOR
	public Bicicleta () {
		
	}
	public Bicicleta (boolean frenado) {
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

		System.out.println("Bicicleta acelerando... \nVelocidad -> " + velocidad + "km/h\n");
		
	}

	@Override
	public void frenar() {

		System.out.println("El subnormal de atras no me pasa");
		frenado = true;
		
	}

}
