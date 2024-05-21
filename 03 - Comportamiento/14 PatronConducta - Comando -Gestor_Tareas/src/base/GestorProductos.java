package base;

public class GestorProductos {
	
	public void validarProducto(Producto producto) {
	    if (producto.get_Precio() == 100) {
	      System.out.println("producto valido");
	    } else {
	      System.out.println("producto invalido");
	    }
	  }

	public void imprimirProducto(Producto producto) {
	    
	    System.out.println(producto.get_Nombre());
	    System.out.println(producto.get_Id());
	    System.out.println(producto.get_Precio());
	  }
	
	public void enviarPorCorreo(Producto producto) {
	    System.out.println(producto.get_Nombre() +"enviado por correo") ;
	}
	
}
