package memento;

import memento.auxiliar.Snapshoot;

public class Originator{
	
	private Snapshoot _Estado;
	 
	public Originator() {
		 _Estado = new Snapshoot();
	}
	 
	public String nuevoEstado(String nombre, String apellidos) {
		 this._Estado.nuevaInstantanea(nombre, apellidos);
		 
		 return "Originador> nuevo estado [Nombre: "+nombre+" Apellido: "+apellidos+"]";
	}
	 
	public String obtenerEstado(int pIdx) {
	 	return this._Estado.obtenerInstantanea().get(pIdx);
	}
	
	public String obtenerEstado() {
	 	return "Originador> estado actual [" +
	 			this._Estado.obtenerInstantanea().get(0) + " " + 
	 			this._Estado.obtenerInstantanea().get(1) + "]" ;
	}
	
	
/*==========================================================================
 *						 Seccion donde usamos el memento.
 ==========================================================================*/
	
	public void restaurarMemento(Memento m) {
		 this._Estado.nuevaInstantanea (m.obtenerMemento(0), m.obtenerMemento(1));
	}
	
	public Memento crearMemento() {
		 return new Memento(this._Estado.obtenerInstantanea().get(0), this._Estado.obtenerInstantanea().get(1));
	}
	

	    
   
}
