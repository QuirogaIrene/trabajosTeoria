package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;

public class Main {

	public static void main(String[] args) {
    

		 //SE NOS PIDE QUE PARA EL ALUMNO ARIEL VEGA SE REGISTRE LAS NOTAS DE 4 MATERIAS 
				
		Alumno alumno= generarAlumno();
		registrarNotas(alumno, 2);		
	}
		public static Alumno generarAlumno() {
			
			 Alumno alumno = new Alumno();
			
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Ingrese el legajo: ");
			 Integer legajo = scanner.nextInt();
			 System.out.println("Ingrese el apellido: ");
			 String apellido = scanner.next();
			 System.out.println("Ingrese el nombre: ");
			 String nombre = scanner.next();

			 alumno.setLegajo(legajo);
			 alumno.setApellido(apellido);
			 alumno.setNombre(nombre);
			 //scanner.close();
		  return alumno;	
		}
		public static void registrarNotas(Alumno alumno, int numMaterias) {
			
			Scanner scanner = new Scanner(System.in);
			while(numMaterias <=4) {
				
				//cargar materias
				System.out.println("Ingrese el Codigo de la Materia: ");
				String codigoMateria = scanner.next();
				System.out.println("Ingrese el Nombre de la Materia: ");
				String nombreMateria = scanner.next();
				
				Materia materia = new Materia(codigoMateria, nombreMateria);
				
				//cargar notas 
				System.out.println("Ingrese el codigo de Registro de Nota: ");
				String codigoNota = scanner.next();
				System.out.println("Ingrese la nota final: ");
				Float nota = scanner.nextFloat();
				
				RegistroNotas registroNotas = new RegistroNotas(codigoNota, alumno, materia, nota);
				
				System.out.println(registroNotas.toString());
				numMaterias++;
			}
			//scanner.close();
		}

}
