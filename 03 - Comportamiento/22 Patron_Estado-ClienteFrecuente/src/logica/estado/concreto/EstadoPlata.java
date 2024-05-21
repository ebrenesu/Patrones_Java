package logica.estado.concreto;

import logica.estado.abstracto.*;
import logica.estado.contexto.*;

public class EstadoPlata implements IEstadoCliente {
	@Override
	public void verificarEstado(Contexto cliente) {
		 if (cliente.getPuntos() >= 5000 ) 
            cliente.setEstadoCliente(new EstadoOro());
         else if (cliente.getPuntos() < 1000) 
            cliente.setEstadoCliente(new EstadoNormal());
        
	}
	@Override
	public String obtenerEstado() {
		return "Plata";
	}
}
