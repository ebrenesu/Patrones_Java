package gestor;

import fabrica_Abstracta.VehiculoDeTransporte;
import fabrica_Concreta.Fabrica_Bus;
import fabrica_Concreta.Fabrica_Microbus;
import fabrica_Concreta.Fabrica_Taxi;
import producto_Abstracto.Vehiculo;
import producto_Concreto.Bus;

import java.util.ArrayList;


public class gestorFabricaVehiculos {
	private static ArrayList <Vehiculo> arTransportes = new ArrayList<Vehiculo>(); 
	
	/********************************************************************************************
	 * VehiculoDeTransporte pFabrica:
	 * 			es una fabrica concreta, puede ser fabrica_taxi, fabrica_microbus, fabrica_bus.
	 * 
	 * Vehiculo objVehiculo:
	 * 			es un objeto abstracto que puede ser IMPLEMENTADO por Taxi, Bus, Microbus.  
	 ********************************************************************************************/
	public static String CrearFabricaDeVehiculos(VehiculoDeTransporte pFabrica) {
		Vehiculo objVehiculo = pFabrica.crearVehiculo();
		agregar_vehiculo(objVehiculo);
		return objVehiculo.obtener_info_vehiculo();
	}

	private static void agregar_vehiculo(Vehiculo pObjVehiculo) {
		arTransportes.add(pObjVehiculo);
	}
	
	public static String obtener_informacion_tranportes() {
		String msDatos="";
		
		for (int i=0 ; i < arTransportes.size() ; i++)
			msDatos = msDatos + arTransportes.get(i).obtener_info_vehiculo() + "\n";
		
		return msDatos;
	}
	
	
	public static String obtener_informacion_taxi() {
		String msDatos="";
		
		for (int i=0 ; i < arTransportes.size() ; i++)
			if(arTransportes.get(i).getTipo() == "Taxi")
				msDatos = msDatos + arTransportes.get(i).obtener_info_vehiculo() + "\n";
		
		return msDatos;
	}
	
	
	public static String rutasBuses() {
		String msDatos="";
		
		for (int i=0 ; i < arTransportes.size() ; i++) {
			if(arTransportes.get(i).getClass() == Bus.class)
				msDatos = msDatos + ((Bus) arTransportes.get(i)).recogerPasajero() + "\n";
			
		}
			
		return msDatos;
	}
	
	/****************************************************************************
	 * Function: 
	 * 			 Procesar Funcion
	 * Descripción:
	 * 			 Según la opción seleccionada por el usuario, decide si crea una
	 * 			fabrica u obtiene los valores de los objetos creados. En caso de 
	 * 			que la opción no este en el rango valido, envia un mensaje de error.
	 * @param
	 * 			 int pOpc			// La opcion escogida por el usuario.
	 * @return
	 * 			 String sMensaje 	// El resultado de la función escogida. 
	 ****************************************************************************/
		public static String procesarFuncion(int pOpc ) {
			String sMensaje ="";
			VehiculoDeTransporte moVeh;
			
			switch (pOpc) {

					case 1:
						moVeh  = new Fabrica_Taxi();
						sMensaje = CrearFabricaDeVehiculos(moVeh);
					break;
					
					case 2:
						moVeh  = new Fabrica_Bus();
						sMensaje = CrearFabricaDeVehiculos(moVeh);
					break;
					
					case 3:
						moVeh  = new Fabrica_Microbus();
						sMensaje = CrearFabricaDeVehiculos(moVeh);
					break;
					
					case 4:
						sMensaje = obtener_informacion_tranportes();
					break;
					
					case 5:
						sMensaje = "Muchas gracias por usar el sistema";
					break;
					
					case 6:
						sMensaje = rutasBuses();
					break;
						
					default:
						sMensaje = "Opcion invalida";
					break;
				}
			
			return sMensaje ;
			
		} 	
	
	
}
