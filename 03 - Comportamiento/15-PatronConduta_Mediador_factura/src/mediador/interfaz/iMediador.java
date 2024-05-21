package mediador.interfaz;

import colega.interfaz.iOperaciones;
import objetos.Producto;

public interface iMediador {
	public double ejecutar_accion(String id_concreto, Producto p);
	public void agregar_colega(iOperaciones oColega);
		
}
