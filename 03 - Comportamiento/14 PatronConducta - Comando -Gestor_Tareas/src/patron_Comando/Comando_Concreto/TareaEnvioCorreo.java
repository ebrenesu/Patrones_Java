package patron_Comando.Comando_Concreto;

import base.Producto;
import patron_Comando.Comando_Abstracto.TareaProducto;

import java.util.Locale;

public class TareaEnvioCorreo implements TareaProducto{

	@Override
	public void ejecutar(Producto producto) {
		if(producto.get_Tipo().toLowerCase().contains( "digital") )
			System.out.println(producto.get_Nombre() +" enviado por correo electronico.\n") ;
		else
			System.out.println(producto.get_Nombre() +" enviado por correo fisico.\n") ;
	}

}
