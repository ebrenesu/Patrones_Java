package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import excepciones.Excepcion_Personal;


public class Principal {
	static BufferedReader reader;
	private static Gestor_MetodoTemplate Gestor;
	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		Boolean bSalir = false;
		Gestor = new Gestor_MetodoTemplate();
		Print("Bienvenidos");
		Print("Escriba su usuario");
		String userName = reader.readLine();
		Print("Escriba su Contrasenna");
		String password = reader.readLine();
		
		Gestor.login(userName, password);

		while(bSalir == false) {
			Menu();
			switch (reader.readLine()) {
				case "1":
					Print("\nEscriba su Mensaje");
					String mMensaje = reader.readLine();
					Gestor.Nuevo_Mensaje(mMensaje);
				break;
				case "2":
					try {
						Gestor.Publicar(1);
					} catch (Excepcion_Personal e) {
						Print(e.getMessage());
						Gestor.Desconectar();
					}
				break;
				case "3":
					try {
						Gestor.Publicar(2);
					} catch (Excepcion_Personal e) {
						System.err.println(e.getMessage());
						Gestor.Desconectar();
					}
				break;
				case "4":
					Print("\nMuchas gracias, hasta luego.");
					bSalir = true;
				break;
				default:
					Print("\nFuncion invalida");
				break;
			}
			
		}
	}

	private static void Print(String pTexto) {
		System.out.println(pTexto);
	}

	private static void Menu() {
		String sMenu = "\n1. Escribir Mensaje. \n";
		sMenu += "2. Publicar en Facebook. \n";
		sMenu += "3. Publicar en Twiter. \n";
		sMenu += "4. Salir. ";
		Print(sMenu);
	}

/**********************************************************************
 * TAREA:
 * Agregar las validaciones que hacen falta con sus excepciones.
 * Crear un nuevo "Concreto" tipo Google Plus donde tiene un max 50 chars
 **********************************************************************/
}
