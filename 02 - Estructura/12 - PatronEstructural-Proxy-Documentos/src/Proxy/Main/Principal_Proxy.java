package Proxy.Main;

import java.util.Scanner;

import Proxy.Auxiliares.Usuarios;

public class Principal_Proxy {
	private static Scanner scan = new Scanner(System.in);
	private static Gestor_Proxy _Gestor;
	
	public static void main(String[] args) {
		int opcion = -10;
		boolean menuSecundario = false;
		int pagina=0;
		_Gestor = new Gestor_Proxy();
		
		
		while (opcion != -1) {
			if(menuSecundario) {
				menuSecundario();
				opcion = leerOpcion (-1,1);
				if(opcion == -1) {
					opcion =-10;
					menuSecundario = false;
				}else {
					imprimir("\nDigite el numero de pagina (1 al 50):");
					pagina = leerOpcion (1,50);
					imprimir(_Gestor.accederDocumento(pagina));	
				}
			}else {
				menuPrincipal();
				opcion = leerOpcion (-1,3);
				menuSecundario = true;
				Login(opcion);
			}
			
		}
		
		imprimir("Gracias por usar el sistema. Hasta la proxima");
	}
	
	private static void imprimir(String pTexto) {
		System.out.println(pTexto);
	}
	
	private static void menuPrincipal() {
		imprimir("Menu principal:\n");
		imprimir("01): Hacer login como el 'Profesor'.");
		imprimir("02): Hacer login como el 'Alumno'.");
		imprimir("03): Otro usuario.");
		imprimir("-1): Salir .\n");
	}
	
	private static void menuSecundario() {
		imprimir("\nBienvenido al sistema, ¿que desea hacer?:");
		imprimir("01): Abrir una pagina en especifico.");
		imprimir("-1): Salir .\n");
	}
	
	private static int leerOpcion(int pBase, int pTecho) {
		int valor = -10;
		
		while (valor == -10) {
			imprimir("Digite su opcion:");
			valor = scan.nextInt();
			if(valor<pBase || valor > pTecho) {
				valor = -10;
				imprimir("Valor invalido.\n");
			}
				
		}
		return valor;
	}
	
	private static void Login(int pTipo) {
		
		switch (pTipo){
			case 1:
				_Gestor.iniciarUsuario("Profesor", "123Profe",1);
				break;
			
			case 2:
				_Gestor.iniciarUsuario("Estudiante", "123456",2);
				break;
			
			default:
				_Gestor.iniciarUsuario("Profesor", "123456",2);
				break;
		}
	}
	

}