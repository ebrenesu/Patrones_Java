package Principal;

import java.util.ArrayList;
import java.util.List;

import concretos.*;
import interfaces.*;

public class main {
	static Gestor_Visitante Gestor;
	
	public static void main(String[] args){
		Gestor = new Gestor_Visitante();
		Print("1. Creando Personajes");
		Gestor.Agregar_Personaje(1);
		Gestor.Agregar_Personaje(2);
		
		
		Print("2. Creando Visitantes: Espada Corta y Conjuro Uno");
		Gestor.NuevoVisitante("Espada Corta", 1);
		Gestor.NuevoVisitante("Conjuro Uno", 2);


		Print("3.Imprimiento datos de los personajes sin visitar");
		Print(Gestor.obtener_valores_personajes());
		Gestor.vistar_personajes();
		Print("3a.Imprimiento datos de los personajes ya visitados");
		Print(Gestor.obtener_valores_personajes());
		
		Print("4.Aumentamos la magia al mago y visitamos los personajes");
		Gestor.Aumentar_Magia(1,5);
		Gestor.vistar_personajes();
		Print(Gestor.obtener_valores_personajes());
		
		Print("5.Aumentamos la magia al mago y visitamos los personajes");
		Gestor.Aumentar_Magia(1,8);
		Gestor.vistar_personajes();
		Gestor.vistar_personajes();
		
		Print(Gestor.obtener_valores_personajes());
		
		
	}
	private static void Print(String pTexto) {
		System.out.println(pTexto);
	}
	
	
}

/*****************************************************
 *TAREA:
 * - Agregar nombre a los Personajes (todos).
 * - Crear un nuevo personaje tipo Sniper
 * - Crear un nuevo visitante para el Sniper
 * - Crear una funcion en Gestor para visitar un 
 * unico personaje
 * - Hacerlo interactivo pidiendo datos al usuario.
*****************************************************/
 