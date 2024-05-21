package cuadro_de_texto.mediador.interfaces;

import cuadro_de_texto.colega.interfaz.iColega;
import cuadro_de_texto.objetos.text_box;

public interface iMediador {
	public void ejecutar_accion(String pMensaje, text_box pObjT);
	public void ejecutar_accion(String string, text_box oTxt1, String string2, String string3);
	public void nuevo_colega(iColega obC1);
	
}
