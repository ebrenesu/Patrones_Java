package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import principal.Util.Util;

public class Principal_estado {
	private static Gestor_Estado Gestor;
	private static BufferedReader reader;
	
	public static void main(String[] args){
		reader = new BufferedReader(new InputStreamReader(System.in));
		Gestor = new Gestor_Estado();
		Boolean bSalir = false;
		String iLatencia = "";
		String pOpcion = "";
		
		
		try {
			Print("\nEscriba el tiempo de espera entre cambios de estado (recomienda 3)");
			iLatencia = reader.readLine();
			while(bSalir == false) {
				Menu();
				pOpcion = reader.readLine();
				switch (pOpcion) {
					case "1":
						Print("\nPresione Enter para salir");
						Funcionamiento_Normal(Integer.parseInt(iLatencia));
					break;
					case "2":
						Print("\n"+Gestor.Alerta());
					break;
					case "3":
						Print("\n"+Gestor.Emergencia());
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

    }
	
	private static void Menu() {
		String sMenu = "\n1. Funcion Normal. \n";
		sMenu += "2. Funcion de Emergencia. \n";
		sMenu += "3. Funcion de Alerta. \n";
		sMenu += "4. Salir. ";
		Print(sMenu);
	}
	
	public static void Funcionamiento_Normal(int pLatencia) {
		try {	
			int i=1;
			boolean blankLine = true;
			loop:
			while (true) {
			    int available;
			    while ((available = System.in.available()) == 0) {
			    	Cambiar_Estado_Latencia(i,pLatencia);
			    	i++;
			    	if(i==4)
			    		i=1;
			    }
			    do {
			         switch (System.in.read()) {
			             default:
			                 blankLine = false;
			                 break;
			             case 'e':
			                 if (blankLine)
			                     break loop;
			                 blankLine = true;
			                 break;
			         }
			    } while (--available > 0);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private static void Print(String pTexto) {
		System.out.println(pTexto);
	}
	private static void Cambiar_Estado_Latencia(int pId_Estado, int pLatencia) {
		Print(Gestor.Cambiar_Estado(pId_Estado));
		Util.SimularLatencia(pLatencia);
	}
}

/*******************************************************
 * TAREA:
 * - Cambiar en el gestor los switch int para estados 
 * por Enums.
 * - Agregar Excepciones Personalizadas
 * - Agregar Una funcion de Impresion de errores 
 *******************************************************/
