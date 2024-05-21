package cuadro_de_texto.colega.concreto;

import cuadro_de_texto.colega.interfaz.iColega;
import cuadro_de_texto.mediador.interfaces.*;
import cuadro_de_texto.objetos.text_box;

public class btn_Despedir implements iColega {
	private String mensaje; 
	private iMediador mediador;
	
	public btn_Despedir() {
		setMensaje("<----");
	}
	
	public btn_Despedir(iMediador poM, String pMes) {
		setMediador(poM); 
		setMensaje(pMes);
	}

	public btn_Despedir(String pMes) {
		setMensaje(pMes);
	}

	@Override
	public String obtenerTipo() {
		return "Despedir";
	}

	@Override
	public String obtenerMensaje() {
		return mensaje;
	}

	@Override
	public void agregar_mensaje(text_box obj) {
		obj.setTexto(this.obtenerMensaje());
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void setMediador(iMediador poM) {
		this.mediador = poM; 
	}


}
