package builder.constructorConcreto;

import builder.constructorAbstracto.IBuilderParte;
import builder.productoAbstracto.AParte;
import builder.productoConcreto.Carroceria;

public class BuilderCarroceria implements IBuilderParte {
	private AParte _Carroceria;
	
	/**
	 * @return the _Carroceria
	 */
	private AParte get_Carroceria() {
		return _Carroceria;
	}
	
	/**
	 * @param _Carroceria the _Carroceria to set
	 */
	private void set_Carroceria(AParte pCarroceria) {
		this._Carroceria = pCarroceria;
	}

	@Override
	public AParte ObtenerProducto() {
		return this.get_Carroceria();
	}
	
	@Override
	public AParte CrearProducto() {
		return NuevoProducto("null", "transparente");
	}
	
	
	public AParte CrearProducto(String pSerie, String pColor) {
		return NuevoProducto( pSerie,  pColor);
	}
	
	private AParte NuevoProducto(String pSerie, String pColor) {
		this.set_Carroceria(new Carroceria(pSerie,  pColor));
		return get_Carroceria();
	}


}
