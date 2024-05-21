package logica.estado.concreto;

import logica.estado.abstracto.IEstadoCliente;
import logica.estado.contexto.Contexto;

public class EstadoNormal implements IEstadoCliente {
    @Override
    public void verificarEstado(Contexto cliente) {
        if (cliente.getPuntos() >= 1000) 
            cliente.setEstadoCliente(new EstadoPlata());
        
    }

	@Override
	public String obtenerEstado() {
		return "Normal";
	}
}
