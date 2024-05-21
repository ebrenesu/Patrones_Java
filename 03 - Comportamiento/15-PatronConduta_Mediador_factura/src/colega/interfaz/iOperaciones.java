package colega.interfaz;

import objetos.Producto;
import mediador.interfaz.iMediador;

public abstract class iOperaciones {
	private iMediador mediador;
	private String tipo_Operacion;
	
	//Seccion Gets
	public iMediador getMediador() {
		return mediador;
	}
	
	public String getTipo_Operacion() {
		return tipo_Operacion;
	}
	
	//Seccion Sets

	public void setMediador(iMediador mediador) {
		this.mediador = mediador;
	}
	
	protected void setTipo_Operacion(String tipo_Operacion) {
		this.tipo_Operacion = tipo_Operacion;
	}
	
	
	// Funcion abstractas para implementar en los hijos
	public abstract double ejecutarAccion(Producto pProducto);
	
}
