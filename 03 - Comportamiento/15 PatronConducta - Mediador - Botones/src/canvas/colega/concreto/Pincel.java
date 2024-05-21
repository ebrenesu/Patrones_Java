package canvas.colega.concreto;

import canvas.colega.interfaz.Componente;

public class Pincel extends Componente{

	public Pincel() {
		this.setTipo("Pincel");
	}
	@Override
	public void ejecutarAccion() {
		this.getMediador().pintar("Esto fue pintado por un " + this.getTipo());
		
	}

}
