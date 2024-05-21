package principal;

import java.util.ArrayList;

import template.abstracto.Personaje;
import template.concreto.*;

public class Gestor {
	private ArrayList <Personaje> _Personajes;
	private int _MinIdEnum, _MaxIdEnum;
	
	public Gestor() {
		this._Personajes = new ArrayList <Personaje>();
		this._MinIdEnum = 1;
		this._MaxIdEnum = 2;
	}
	
	public void nuevoPersonaje(String pNombre, int pEstamina, boolean pActivo, int pTipo) {
		Personaje temp = null;
		int est = 50;
		switch(obtenerEnum(pTipo)) {
			case LENNADOR:
				temp = new Lennador(pNombre, est, pActivo);
				break;
			case CONDUCTOR:
				temp = new Conductor(pNombre, est, pActivo);
				break;
		}
		
		this._Personajes.add(temp);
	}
	
	public String obetenerPersonajes() {
		String data = "";
		
		for (int i=0; i< this._Personajes.size(); i++) 
			data += infoPersonaje(i)+"\n";
		
		return data;
	}
	
	public String infoPersonaje(int i) {
		return "("+i+") "+this._Personajes.get(i).informacion();
	}

	public int ultimoPersonaje() {
		return this._Personajes.size();
	}

	private TiposPersonajes obtenerEnum(int pId) {
		switch(pId) {
			case 1:
			default:
				return TiposPersonajes.LENNADOR;
			case 2:
				return TiposPersonajes.CONDUCTOR;
		}
		
	}
	
	
	
	
	
	public String hacerAccion(int pId) {
		String data = "";
		if(pId == this.ultimoPersonaje())
			for (Personaje p : this._Personajes)
				data += p.ejecutar() +"\n";
					
		else
			data = this._Personajes.get(pId).ejecutar();
				
		return data;
	}
	
	

}
