package observador.concreto;

import java.io.Serializable;
import observador.Interfaces.Observador;

public class ObservadorC implements Observador{
	private String gNombre;
	
	public ObservadorC(String pN) {
		gNombre=pN;
	}
	
	
	private void mostrarValor(Serializable value, String pNomProducto){
		System.out.println(pNomProducto+" cambio su valor a:" + value+", en "+ gNombre +".");
	}

	@Override
	public void update(Serializable value, String nombre) {
		mostrarValor(value, nombre);
	}
	

}