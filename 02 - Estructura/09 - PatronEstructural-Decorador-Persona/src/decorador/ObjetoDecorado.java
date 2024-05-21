package decorador;

import componente.Persona;

public abstract class ObjetoDecorado extends Persona {
	protected Persona cPersona;
	
	public Persona getPersona() {
		return cPersona;
	}
	

}
