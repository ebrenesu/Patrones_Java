package principal;

import java.util.ArrayList;

import colega.concreto.*;
import colega.interfaz.iOperaciones;
import mediador.concreto.Mediador;
import mediador.interfaz.iMediador;
import objetos.Producto;


public class gestor_mediador_monto {
	private  ArrayList<Producto> list_productos;
	iMediador oMediador;
	
	public gestor_mediador_monto() {
		list_productos = new ArrayList<Producto>();
		oMediador = new Mediador();
		for(int i = 0; i < 3; i++) 
			nuevo_colega(i);
	}
	
	private void nuevo_colega(int pID) {
		iOperaciones oColega = null;
		switch(pID){
			case 0:
				oColega = new Descuento(10);
			break;
			case 1:
				oColega = new Impuesto(); 
			break;
			case 2:
				oColega = new Total(); 
			break;
		}
		oColega.setMediador(oMediador);
		oMediador.agregar_colega(oColega);
	}
	
	public static void print(String pTxt, boolean bError) {
		if(bError)
			IO.printError(pTxt);
		else
			IO.print(pTxt);
	}
	
	public void print(String pTxt) {
		IO.print(pTxt);
	}
	
	public int obtener_id(String pNombre) {
		int id= -1;
		String nom="";
		for( int i = 0; i < list_productos.size(); i++) {
			nom = list_productos.get(i).getNombre().toLowerCase();
            if( nom.equals(pNombre) ) {
            	id=i;
                break;
            }
		}
		return id;
	}
	
	public void crear_Producto(String nombre, String categoria, int precio) {
		this.list_productos.add(new Producto(nombre, categoria, precio));
	}
	
	private Producto obtener_producto_nombre(String pNombre) {
		Producto opTemp = null;
		for( Producto p : this.list_productos )
            if( p.getNombre() == pNombre ) {
            	opTemp = p;
                break;
            }
		
		return opTemp;
	}
	
	public String accion_en_producto(int pId, int pTipoAccion) {
		return accion_producto( this.list_productos.get(pId), pTipoAccion);
	}
	
	public String accion_en_producto(String pNombre, int pTipoAccion) {
		return accion_producto( obtener_producto_nombre(pNombre), pTipoAccion);
	}
	
	private String accion_producto(Producto opTemp, int pTipoAccion) {
		String mMensaje = "No se encontro el producto / o el tipo de accion";
		if(opTemp != null) {
			String mAccion="";
			switch (pTipoAccion) {
				case 0:
					mAccion="Descuento";
				break;
				case 1:
					mAccion="Impuesto";
				break;
				case 2:
					mAccion="Total";
				break;
			}
			
			double mVal = oMediador.ejecutar_accion(mAccion, opTemp);
			mMensaje = "El valor aplicado del " + mAccion.toLowerCase() + " es de: "+ mVal;
		}
		return mMensaje;
	}

	public String obtener_text() {
		return IO.leer();
	}
	
	public int obtener_entero() {
		return IO.leer_numero();
	}
	
	public int cantidad_productos() {
		return this.list_productos.size();
	}
	
	public void imprimir_productos() {
		for( Producto p : this.list_productos )
          	IO.print(p.ImprimirData()+"\n");
                
	}
}
