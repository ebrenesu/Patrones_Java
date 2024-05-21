package chain.concreto;

import chain.abstracto.*;
import principal.Mensaje;

public class Gerente extends ManejadorOperaciones{

	public Gerente(){
		this.numeroSuerte = 16;
	}
	
	@Override
	public void ejecutarOrden(Mensaje mensaje) {
        if (mensaje.getPara().equals("Gerente")) {
        	validarMensaje(mensaje);
            System.out.println(mensaje.getContenido() + ". Atte: Gerente." 
            			  	   +" \n[PD: el numero de la suerte es: "+this.numeroSuerte+"]\n");
        }
        	
        else if (_colaborador != null)
            _colaborador.ejecutarOrden(mensaje);
		
	}
	
	private void validarMensaje(Mensaje mensaje) {
		if(mensaje.getContenido().contains("aumento"))
			mensaje.setContenido("Solicitud: "+mensaje.getContenido() 
								+ " - Respuesta: se efectuara una evaluacion de desempenno");
	}

}
