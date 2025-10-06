package gestorEstudiantes;

public class Estudiante {
	
	// Versión limpia actualizada
	// Atributos
	private String nombre;
	private int edad;
	private double nota;
	private boolean matriculado;
	
	// Constructor. Crea un estudiante con su nombre y nota
	public Estudiante(String nombre, int edad, double nota, boolean matriculado) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setNota(nota);
		this.setMatriculado(matriculado);
	}
	
	// Getters de la clase Estudiante. Los Getters son funciones que permiten leer los datos del estudiante
	public String getNombre() {
		return this.nombre.toUpperCase();
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public boolean getMatriculado() {
		return this.matriculado;
	}


	// Setters de la clase Estudiante. Modifica los atributos y valida los datos
	
	public void setNombre(String nombre) {
		if (nombre != null && nombre.length() > 0) {
			if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
				this.nombre = nombre.trim(); 
			} 
		} 
	}
	
	public void setEdad(int edad) {
		if (edad >= 0 && edad <= 110) {
			this.edad = edad;
		} 
	}
	
	public void setNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.nota = nota;
		} 
	}
	
	public void setMatriculado (boolean matriculado) {
		this.matriculado = matriculado;
	}
	
	// Método para mostrar los datos
	
	public String mostrarDatos() {
		return this.nombre + " Edad: " + this.edad + " Nota media: " + this.nota + " Matriculado: " + this.matriculado;
	}
}



   
