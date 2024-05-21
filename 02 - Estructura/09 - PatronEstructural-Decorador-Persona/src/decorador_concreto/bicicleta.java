package decorador_concreto;

import decorador.ObjetoDecorado;
import componente.Persona;

public class bicicleta extends ObjetoDecorado {
	private int gMyVel=15;
	
	public bicicleta(Persona pPersona) {
		this.cPersona = pPersona;
	}

	@Override
	public int getVelocidad() {
		return this.cPersona.getVelocidad() + gMyVel;
	}

	@Override
	public String getNombre() {
		return this.cPersona.getNombre() + " en bicicleta";
	}

	@Override
	public String getTipo() {
		return " cleteando";
	}
	
}