package Objetos;

public class Mensaje {
	private String Mensaje;
	
	public Mensaje(String pMensaje) {
		setMensaje(pMensaje);
	}
	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public int Get_Mensaje_Size() {
		return Mensaje.length();
	}
}
