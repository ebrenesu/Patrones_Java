package colega.concreto;

import colega.interfaz.iOperaciones;
import objetos.Producto;

public class Total extends iOperaciones {
	private double monto;
	
	public Total() {
		this.setTipo_Operacion("Total");
	}
	
	public double getMonto() {
		return monto; 
	}

	public void setMonto(double monto) {
		this.monto = monto/100;
	}

	@Override
	public double ejecutarAccion(Producto pProducto) {
		double mTotal, mDes, mPrec, mImp = 0;
		
		mPrec = pProducto.getPrecio();
		mDes = mPrec - this.getMediador().ejecutar_accion("Descuento", pProducto);
		mImp = this.getMediador().ejecutar_accion("Impuesto", pProducto) - mPrec ;
		
		mTotal =  (mPrec + mImp) - mDes;
		
		pProducto.setSubTotal(mTotal);
		
		return mTotal;
	}

}
