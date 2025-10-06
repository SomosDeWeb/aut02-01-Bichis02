package gestorEstudiantes;

public class Estudiante {
	// Propiedades
	private String nombre;
	private double nota;
	
	// Constructor. Crea un estudiante con su nombre y nota
	public Estudiante(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	// Los Getters son funciones que permiten leer los datos del estudiante
	public String getNombre() {
		return nombre;
	}
	
	public double getNota() {
		return nota;
	}
}


   
