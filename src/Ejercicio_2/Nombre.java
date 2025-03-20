package Ejercicio_2;

public class Nombre implements Comparable {

//	ATRIBUTOS
	private String nombre;
	private int edad;
	private String curso;
	
	//	CONSTRUCTOR
	public Nombre() {
		
	}
	public Nombre(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
//	GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
//	METODOS
	public void mostrarNombre () {
		
		System.out.println("Nombre de la persona -> " + nombre);
		System.out.println("Edad de la persona -> " + edad);
		System.out.println("Curso de la persona -> " + curso + "\n");
		
	}
	
//	Metodo implementado del Compare
	@Override
	public int compareTo(Object o) {
		
		Nombre otroNombre = (Nombre) o;
		
		if (this.curso.charAt(4) >= otroNombre.curso.charAt(4)) {
			return 1;
		} else if (this.curso.charAt(4) <= otroNombre.curso.charAt(4)) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
}
