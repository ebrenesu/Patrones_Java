package base.abstracta;

import Objetos.Mensaje;
import excepciones.Excepcion_Personal;

public abstract class Network {
	private String userName;
    private String password;
    private Mensaje sMensaje;
    

/************************************************************
 * Function:	post
 * Descripcion:	Esta funcion permite hacer un post siempre y 
 * 				cuando se haga una autentificacion.
 * Parametros:	message: String: Nombre de la red social.
 * Return:		N/A
 * @throws Excepcion_Personal 
 ************************************************************/    
    public boolean post(Mensaje message) throws Excepcion_Personal {
    	boolean result = false;
        if (logIn(this.getUserName(), this.getPassword())) 
        	result = publish(message);
            
        return result;
    }
    
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Mensaje getsMensaje() {
		return sMensaje;
	}

	public void setsMensaje(Mensaje sMensaje) {
		this.sMensaje = sMensaje;
	}
	
	/************************************************************
	 * Funciones que los Concretos deben de implementar y seran llamadas 
	 * en un orden en especifico.
	 *************************************************************/
    public abstract boolean publish(Mensaje message) throws Excepcion_Personal;
    public abstract boolean logIn(String userName, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logOut();
}
