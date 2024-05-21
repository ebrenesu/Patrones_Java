package agregado.concreto;

import java.util.Vector;

import agregado.Agregado;
import iterador.Iterador;
import iterador.concreto.IteradorCangrejo;

public class AgregadoCangrejo implements Agregado  {
	private Vector aDatos = new Vector();
	
	
	@Override
	public Iterador getIterador(){
        return new IteradorCangrejo(this);
    }
	
	public Vector getDatos() {
		return aDatos;
	}

	public void setDatos(Vector aDatos) {
		this.aDatos = aDatos;
	}
	 

}
