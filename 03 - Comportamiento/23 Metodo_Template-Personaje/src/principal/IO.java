package principal;

import java.util.Scanner;

import template.concreto.TiposPersonajes;

public class IO {
	private Gestor _Gestor;
	private Scanner reader = new Scanner(System.in);
	private int _SALIR = -1; 
	
	public int salir() {
		return this._SALIR;
	}
	public IO(Gestor pGestor) {
		this._Gestor = pGestor;
	}
	
	public void print(String pMensaje) {
		System.out.println(pMensaje);
	}
	
	public String leerTexto() {
		return this.reader.next();
	}
	
	public int leerNumero() {
		return this.reader.nextInt();
	}
	
	public String obtenerTiposPersonajes() {
		String tipos = "Escoja un tipo: \n";
		tipos += TiposPersonajes.LENNADOR.get_Id() + ") " + TiposPersonajes.LENNADOR.get_Nombre()+"\n";
		tipos += TiposPersonajes.CONDUCTOR.get_Id() + ") " + TiposPersonajes.CONDUCTOR.get_Nombre();
		
		return tipos; 
	}
	
	public String menuPrincipal() {
		String mensaje = "Menu Principal: \n";
		mensaje += "1) Crear personaje. \n";
		mensaje += "2) Hacer accion. \n\n";
		mensaje += this._SALIR+") Salir. \n";
		
		return mensaje; 
	}
	
	public String menuPersonaje() {
		return "Menu de los Personajes. \n\n" + obtenerTiposPersonajes() ; 
	}
	
	public String obtenerTodosLosPersonajes() {
		String mensaje = "Escoja un personaje para hacer su accion. \n";
		mensaje += this._Gestor.obetenerPersonajes();
		if(this._Gestor.ultimoPersonaje()>0)
			mensaje += "("+ this._Gestor.ultimoPersonaje() + ") Todos \n\n";
		mensaje += this._SALIR+") Atras. \n";
		
		return mensaje; 
	}
	
	public void imprimirPersonaje(int pId, boolean pUltimo) {
		String data;
		if(pUltimo)
			data = _Gestor.infoPersonaje(_Gestor.ultimoPersonaje()-1);
		else
			data = _Gestor.infoPersonaje(pId);
		print("Informacion del personaje: "+data);
	}
	
	
	
}

