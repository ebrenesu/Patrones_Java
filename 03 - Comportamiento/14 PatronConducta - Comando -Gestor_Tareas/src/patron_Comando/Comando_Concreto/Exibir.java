package patron_Comando.Comando_Concreto;

import base.Producto;
import patron_Comando.Comando_Abstracto.TareaProducto;

public class Exibir implements TareaProducto {
    @Override
    public void ejecutar(Producto producto) {
        if(producto.get_Tipo().toLowerCase() == "Digital" )
            System.out.println(producto.get_Nombre() +" esta en exhibicion.\n") ;
        else
            System.out.println("Aqui no exhibimos eso... ["+producto.get_Nombre()+"]\n") ;
    }
}
