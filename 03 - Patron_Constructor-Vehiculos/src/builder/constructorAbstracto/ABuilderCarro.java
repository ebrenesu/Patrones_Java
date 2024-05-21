package builder.constructorAbstracto;

import builder.productoAbstracto.AParte;
import builder.productoConcreto.*;

public abstract class ABuilderCarro {
	public Vehiculo _CarroActual = null;
	
	public abstract Vehiculo ObtenerVehiculo();
	public abstract String CrearVehiculo(AParte pMotor, AParte pCarroceria, AParte pElevaluna);
	public abstract void CambiarPieza(AParte pPieza, String pTipoPieza);
	
	/**
	 * @return the _CarroActual
	 */
	public Vehiculo get_CarroActual() {
		return _CarroActual;
	}
	/**
	 * @param _CarroActual the _CarroActual to set
	 */
	public void set_CarroActual(Vehiculo pCarroActual) {
		this._CarroActual = pCarroActual;
	}
}
