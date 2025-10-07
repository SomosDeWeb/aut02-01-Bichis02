package gestorEstudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Programa Gestor de Estudiantes");
		
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

	String opcionMenu;
	String continuar;
	String nombre;
	String respuesta;
	int edad;
	double nota;
	boolean matriculado = false;
	boolean encontrado;
	double sumaNotas;
	double media;
	 
	
	do {
	    System.out.println("\n--- Menú ---");
	    System.out.println("1. Añadir estudiante");
	    System.out.println("2. Listar todos los estudiantes");
	    System.out.println("3. Buscar estudiante por nombre");
	    System.out.println("4. Calcular media de notas");
	    System.out.println("5. Mostrar estudiante con la mejor nota");
	    System.out.println("6. Salir");
	    System.out.print("Elige una opción (1-6): ");
	    
	    opcionMenu = sc.nextLine();
	    
	    switch (opcionMenu) {
	    case "1":
	        do {
	        	// Nombre
	        	do { 
	        		 System.out.print("Introduce el nombre del estudiante: ");
	 	             nombre = sc.nextLine().trim();
	 	             if (nombre.isEmpty() || !nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
	 	            	 System.out.println("El nombre no puede estar vacío y debe contener solo letras.");
	 	             }
	        	} while (nombre.isEmpty() || !nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"));
	           
	        	// Edad 
	        	do {
	        		System.out.print("Introduce la edad del estudiante: ");
	        		try {
	        			edad = Integer.parseInt(sc.nextLine());
	        		} catch (NumberFormatException e) {
	        			edad = -1;
	        		}
	        		if (edad < 0 || edad > 110) {
	        				System.out.println("Edad inválida. Debe estar entre 0 y 110.");
	        			}
	        		} while (edad < 0 || edad > 110);
	        		
	        	// Nota
	        	do {
	        		 System.out.print("Introduce la nota del estudiante (Por favor, en el caso de tener decimales usad punto.): ");
	        		 
	        		 try {
	        			 nota = Double.parseDouble(sc.nextLine());
	        		 } catch (NumberFormatException e ) {
	        			 nota = -1;
	        		 }
	        		 if (nota < 0 || nota > 10) {
	        			 System.out.println("Nota inválida. Debe estar entre 0 y 10.");
	        		 }
	        		} while (nota < 0 || nota > 10);
	        	
	        	// Verificar si está matriculado
	        	
	        	do {
	        		System.out.println("¿Está matriculado? (sí/no)");
	        		respuesta = sc.nextLine().trim().toLowerCase();
	        		if (respuesta.equals("si")) {
	        			matriculado = true;
	        		} else if (respuesta.equals("no")) {
	        			matriculado = false;
	        		} else {
	        			System.out.println("Entrada inválida. Escríbe 'si' o 'no'.");
	        		}
	        	} while (!respuesta.equals("si") && !respuesta.equals("no"));

	            // Crear estudiante y añadir a la lista
	            Estudiante nuevo = new Estudiante(nombre, edad, nota, matriculado);
	            estudiantes.add(nuevo);
	            System.out.println("Estudiante añadido.");
	            
	            System.out.print("¿Quieres añadir otro estudiante? (si/no): ");
	            continuar = sc.nextLine();
	        } while (continuar.equalsIgnoreCase("si"));
	        break;
	      
	    }
	} while (!opcionMenu.equals("6"));
	sc.close();
	
	}
}
