package Proxy.Implementacion;

import Proxy.Interface.IDocumento;

public class Documento implements IDocumento{

	@Override
	public String acceder(String pUsuario, String pPass) {
		return "Abriendo el documento...";
	}

	@Override
	public String cargarPagina(int pPagina) {
		return "Cargando la Imagen: "+ pPagina;
	} 
	
}