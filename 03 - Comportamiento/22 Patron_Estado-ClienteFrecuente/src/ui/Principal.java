package ui;

import logica.Gestor;

public class Principal {
	static Gestor _g;
	public static void main(String[] args) {
		_g =  new Gestor();
		
		int pts = 500;
		int t ;
		
		//Creando clientes
		nuevoCliente("John The Ripper",0);
		nuevoCliente("Juana De Arco",0);
		nuevoCliente("Carlo Magno",0);
		nuevoCliente("Jane Doe",0);
		
		t = _g.totalClientes();
		
		//Imprimiendo estados antes
		imprimirClientes(t);
		
		//Actualizando clientes
		actualizarCliente(0,pts*2-1);
		actualizarCliente(1,pts+pts);
		actualizarCliente(2,(pts+pts+pts+pts+pts)*2);
		actualizarCliente(3,pts*10);
		
		//Imprimiendo estados despues
		imprimirClientes(t);
		
		actualizarCliente(3,-300);
		//Imprimiendo estados despues
		imprimirClientes(t);
	}
	
	private static void nuevoCliente(String pNombre, int pPunts) {
		_g.nuevoCliente (pNombre,pPunts);	
	}
	
	private static void actualizarCliente(int pIdCliente, int pPunts) {
		_g.actualizarCliente (pIdCliente,pPunts);	
	}
	
	
	private static void imprimirClientes(int pTotal) {
		for (int i=0; i<pTotal;i++) {
			print(_g.imprimirEstadoCliente(i));
		}
		print("");
	}
	
	private static void print(String pText) {
		System.out.println(pText);
	}
	
}
