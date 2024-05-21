package cuadro_de_texto.colega.concreto;

import cuadro_de_texto.colega.interfaz.iColega;
import cuadro_de_texto.mediador.interfaces.iMediador;
import cuadro_de_texto.objetos.text_box;

public class btn_formato implements iColega {
	private String mensaje; 
	private iMediador mediador;
	
	public btn_formato() {
		setMensaje("<----","bold");
	}
	
	public btn_formato(iMediador poM, String pMes) {
		setMediador(poM); 
		setMensaje(pMes,"bold");
	}		
	
	public btn_formato(String pMes) {
		setMensaje(pMes, "bold");
	}

	private String get_italic(String pMes) {
		return "_" + pMes +"_" ;
	}
	
	private String get_bold(String pMes) {
		return "*" + pMes +"*" ;
	}

	public void setMensaje(String mensaje, String pFormat) {
		if(pFormat == "bold")
			this.mensaje = get_bold(mensaje);
		else
			this.mensaje = get_italic(mensaje);
	}
	
	@Override
	public String obtenerTipo() {
		return "Formato";
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
	public void setMediador(iMediador poM) {
		this.mediador = poM; 
	}

	
}
