package decorador_concreto;

import decorador.ObjetoDecorado;
import componente.Persona;

public class patineta extends ObjetoDecorado {
	private int gMyVel=1;
	
	public patineta(Persona pPersona) {
		this.cPersona = pPersona;
	}
	
	@Override
	public int getVelocidad() {
		return this.cPersona.getVelocidad() - gMyVel;
	}

	@Override
	public String getNombre() {
		return this.cPersona.getNombre() + " en patineta";
	}

	@Override
	public String getTipo() {
		return " patineteando";
	}
	
	public int hacerTrampa() {
		return 10;
	}
}
