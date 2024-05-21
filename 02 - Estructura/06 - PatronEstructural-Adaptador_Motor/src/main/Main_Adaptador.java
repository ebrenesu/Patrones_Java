package main;

import java.util.Scanner;

public class Main_Adaptador {

	private static Scanner scan = new Scanner(System.in);
	private static Gestor gs = new Gestor();
	
    public static void main(String[] args) {
    	int opcion = 0;
		String salida="";
		
		do{
			opcion = obtenerOpcionMenu();
			salida = gs.procesarFuncion(opcion);
			System.out.print(salida);	
		} while (opcion != 6);		
		
    }

    private static int obtenerOpcionMenu() {
    	System.out.println(gs.mostrarMenu() + "\n");
    	return scan.nextInt();
    }
    
    
}



/*******************************************************************
 * Tarea: 
 * - Agregar un motor de plasma y adaptarlo.
 * - Arreglar el problema del disenno, solo la capa de presentacion
 * deberia de imprimir, los objetos no.
 *******************************************************************/
 