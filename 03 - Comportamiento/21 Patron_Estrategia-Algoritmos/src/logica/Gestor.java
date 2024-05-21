package logica;
import logica.estrategia.contexto.ContextoEstrategia;

public class Gestor {
	private ContextoEstrategia _Context;
	
	public Gestor() {
		_Context = new ContextoEstrategia();
	}

	public String obtenerEstrategias() {
		return _Context.obtenerTipoEstrategia(false);
	}
	public String escogerEstrategia(int pOpcion) {
		_Context.seleccionarEstrategia(pOpcion);
		return _Context.obtenerTipoEstrategia(true);
	}
	
	public String ordenar(int[] pArreglo) {
		String arregloOrdenado="";
		for (int num : _Context.ordenar(pArreglo))  
			arregloOrdenado += String.valueOf(num)+" ";
		
		return arregloOrdenado;
	}
	

}
