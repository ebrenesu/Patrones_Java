package chain.concreto;

import chain.abstracto.*;
import principal.Mensaje;

public class Operario extends ManejadorOperaciones{

	public Operario(){
		this.numeroSuerte = 10;
	}
	
	@Override
	public void ejecutarOrden(Mensaje mensaje) {
        if (mensaje.getPara().equals("Operario"))
            System.out.println(mensaje.getContenido() + 
            				   " Att:Operario" + " \n[PD: el numero de la suerte es: " 
            				   + this.numeroSuerte+"]\n");
        else if (_colaborador != null)
            	_colaborador.ejecutarOrden(mensaje);
        	else
        		super.noEncontrado(mensaje);        	
		
	}

}
