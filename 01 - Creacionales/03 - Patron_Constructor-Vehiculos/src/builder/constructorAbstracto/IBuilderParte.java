package builder.constructorAbstracto;

import builder.productoAbstracto.AParte;

public interface IBuilderParte {
	public AParte CrearProducto();
	public AParte ObtenerProducto();
}
