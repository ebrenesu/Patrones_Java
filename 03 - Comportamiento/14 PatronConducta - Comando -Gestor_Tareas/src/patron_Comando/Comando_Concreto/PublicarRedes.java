package patron_Comando.Comando_Concreto;

import patron_Comando.Comando_Abstracto.TareaProducto;
import base.Producto;

public class PublicarRedes implements TareaProducto {
    private int _valConectar = 1;

    public PublicarRedes(int ValConector){
        this._valConectar = ValConector;
    }
    @java.lang.Override
    public void ejecutar(Producto producto) {
        if(conectarse(this._valConectar))
            if(producto.get_Tipo().toLowerCase() == "digital" )
                System.out.println (saludar() +"\n Su producto es: "+ producto.get_Nombre() + ".\nYa esta en las redes.") ;
            else
                System.out.println ("Su producto no es digital ["+producto.get_Nombre()+"]");
        else
            System.out.println ("No se conecto, asi que no hay publicacion\n") ;
    }

    private Boolean conectarse (int X){
        if(X>1)
            return true;
        else
            return false;
    }

    private String saludar (){
        return "Hola querido usario de carelibro";
    }
}
