package principal;

import interprete.interpreter.ClienteInterprete;
import interprete.interpreter.Contexto;

public class Gestor {
	ClienteInterprete _interprete;
	
	public Gestor() {
		_interprete = new ClienteInterprete(new Contexto());
	}
	
	public String interpretar_Texto(String pData) {
		return _interprete.interpretar(pData);
	}
	
	public String obtener_opciones() {
		return _interprete.opciones();
	}
	
	public String obtenerTipo(int pOc) {
		return _interprete.obtenerTipo(pOc);
	}
}
