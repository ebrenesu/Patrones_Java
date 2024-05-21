package cuadro_de_texto.colega.concreto;

import cuadro_de_texto.colega.interfaz.iColega;
import cuadro_de_texto.mediador.interfaces.*;
import cuadro_de_texto.objetos.text_box;

public class btn_Saludar implements iColega {
	private String mensaje; 
	private iMediador mediador;
	
	public btn_Saludar() {
		setMensaje("");
	}
	
	public btn_Saludar(iMediador poM, String pMes) {
		setMediador(poM); 
		setMensaje(pMes);
	}
	
	public btn_Saludar(String pMes) {
		setMensaje(pMes);
	}
	
	@Override
	public String obtenerMensaje() {
		return mensaje;
	}
	
	@Override
	public void agregar_mensaje(text_box obj) {
		obj.setTexto(this.obtenerMensaje());
	}
	
	@Override
	public String obtenerTipo() {
		return "Saludar";
	}

/******************************************
 * SETs
 ******************************************/
	@Override
	public void setMediador(iMediador poM) {
		this.mediador = poM; 
	}
	
	private void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


}
