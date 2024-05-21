package sistemaFachada.principal;

import static java.lang.System.out;
import java.util.Scanner;

import sistemaClasico.clases.*;
import sistemaFachada.fachada.Fachada_CoffeMaker;

public class Main_Con_Fachada {
	private static Fachada_CoffeMaker machine;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		machine = new Fachada_CoffeMaker();
		int opcion = 0;
		
		do{
			out.println(machine.mostrarMenu());
			opcion = sc.nextInt();
			out.println(machine.ejectuar_funcion(opcion));		
		
		} while(opcion != 5);	

	}
	
}
