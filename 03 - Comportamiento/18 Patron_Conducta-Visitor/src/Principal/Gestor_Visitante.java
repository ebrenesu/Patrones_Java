package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import concretos.*;
import interfaces.*;

public class Gestor_Visitante {
	List<IPersonaje> personajes ;
	HashMap<String, IVisitor> objVisitante ;
	
	public Gestor_Visitante() {
		personajes = new ArrayList<IPersonaje>();
		objVisitante = new HashMap<String, IVisitor>();
	}
	
	public void Agregar_Personaje(int pTipo) {
		switch (pTipo) {
			case 1:
				Agregar_lista(new Guerrero());
				break;
			case 2:
				Agregar_lista(new Mago());
				break;	
		}
	}
	
	private void Agregar_lista(IPersonaje pPersonaje) {
		personajes.add(pPersonaje);
	}
	
	public void Aumentar_Magia(int pId, int level) {
		((Mago) personajes.get(pId)).setNivelMagia(level);
	}
	
	public String Informacion_Guerrero(int pId) {
		return Dato_Personaje(personajes.get(pId));
	}
	
	public void NuevoVisitante(String pNombre, int pId) {
		IVisitor objVisit=null;
		switch (pId) {
		case 1:
			objVisit = new EquiparArma();
			break;
		case 2:
			objVisit = new EquiparConjuro();
			break;	
			
		}
		objVisitante.put(pNombre, objVisit);
	}
	
	/***************************************
	 * Funcion usando Lambdas expression
	 ***************************************/
	public void vistar_personajes() {
		IVisitor iv;
		objVisitante.forEach((k,v) -> Visitar_Concretos(v));
	}
	
	public String obtener_valores_personajes() {
		String sMensaje="";
		for (int i=0; i< personajes.size();i++) {
			sMensaje += Dato_Personaje(personajes.get(i));
		}
		
		return sMensaje;
	}
	
	private String Dato_Personaje(IPersonaje pPersonaje) {
		String sMensaje =""; 
		String mClass = pPersonaje.getClass().getName().toString();
		
		if(mClass.contains("Mago")) {
			sMensaje = "Acerca del Mago: \n";
			sMensaje += "El arma es "+((Mago)pPersonaje).getArma()+"\n";
			sMensaje += "El cojuro es "+((Mago)pPersonaje).getConjuro()+"\n";
			sMensaje += "Nivel de magia "+((Mago)pPersonaje).getNivelMagia()+"\n";
		}
		
		if(mClass.contains("Guerrero")) {
			sMensaje = "Acerca del Guerrero: \n";
			sMensaje += "El arma es "+((Guerrero)pPersonaje).getArma()+"\n";
		}
		
		return sMensaje+"\n";
	}
	
	private void Visitar_Concretos(IVisitor pIV) {
		pIV.visit(personajes);
	}
	
}
