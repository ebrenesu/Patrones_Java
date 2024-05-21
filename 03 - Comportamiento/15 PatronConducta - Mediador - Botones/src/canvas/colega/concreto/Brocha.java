package canvas.colega.concreto;

import canvas.colega.interfaz.Componente;

public class Brocha extends Componente{

	public Brocha() {
		this.setTipo("Brocha");
	}
	@Override
	public void ejecutarAccion() {
		this.getMediador().pintar("Esto fue pintado por una " + this.getTipo());
		
	}


}
