package main;

import java.util.ArrayList;

import componente_Concreto.*;
import decorador.ObjetoDecorado;
import decorador_concreto.*;
import componente.Persona;

public class Gestor_decorador {
	private ArrayList<Persona> global_array_persona;
	
	
	Gestor_decorador(){
		setGlobal_array_persona(new ArrayList<Persona>());
	}
	
	public void nuevaPersona (String pNombre, int pTipo) {
		Persona p = null;
		switch(pTipo) {
			case 1:
				 p = new tico(pNombre);
			break;
			case 2:
				p = new peruano(pNombre);
			break;
				
		}
			
		getGlobal_array_persona().add(p);
	}
	
	public void decorarPersona (int pIdPersona, int pTipoDecoracion) {
		Persona p = this.getPersona(pIdPersona);
		switch(pTipoDecoracion) {
			case 1:
				replacePersona_Array(pIdPersona,new patineta(p));
			break;
			
			case 2:
				replacePersona_Array(pIdPersona,new bicicleta(p));	
			break;
			
			case 3:
				replacePersona_Array(pIdPersona,new casco(p));	
			break;
		}
		
	}
	
	public void QuitarDecorarPersona (int pIdPersona) {
		ObjetoDecorado pDecorada = (ObjetoDecorado) this.getPersona(pIdPersona);
		Persona personaL = pDecorada.getPersona();
		replacePersona_Array(pIdPersona,personaL);
	}

	public String printPersona(int pId) {
		Persona pPA = this.getPersona(pId);
		
		return pPA.getNombre() +"\n" 
			  +pPA.getVelocidad() +" km/h \n" 
			  + "Esta "+pPA.getTipo();

		
	}

	public Persona getPersona(int pId) {
		return global_array_persona.get(pId);
	}
	
	public ArrayList<Persona> getGlobal_array_persona() {
		return global_array_persona;
	}

	public void setGlobal_array_persona(ArrayList<Persona> global_array_persona) {
		this.global_array_persona = global_array_persona;
	}
	
	public void replacePersona_Array(int pId, ObjetoDecorado pP) {
		this.global_array_persona.set(pId, pP);
	}
	
	public void replacePersona_Array(int pId, Persona pP) {
		this.global_array_persona.set(pId, pP);
	}
}
