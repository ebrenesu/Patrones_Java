package logica.estado.abstracto;
import logica.estado.contexto.*;

public interface IEstadoCliente {
	public void verificarEstado(Contexto cliente);
	public String obtenerEstado();
	//public String obtenerBeneficios();
}
