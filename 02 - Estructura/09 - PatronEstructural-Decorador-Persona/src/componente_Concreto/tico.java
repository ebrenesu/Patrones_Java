package componente_Concreto;

import componente.Persona;

public class tico extends Persona{
	String nombre;
	
	public tico(String nombre) {
		this.nombre = nombre;
	} 
	
	@Override
	public int getVelocidad() {
		return 5;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getTipo() {
		return "corriendo";
	}

}
