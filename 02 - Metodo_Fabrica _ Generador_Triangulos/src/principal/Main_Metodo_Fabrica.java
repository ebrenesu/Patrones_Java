/************************************************************
 * Clase: main
 * Descripción: Esta clase es la principal del programa.
 * @author Erick Brenes
 ************************************************************/
package principal;

import java.util.Scanner;

public class Main_Metodo_Fabrica {

	private static Gestor gGestor = new Gestor();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		InteracionUsuario(false);	
		gGestor.nuevoTriangulo(10, 10, 10);
		gGestor.nuevoTriangulo(10, 20, 30);
		gGestor.nuevoTriangulo(10, 20, 10);
		gGestor.nuevoTriangulo(Helper.ramdomize(), Helper.ramdomize(),Helper.ramdomize());
		imprimir();
	}

	private static void InteracionUsuario(boolean pVal) {
		int l1, l2, l3;
		if (pVal) {
			System.out.println("Escriba el lado 1");
			l1 = scan.nextInt();
			System.out.println("Escriba el lado 2");
			l2 = scan.nextInt();
			System.out.println("Escriba el lado 3");
			l3 = scan.nextInt();
			gGestor.nuevoTriangulo(l1, l2, l3);
		}
	}
	
	
/************************************************************
 * Metodo:		imprimir
 * 
 * Descripción:	Esta funcion imprime los datos de un objeto 
 * 				de tipo triangulo.
 * 
 * Parametros:	Triangulo tr // Objeto tipo triangulo
 * 
 * @return:		N/A
 *************************************************************/	
	private static void imprimir() {
		System.out.println(gGestor.obtenerDatos());
	}
	
	
	
	/***************************************************************************
	 * TAREA: 
	 * 
	 * 1. Terminar las getSuperficie faltantes
	 * 
	 * 2. Terminar las dibujar faltantes.
	 * 
	 * 3. Hacer una fabrica para cuadrado o rectangulo.
	 ****************************************************************************/
	
	
	
	
}



