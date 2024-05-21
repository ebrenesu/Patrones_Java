package patron_Comando.Comando_Concreto;

import base.Producto;
import patron_Comando.Comando_Abstracto.TareaProducto;

public class TareaImprimirProducto implements TareaProducto{

	@Override
	public void ejecutar(Producto producto) {
		System.out.println("Nombre del producto: " +producto.get_Nombre());
	    System.out.println("ID del producto: " +producto.get_Id());
	    System.out.println("Precio del producto: " +producto.get_Precio() + "\n");
	}

}
