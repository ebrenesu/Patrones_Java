package builder.constructorConcreto;
import builder.constructorAbstracto.IBuilderParte;
import builder.productoAbstracto.AParte;
import builder.productoConcreto.Motor;

public class BuilderMotor implements IBuilderParte{
	private Motor _Motor;

	/**
	 * @return the _Motor
	 */
	private Motor get_Motor() {
		return _Motor;
	}

	/**
	 * @param _Motor the _Motor to set
	 */
	private void set_Motor(Motor _Motor) {
		this._Motor = _Motor;
	}
	

	@Override
	public AParte CrearProducto() {
		return CrearMotor(0, "0");
	}
	
	public AParte CrearProducto(int pCC, String pVin) {
		return CrearMotor(pCC, pVin);
	}
	
	private AParte CrearMotor(int pCC, String pVin) {
		this.set_Motor(new Motor(pCC, pVin));
		return this.get_Motor();
	}

	@Override
	public AParte ObtenerProducto() {
		return this.get_Motor();
	}

}
