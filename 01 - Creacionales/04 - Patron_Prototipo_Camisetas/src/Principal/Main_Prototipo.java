package Principal;

import java.util.ArrayList;
import java.util.Random;

import iProtitpo.Camiseta;
import prototipo.*;

public class Main_Prototipo {
	private static Gestor gGestor;

	public static void main(String[] args) {
		// Variables
		int idMC = 2023;
		int idML = 4030;	
		
		//Inicializamos el gestor.
		gGestor = new Gestor(idMC,idML);
		
		//Creamos los clones
		for(int i = 0; i<2000;i++) 
			gGestor.nueva_camisa(i);
		
		//Los imprimimos
		System.out.println(gGestor.obtenerDatos());
		
		
	}
	
}
