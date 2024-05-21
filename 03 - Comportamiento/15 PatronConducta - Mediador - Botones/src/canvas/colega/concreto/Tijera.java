package canvas.colega.concreto;

import canvas.colega.interfaz.Componente;

public class Tijera extends Componente {

	public Tijera() {
		this.setTipo("tijeras");
	}
	
	@Override
	public void ejecutarAccion() {
		this.getMediador().recortar("Esto esta medio torcido porque se hizo con las " + getTipo());
		
	}

}
