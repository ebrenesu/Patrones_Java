package clasico.principal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import clasico.objetos.vehiculoC;
import modulo.util;
import patron.objetos.extrinseco.vehiculo;

public class Main_Clasico {

	public static void main(String[] args) {
			//classic_Main();
			//System.out.println("----------------------------\n");
		//classic_Main();	
		map_Main();
	}
	
	@SuppressWarnings("deprecation")
	public static void classic_Main() {
		vehiculoC veh1 = new vehiculoC("Mercury", "Bobcat", "Verde", "ABC-123", new Date(2019, 07, 14), "1-0123-0456");
		vehiculoC veh2 = new vehiculoC("Mercury", "Bobcat", "Verde", "CAB-123", new Date(2010, 01, 01), "1-0456-0123");
		vehiculoC veh3 = new vehiculoC("Pontiac", "GXP", "Rojo", "PKA-002", new Date(2018, 04, 25), "1-0444-0555");
		vehiculoC veh4 = new vehiculoC("Pontiac", "GXP", "Cafe", "PKA-102", new Date(2018, 04, 25), "1-9944-0555");
		
		System.out.println("Programa clasico");
		System.out.println(veh1.MostrarCaracteristicas());
		System.out.println(veh2.MostrarCaracteristicas());
		System.out.println(veh3.MostrarCaracteristicas());
		System.out.println(veh4.MostrarCaracteristicas());
	}

	@SuppressWarnings("deprecation")
	public static void map_Main() {
		Map<String, vehiculoC> mpCar = new HashMap<String,vehiculoC>();
		mpCar.put(util.generarKey("Mercury", "Bobcat", "Verde"),new vehiculoC("Mercury", "Bobcat", "Verde", "ABC-123", new Date(2019, 07, 14), "1-0123-0456"));
		mpCar.put(util.generarKey("Mercury", "Bobcat", "Verde"),new vehiculoC("Mercury", "Bobcat", "Verde", "CAB-123", new Date(2010, 01, 01), "1-0456-0123"));
		mpCar.put(util.generarKey("Pontiac", "GXP", "Rojo"),    new vehiculoC("Pontiac", "GXP"   , "Rojo", "PKA-002" , new Date(2018, 04, 25), "1-0444-0555"));
		util.imprimirMapaCarrosC(mpCar);
	}



}
