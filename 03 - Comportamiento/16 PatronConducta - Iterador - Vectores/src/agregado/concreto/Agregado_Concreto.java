package agregado.concreto;

import java.util.Vector;

import agregado.Agregado;
import iterador.Iterador;
import iterador.concreto.Iterador_Concreto;

public class Agregado_Concreto implements Agregado {
	private Vector aDatos = new Vector();
	@Override
	public Iterador getIterador(){
        return new Iterador_Concreto(this);
    }
	
	public Vector getDatos() {
		return aDatos;
	}

	public void setDatos(Vector aDatos) {
		this.aDatos = aDatos;
	}
	 
}
