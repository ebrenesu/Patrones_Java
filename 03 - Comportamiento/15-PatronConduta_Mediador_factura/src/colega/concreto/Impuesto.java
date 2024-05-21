package colega.concreto;

import colega.interfaz.iOperaciones;
import objetos.Producto;

public class Impuesto extends iOperaciones {
	private double porcentaje;
	
	public Impuesto() {
		this.setTipo_Operacion("Impuesto");
		setMonto(13);
	}
	
	public Impuesto(double monto) {
		this.setTipo_Operacion("Impuesto");
		setMonto(monto);
	}
	
	public double getMonto() {
		return porcentaje; 
	}

	public void setMonto(double monto) {
		this.porcentaje = monto/100;
	}

	@Override
	public double ejecutarAccion(Producto pProducto) {
		double impuesto = pProducto.getPrecio() * this.getMonto();
		pProducto.setSubTotal(pProducto.getPrecio() + impuesto);
		return pProducto.getSubTotal();
	}

}
