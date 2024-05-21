package Clasemain;

import Singleton.Configurador;

public class inicial {
	private static String[][] msDatos;
	public static void main(String[] args) {
		msDatos = new String[2][2];
		//Primera Coneccion
		newDato(0,0,"");
		newDato(0,1,"Laboratorio_1");
		
		//Segunda Coneccion
		newDato(1,0,"www.cenfotec.ac.cr/BISOFT-12");
		newDato(1,1,"Laboratorio_2");
		
		imprimir("\nTratamos de conectarnos con los datos del primer 'usuario'");
		conectarse(0);
		imprimir("\nTratamos de conectarnos con los datos del segundo 'usuario'");
		conectarse(1);
		
		imprimir("\nNos vamos a desconectar. Y volver a tratar con el segundo usuario.");
		Configurador.desconectar();
		conectarse(1);
	}
	private static void newDato(int i, int j, String valor) {
		msDatos[i][j] = valor;
	}
	
	private static void conectarse(int pId ) {
		imprimir("Datos Originales: " + (pId+1));
		imprimir("URL: " + msDatos[pId][0]);
		imprimir(" DB: " + msDatos[pId][1]+"\n");
		
		Configurador configuradorTemp = Configurador.conectarse(msDatos[pId][0], msDatos[pId][1]);
		imprimir("Coneccion numero usando SINGLETON");
		imprimir("URL: " + configuradorTemp.getUrl());
		imprimir(" DB: " + configuradorTemp.getBaseDatos());
		imprimir("==============================" );
	}
	
	private static void imprimir(String pMensaje) {
		System.out.println(pMensaje);
	}
}

/*=============================================================================================================
 = TAREA:
 ==============================================================================================================
 = Agregue una clase Gestor. 
 = Desde el main envia el id de la persona y del entregable para establecer conexion.
 = Agregue una clase Persona (nombre, id, arreglo de Entregables).
 = Agregue una clase Entregables (nombre, id).
 = Agregue una validacion para corroborar si la Persona tiene acceso a dicho Entregable. Si lo tiene puede 
 =    usar la conexion.
 ==============================================================================================================*/