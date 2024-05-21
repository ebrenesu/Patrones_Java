package principal;

import java.util.Vector;

import agregado.Agregado;
import agregado.concreto.*;
import iterador.Iterador;

public class Gestor {
	private static Vector _Datos;
	private static Agregado agregado;
	private static Iterador iterador;
	
	Gestor() {
		crearDatosVector(); 					// Llenamos el vector.
		cambiarAgregado(1);
        iterador = agregado.getIterador();		// Crear el objeto iterador para recorrer la lista
	}
	
	public void crearDatosVector() {
		_Datos = new Vector();
		_Datos.add( new String("JOSE") );
        _Datos.add( new String("MARTA") );
        _Datos.add( new String("ANTONIO") );
        _Datos.add( new String("ROMINA") );
        _Datos.add( new String("2019") );
        _Datos.add( 2020 );
        _Datos.add( 20.21 );
        _Datos.add( 2022 );
        _Datos.add( false );
        _Datos.add( 2019.2022 );
        
	}

	public void cambiarAgregado(int pID) {
		if(pID == 0) 
			agregado = new Agregado_Concreto(); 	// Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
		else
			agregado = new AgregadoCangrejo(); 	    // Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
		
		asignarDatosAgregado();
	}
	private void asignarDatosAgregado() {
		agregado.setDatos(_Datos);
	}
	
	
	public String avanzar(int pVeces) {
		for (int i=0; i < pVeces; i++) 
			iterador.siguiente();
		return ahoraSoy();
	}
	
	public String primero() {
		iterador.primero();
		return ahoraSoy();
	}
	
	public String ahoraSoy() {
		return (String) iterador.actual();
	}
	
	public String imprimirDesdeDondeEstoyEnAdelante() {
		String mensaje="";
		while( iterador.hayMas() == true ) {
			mensaje += iterador.siguiente().toString() +" \n" ;
        }
		return mensaje;
	}
}
