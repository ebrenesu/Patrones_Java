package main;
import java.util.Scanner;

public class Main_Builder {
	private static int opSalir;
	private static Scanner scanner = new Scanner(System.in);
	private static Gestor _Gestor = new Gestor();
	
	public static void main(String[] args) {
		int opcion;
		_Gestor =  new Gestor();
		opSalir = 0;
		do {
			Print("\n"+MenuPrincipal());
			opcion = LeerEntero("\nIngrese la opcion escogida: ");
			ProcesarOpcion(opcion);
		}while (opcion !=opSalir );
	}
	
	private static String MenuPrincipal() {
		return  "1. Crear Vehiculo\n"+
				"2. Cambiar pieza vehiculo\n"+
				"3. Listar vehiculos.\n"+
				"0. Salir.\n";
	}
	
	private static String MenuCrearVehiculo() {
		return  _Gestor.ObtenerListaVehiculosCrear() + 
				"0. Volver al menu principal."+ "\n" ;
	}
	
	private static String MenuCrearParte() {
		return  _Gestor.ObtenerListaPartesCrear() + 
				"0. Volver al menu principal."+ "\n" ;
	}
	
	private static void Print(String pM) {
		System.out.println(pM);
	}
	
	private static int LeerEntero(String pMensaje) {
		Print(pMensaje);
		while (!scanner.hasNextInt()) {
			Print("Error. Ingrese una opcion valida: ");
			scanner.next(); 
		}
		int numero = scanner.nextInt();
		scanner.nextLine();
		return numero;
	}
	
	private static String leerString(String pMensaje) {
        Print(pMensaje);
        String cadena = scanner.nextLine();
        return cadena;
    }
	
	private static void ProcesarOpcion(int pOpc) {
		String mensaje="", subraya ="======================\n";
		
		switch (pOpc) {
			default:
				mensaje = "opcion invalida.\n";
				break;
			case 0:
				mensaje = "Gracias por su visita.\n";
				break;
				
			case 1:
				mensaje = ProcesarFuncionCrearVehiculo();
				break;
				
			case 2:
				mensaje = MenuCrearParte();
				break;
				
			case 3:
				mensaje = "Listar todos los vehiculos.\n"+subraya;
				mensaje += _Gestor.ObtenerDatosVehiculo("");
				break;
		}
		
		
		Print(mensaje);
	}
	
	private static String ProcesarFuncionCrearVehiculo() {
		int opcion = -1;
		String mensaje = "";
		while (opcion != opSalir ) {
			Print(MenuCrearVehiculo());
			opcion = LeerEntero("Ingrese la opcion escogida: ");
			if(opcion < opSalir && opcion > 4)
				Print("Opcion invalida.\n\n");
			else {
				if (opcion != opSalir) 
					mensaje = "\nCrear Vehiculo\n ======================\n" + 
							  _Gestor.CrearVehiculo(opcion, leerString("Escriba el color del vehiculo a crear:"));
				opcion = opSalir ;
			}
		}
		return mensaje;
	}
}



/***************************************************************************
 * TAREA: 
 * 
 * 1. Agregar el Builder para el aire acondicionado.
 * 2. Actualizar el menu de partes.
 * 
 ****************************************************************************/

