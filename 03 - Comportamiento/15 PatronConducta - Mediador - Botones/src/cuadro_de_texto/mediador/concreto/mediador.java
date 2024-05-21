package cuadro_de_texto.mediador.concreto;

import java.util.ArrayList;

import cuadro_de_texto.colega.concreto.*;
import cuadro_de_texto.colega.interfaz.iColega;
import cuadro_de_texto.mediador.interfaces.*;
import cuadro_de_texto.objetos.text_box;

public class mediador implements iMediador {
	private  ArrayList<iColega> list_colegas_mediados;
	
	public mediador() {
		list_colegas_mediados = new ArrayList<iColega>();
	}

	public void nuevo_colega(iColega pObj) {
		list_colegas_mediados.add(pObj);
	}
	
	@Override
	public void ejecutar_accion(String pId, text_box pObj) {
		pObj.setTexto(get_sepecific_colega(pId).obtenerMensaje());
	}
	
	@Override
	public void ejecutar_accion(String pId, text_box pObj, String pFormato, String mensaje) {
		iColega temp = get_sepecific_colega(pId);
		if (temp != null) {
			((btn_formato) temp).setMensaje(mensaje,pFormato);
			pObj.setTexto(temp.obtenerMensaje());	
		}
		
	}
	
	private iColega get_sepecific_colega(String pType) {
		iColega temp = null;
		
		for( iColega colega : list_colegas_mediados )
            if( colega.obtenerTipo() == pType ) {
            	temp = colega;
                break;
            }
        
		return temp;
	}
}
