package Principal;
import Objetos.*;
import base.abstracta.*;
import base.concreta.*;
import excepciones.Excepcion_Personal;

public class Gestor_MetodoTemplate {
	Network network;
	Usuario user;
	Mensaje sms;
	
	public Gestor_MetodoTemplate() {
		network = null;
	}
	
	public void login(String pU, String pP) {
		user =  new Usuario(pU,pP);
	}
	
	public void Nuevo_Mensaje(String pMensaje) {
		sms =  new Mensaje(pMensaje);
	}
	
	public void Publicar(int pId_Network) throws Excepcion_Personal {
		Nueva_Conexion(pId_Network);
		network.post(sms);
		Desconectar();
	}
	
	public void Desconectar() {
		network.logOut();
		network = null;
	}
	
	private void Nueva_Conexion(int pId) {
		switch (pId) {
			case 1:
				network = new Facebook(user.getUser(), user.getPass());
			break;
			case 2:
				network = new Twitter(user.getUser(), user.getPass());
			break;
		}
	}
}
