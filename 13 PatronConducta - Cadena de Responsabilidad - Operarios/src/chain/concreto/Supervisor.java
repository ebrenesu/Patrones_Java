package chain.concreto;

import chain.abstracto.*;
import principal.Mensaje;

public class Supervisor extends ManejadorOperaciones{

	public Supervisor(){
		this.numeroSuerte = 2022;
	}
	
	@Override
	public void ejecutarOrden(Mensaje mensaje) {
        if (mensaje.getPara().equals("Supervisor")) {
            System.out.println(mensaje.getContenido() 
            				  + " Att: El Mega Supervisor. \n[PD: el numero de la suerte es: "
            				  + this.numeroSuerte+"]");
            if(mensaje.getContenido().equals("Saltar"))
            	Saltar();
            System.out.println("");
            
        }else if (_colaborador != null)
            _colaborador.ejecutarOrden(mensaje);
		
	}

	public void Saltar() {
		System.out.println("Estoy saltando como un supervisor feliz.");
	}
}
