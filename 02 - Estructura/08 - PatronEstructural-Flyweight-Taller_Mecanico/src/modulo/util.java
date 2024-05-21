/* ********************************************************************** *
 * Clase que brinda funciones reutilizables.
 * 
 * @by Erick Brenes
 * ********************************************************************** */
package modulo;

import java.util.Map;

import clasico.objetos.vehiculoC;
import patron.objetos.extrinseco.vehiculo;
import patron.objetos.intrinseco.MarcaModelo;

public class util {
	
/* ********************************************************************** *
 * Funcion de impresion para el manejo de la clase MAP esto nos permite el
 * manejo de una estructura de datos para almacenar pares "clave/valor". 
 * De tal manera que para una clave solamente tenemos un valor. 
 * ********************************************************************** */
	public static String imprimirMapaCarros(Map<String,vehiculo> map) {
		vehiculo mvc;
		String caracteristicas="";
		for(Map.Entry m:map.entrySet()){  
		  mvc = (vehiculo) m.getValue();
		  caracteristicas += m.getKey()+" "+mvc.MostrarCaracteristicas()+"\n";  
		}  
		return caracteristicas;
	}
	
	public static String imprimirMapaCarrosC(Map<String,vehiculoC> map) {
		vehiculoC mvc;
		String resultado = "";
		for(Map.Entry m:map.entrySet()){  
		  mvc = (vehiculoC) m.getValue();
		  resultado += (m.getKey()+" "+mvc.MostrarCaracteristicas()) + "\n";  
		}  
		return resultado;
	}
	
	public static String imprimirIntegranteMapa(String pKey, MarcaModelo pVeh) {
		return (pKey+" "+ pVeh.MostrarCaracteristicas(""));
	}
	
	public static String imprimirIntegranteMapa(String pKey, MarcaModelo pVeh, String pData) {
		return (pKey+" "+ pVeh.MostrarCaracteristicas(pData));
	}
	
	public static String generarKey(String pMarca, String pModelo, String pColor) {
		return pMarca+"-"+pModelo+"-"+pColor;
	}
 
	public static String imprimirMapaMarcaModelo(Map<String, MarcaModelo> pMarcaModelo) {
		MarcaModelo mvc;
		String caracteristicas="";
		for(Map.Entry m:pMarcaModelo.entrySet())
		  caracteristicas += imprimirIntegranteMapa (m.getKey().toString(),(MarcaModelo) m.getValue()) +"\n";  
		
		return caracteristicas;
	}


}
