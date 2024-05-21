package logica;

import java.util.ArrayList;
import logica.objetos.Cliente;

public class Gestor {
	private ArrayList<Cliente> _Clientes ;
	
	public Gestor() {
		_Clientes = new ArrayList<Cliente>();
	}
	
	public void nuevoCliente(String pNombre, int pPunts) {
		_Clientes.add(new Cliente(pNombre, pPunts));

	}

	public void actualizarCliente(int pIdCliente, int pPunts) {
		Cliente pTemp = _Clientes.get(pIdCliente);
		pTemp.agregarPuntos(pPunts);
	}
	
	public String imprimirEstadoCliente(int pIdCliente) {
		Cliente pTemp = _Clientes.get(pIdCliente);
		return pTemp.getInfo();
	}
	
	public int totalClientes() {
		return this._Clientes.size();
	}

}
