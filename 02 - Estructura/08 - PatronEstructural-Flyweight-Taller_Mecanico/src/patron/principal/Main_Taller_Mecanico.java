package patron.principal;


public class Main_Taller_Mecanico {
	private static Gestor_taller_mecanico _Gestor = new Gestor_taller_mecanico();
	
	public static void main(String[] args) {
		//Funcion inicial donde crea los intrinsecos y extrinsecos
		System.out.println("-----------------------------");
		System.out.println("Sistema del taller mecanico. ");
		System.out.println("-----------------------------\n");
		System.err.println("Toda la informacion extrinseca sera eliminada tras salir de la funcion.\n");
		System.out.println(_Gestor.map_Main());
		
		System.err.println("BORRA LOS DATOS DEL GESTOR.\n");
		
		System.out.println("-----------------------------");
		System.out.println("Imprimimos los Intrinsecos. ");
		System.out.println("-----------------------------\n");
		System.out.println(_Gestor.obtenerValorIntrinsecos());
		
	}
	
}

/****************************************************************
 * Ultima Actualizacion: 6/30/2022
 ****************************************************************
* TAREA:
* - Crear un menu para que el usuario pueda escoger marca, modelo, color
*  y pueda meter sus datos extrinsecos.
* - Separar la creación de la parte INTRINSICOS de la EXTRINSECA
* para que cuando llegue un cliente entra al taller el encargado 
* cree el vehiculo y si decide dejarlo rellena los datos que faltan. 
* - Crear un nuevo modelo, CENFOTESLA
*****************************************************************/
