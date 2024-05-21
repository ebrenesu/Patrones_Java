package componente_Concreto;

import componente.Persona;

public class peruano extends Persona{
	String nombre;
	
	public peruano(String nombre) {
		this.nombre = nombre;
	} 
	@Override
	public int getVelocidad() {
		return 4;
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
