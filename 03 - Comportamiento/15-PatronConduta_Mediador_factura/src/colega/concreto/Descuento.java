package colega.concreto;

import colega.interfaz.iOperaciones;
import objetos.Producto;

public class Descuento extends iOperaciones {
	private double porcentaje;
	
	public Descuento() {
		this.setTipo_Operacion("Descuento");
		setMonto(5);
	}
	
	public Descuento(double monto) {
		this.setTipo_Operacion("Descuento");
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
		double descuento = pProducto.getPrecio() * this.getMonto();
		pProducto.setSubTotal(pProducto.getPrecio() - descuento);
		return pProducto.getSubTotal();
	}

}
