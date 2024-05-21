package logica.estado.contexto;

import logica.estado.abstracto.IEstadoCliente;
import logica.estado.concreto.*;
import logica.objetos.Cliente;

public abstract class Contexto {
	protected IEstadoCliente estadoCliente;
	
	public Contexto(){
		estadoCliente = new EstadoNormal();
	}
	
	public void setEstadoCliente(IEstadoCliente estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
	
    public void verificarEstado(Cliente cliente) {
        estadoCliente.verificarEstado(cliente);
    }

    public abstract int getPuntos();
    
    public String getInfo() {
    	return this.estadoCliente.obtenerEstado();
    }

}
