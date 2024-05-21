package decorador_concreto;

import componente.Persona;
import decorador.ObjetoDecorado;

public class casco  extends ObjetoDecorado {
	
	public casco(Persona pPersona) {
		this.cPersona = pPersona;
	}

	@Override
	public int getVelocidad() {
		return this.cPersona.getVelocidad() + powerup();
	}

	@Override
	public String getNombre() {
		return this.cPersona.getNombre() + " con casco";
	}

	@Override
	public String getTipo() {
		return this.cPersona.getTipo() + " pero con proteccion";
	}
	
	public int powerup() {
		return 2;
	}
	
}
