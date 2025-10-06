package gestorEstudiantes;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Programa Gestor de Estudiantes");
		
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

	String opcionMenu;
	
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
	        String continuar;
	        do {
	            System.out.print("Introduce el nombre del estudiante: ");
	            String nombre = sc.nextLine();

	            System.out.print("Introduce la edad del estudiante: ");
	            int edad = Integer.parseInt(sc.nextLine());

	            System.out.print("Introduce la nota del estudiante: ");
	            double nota = Double.parseDouble(sc.nextLine());

	            System.out.print("¿Está matriculado? (true/false): ");
	            boolean matriculado = Boolean.parseBoolean(sc.nextLine());

	            // Crear estudiante y añadir a la lista
	            Estudiante nuevo = new Estudiante(nombre, edad, nota, matriculado);
	            estudiantes.add(nuevo);

	            System.out.print("¿Quieres añadir otro estudiante? (si/no): ");
	            continuar = sc.nextLine();
	        } while (continuar.equalsIgnoreCase("si"));
	        break;
	      
	    }
	} while (!opcionMenu.equals("6"));
	sc.close();
	
	}
}
