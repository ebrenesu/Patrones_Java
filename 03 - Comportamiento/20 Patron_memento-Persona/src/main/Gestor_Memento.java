package main;

import memento.Caretaker;
import memento.Originator;
import objetos.Persona;

public class Gestor_Memento {
	private Persona _Ciudadano;
	private Originator _Creador; 
	private Caretaker _Vigilante;
	
	public Gestor_Memento() {
		this._Creador = new Originator();
		this._Vigilante = new Caretaker();
	}
	
	public String nuevaPersona(int pId, String pNombre, String pApellido,  int pAnno) {
		this._Ciudadano = new Persona ( pId,  pNombre,  pApellido,   pAnno); 

		_Creador.nuevoEstado(pNombre, pApellido);
		Actualizar_Memento();
		
		return "La persona ["+pNombre+" "+pApellido+"] fue instanciada y 'mementada' \n";
	}
	
	public String Obtener_Nombre() {
		return _Creador.obtenerEstado(0);
	}
	
	public String Obtener_Apellidos() {
		return _Creador.obtenerEstado(1);
	}
	
	public int Obtener_Edad() {
		return this._Ciudadano.get_Edad();
	}
	
	public String actualizarPersona(String pNombre, String pApellido) {
		String mensaje = "La informacion de la  persona ["+this._Ciudadano.get_Nombre()+" "+this._Ciudadano.get_Apellido()+"] fue actualizada.\n";
		mensaje += _Creador.nuevoEstado(pNombre, pApellido);
		this._Ciudadano.set_Nombre(_Creador.obtenerEstado(0));
		this._Ciudadano.set_Apellido(_Creador.obtenerEstado(1));
		
		return mensaje +"\n";
	}
	
	public String actualizarPersona(String pNombre, String pApellido, int pAnno) {
		String mensaje = "La informacion de la  persona ["+this._Ciudadano.get_Nombre()+" "+this._Ciudadano.get_Apellido()+" del "+ pAnno +"] fue actualizada.\n";
		mensaje += _Creador.nuevoEstado(pNombre, pApellido);
		this._Ciudadano.set_Nombre(_Creador.obtenerEstado(0));
		this._Ciudadano.set_Apellido(_Creador.obtenerEstado(1));
		this._Ciudadano.set_Edad(pAnno);
		
		return mensaje +"\n";
	}
	
	
/*==========================================================================
 *						 Seccion donde usamos el memento.
 *==========================================================================*/
	public String actualizarPersonaConMemento(String pNombre, String pApellido, int ... pArgs) {
		int opcionales[] = pArgs;
		String mensaje = "Memento actualizado > " ;
		
		if(opcionales.length > 0) 
			mensaje+= actualizarPersona (pNombre, pApellido, opcionales[0]);
		else
			mensaje+= actualizarPersona (pNombre, pApellido);
		
		Actualizar_Memento();
		
		return mensaje;
	}
		
	private void Actualizar_Memento() {
		_Vigilante.setMemento( _Creador.crearMemento() );
	}
	
	
	public void Restaurar_Memento() {
		_Creador.restaurarMemento( _Vigilante.getMemento() );
	}
	
}
