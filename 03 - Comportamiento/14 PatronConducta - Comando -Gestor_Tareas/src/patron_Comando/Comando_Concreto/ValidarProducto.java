package patron_Comando.Comando_Concreto;

import base.Producto;
import patron_Comando.Comando_Abstracto.TareaProducto;

public class ValidarProducto implements TareaProducto{
	private int _ValorEvaluado = 250;

	@Override
	public void ejecutar(Producto producto) {
		if (producto.get_Precio() < _ValorEvaluado)
			System.out.println("producto ["+producto.get_Nombre()+"] valido, precio: " + producto.get_Precio());
		else
			System.out.println("producto ["+producto.get_Nombre()+"]  invalido. Precio fuera de rango" );

		System.out.println("");
	}

}
