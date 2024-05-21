package cuadro_de_texto.colega.interfaz;

import cuadro_de_texto.mediador.interfaces.iMediador;
import cuadro_de_texto.objetos.text_box;

public interface iColega {
	public String obtenerTipo();
	public String obtenerMensaje();
	public void agregar_mensaje(text_box obj);
	public void setMediador(iMediador pOM);
}
