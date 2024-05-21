package principal;

import java.util.Scanner;
import gestor.gestorFabricaVehiculos;

public class Main_Fabrica_Abstracta {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int iOpc = 0;

		do {
			iOpc = mostrarMenu();
			System.out.print(gestorFabricaVehiculos.procesarFuncion(iOpc));			
		} while (iOpc !=5 );
		
	}

	
/****************************************************************************
 * Function: 
 * 			Mostrar Menu
 * Descripcion:
 * 			Esta funcion muestra el menu principal para la creación de 
 * 			la fabrica.
 * @param
 * 			N/A
 * @return
 * 			int opcionMenu		// Nos da la opción que escogio el usuario.
 ****************************************************************************/
	private static int mostrarMenu() {
		String cad="";
		
		cad=cad+"\n";
		cad=cad+"Ingrese la opcion correspondiente: \n";
		cad=cad+"1. Crear un nuevo Taxi\n";
		cad=cad+"2. Crear un nuevo Bus\n";
		cad=cad+"3. Crear una nuevo  Microbus\n";
		cad=cad+"4. Imprimir Codigos existentes\n";
		cad=cad+"5. Salir \n";
		cad=cad+"\n";
		
		System.out.println(cad);
		
		return scan.nextInt();
	}
}


/****************************************************************************
 * TAREA: 
 * 	1. Crear nuevos tipos de producto concreto: Uber, avion 
 *  2. Actualizar el menu
 *  3. Imprima solo un tipo de vehiculo: usted escoge cual.
 ****************************************************************************/