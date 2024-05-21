package principal;

import canvas.colega.concreto.*;
import canvas.colega.interfaz.*;
import canvas.mediador.concreto.*;
import canvas.objetos.Canvas;
import cuadro_de_texto.colega.concreto.*;
import cuadro_de_texto.colega.interfaz.iColega;
import cuadro_de_texto.mediador.concreto.mediador;
import cuadro_de_texto.mediador.interfaces.*;
import cuadro_de_texto.objetos.text_box;

public class gestor_mediadores {
	
	private void print(text_box oTxt2) {
		System.out.println(oTxt2.getTexto());
	}
	
	public void print(String pTxt) {
		System.out.println(pTxt);
	}
		
	/**********************************************************************************
	 * Descripcion:
	 * 	 Esta funcion nos muestra el ejemplo automatizado usando las clases del paquete
	 *	 cuadro de texto.
	 * Parametros
	 * 	 N/A
	 * 
	 * Return
	 * 	 N/A
	 **********************************************************************************/
	public void ejemplo_Cuadro_de_texto(){
		// Creamos nuestro Mediador
		iMediador oMed1 = new mediador();
		iMediador oMed2 = new mediador();
		
		//Creamos los objetos
		text_box oTxt1 = new text_box();
		text_box oTxt2 = new text_box();
		
		// Creamos los colegas
		iColega obColega1 = new btn_Saludar("Bienvenidos al 2023");
		iColega obColega2 = new btn_Despedir("Gracias por usar el sistema");
		iColega obColega3 = new btn_formato("");
		
		iColega obColega4 = new btn_Saludar("El 2022 quedo atras, bienvenidos al 2023");
		iColega obColega5 = new btn_Despedir("Vuelve pronto");
		
		// Le asignamos a cada colega un mediador
		obColega1.setMediador(oMed1);
		obColega2.setMediador(oMed1);
		obColega3.setMediador(oMed1);
		
		obColega4.setMediador(oMed2);
		obColega5.setMediador(oMed2);
		
		//Asignamos a los mediadores los colegas que va a tener
		oMed1.nuevo_colega(obColega1);
		oMed1.nuevo_colega(obColega2);
		oMed1.nuevo_colega(obColega3);
		
		oMed2.nuevo_colega(obColega4);
		oMed2.nuevo_colega(obColega5);
		
		//Ejecutemos acciones
		
		//Saludomos en ambos objetos de Cuadro de texto.
		oMed1.ejecutar_accion("Saludar", oTxt1);
		oMed2.ejecutar_accion("Saludar", oTxt2);

		
		//Vamos a agregar valores usando las acciones de formato.
		
		//Primero con el mediador 1
		oMed1.ejecutar_accion("Formato", oTxt1, "bold","Estamos jugando Reinos Cenfotecos");
		oMed1.ejecutar_accion("Formato", oTxt1, "italic","El jugador 1 hace una grandiosa jugada");
		oMed1.ejecutar_accion("Formato", oTxt1, "italic","El jugador 2 no tiene nada que hacer");
		oMed1.ejecutar_accion("Formato", oTxt1, "italic","En hora buena, jugador 1 has ganado la partida");
		
		//Ahora con el mediador 2
		oMed2.ejecutar_accion("Formato", oTxt2, "bold","Esta es una tarea maestra");
		oMed2.ejecutar_accion("Formato", oTxt2, "italic","haremos un delete en la base de datos");
		oMed2.ejecutar_accion("Formato", oTxt2, "italic","Oh, su delete no tenia un where...");
		
		
		//Nos despedimos en ambos objetos de Cuadro de texto.
		oMed2.ejecutar_accion("Despedir", oTxt1);
		oMed1.ejecutar_accion("Despedir", oTxt2);
		
		
		print("Data del primer objeto de texto");
		print(oTxt1);
		
		print("\nData del segundo objeto de texto");
		print(oTxt2);
	}

	/**********************************************************************************
	 * Descripcion:
	 * 	 Esta funcion nos muestra el ejemplo automatizado usando las clases del paquete
	 *	 cuadro de texto.
	 * Parametros
	 * 	 N/A
	 * 
	 * Return
	 * 	 N/A
	 **********************************************************************************/
	public void ejemplo_Canvas(){
		// Creamos nuestro Mediador
		MediadorCanvas oMed1 = new MediadorCanvas();
		
		//Creamos los objetos canvas que seran nuestros lienzos
		Canvas olienzo1 = new Canvas();
		
		// Creamos los colegas
		Componente utencilio_brocha = new Brocha();
		Componente utencilio_pincel = new Pincel();
		Componente utencilio_borrador = new Borrador_Azul();
		Componente utencilio_tijera = new Tijera();
		
		// Le asignamos a cada colega un mediador
		utencilio_brocha.setMediador(oMed1);
		utencilio_pincel.setMediador(oMed1);
		utencilio_borrador.setMediador(oMed1);
		utencilio_tijera.setMediador(oMed1);
		
		//Agreguemos el lienzo donde vamos a trabajar
		oMed1.setLienzo(olienzo1);
		
		//Asignamos a los mediadores los colegas que va a tener
		oMed1.setBorrador(utencilio_borrador);
		oMed1.setPintador(utencilio_brocha);
		oMed1.setRecortador(utencilio_tijera);

		//Ejecutemos acciones
		utencilio_brocha.ejecutarAccion();
		utencilio_borrador.ejecutarAccion();
		
		//oMed1.setPintador(utencilio_pincel);
		//utencilio_pincel.ejecutarAccion();
		utencilio_tijera.ejecutarAccion();
		
		
		//Imprimamos el canvas.
		print("Imprimamos el historial del primer canvas");
		print(oMed1.mostrarHistorial());
		
		
	}

}
