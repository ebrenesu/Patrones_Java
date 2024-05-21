package principal;
import java.util.HashMap;

import observador.concreto.*;

public class Gestor_Observador {
	private HashMap<String, SujetoC> ListaProductos;

	public Gestor_Observador() {
		ListaProductos = new HashMap <String, SujetoC>();
	}
	
	public void NuevoProducto(String pKey) {
		ListaProductos.put(pKey, new SujetoC(pKey));
	}
	
	public void NuevoObservador(String pObservador, String pProducto) {
		ListaProductos.get(pProducto).addObserver(new ObservadorC(pObservador));
	}
	
	public void NuevoPrecio(String pProducto, int pPrecio) {
		ListaProductos.get(pProducto).setState(pPrecio);
	}
}
