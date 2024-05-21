package canvas.colega.concreto;

import canvas.colega.interfaz.Componente;

public class Borrador_Azul extends Componente{

	public Borrador_Azul() {
		this.setTipo("Borrador Azul super potente");
	}
	@Override
	public void ejecutarAccion() {
		this.getMediador().borrar("Esto se borro unsando un " + this.getTipo());		
	}

}
