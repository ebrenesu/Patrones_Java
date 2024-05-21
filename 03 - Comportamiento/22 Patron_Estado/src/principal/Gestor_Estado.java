package principal;

import estado.abstracto.EstadoSemaforo;
import estado.concreto.*;
import estado.objeto.Semaforo;

public class Gestor_Estado {
	private Semaforo objSemaforo ;
	public Gestor_Estado() {
		objSemaforo = new Semaforo();
	}
	
	public String Cambiar_Estado(int pID) {
		EstadoSemaforo estado=null;
		switch (pID) {
			case 1:
				estado = new EstadoVerde();
				break;
			case 2:
				estado = new EstadoNaranja();
				break;
			case 3:
				estado = new EstadoRojo();
				break;
				
		}
		objSemaforo.setEstado(estado);
		return Mostrar_Estado();
	}
	
	public String Mostrar_Estado() {
		return objSemaforo.mostrar();
	}
	
	public String Alerta() {
		Cambiar_Estado(2);
		return Mostrar_Estado();
	}
	
	public String Emergencia() {
		Cambiar_Estado(3);
		return Mostrar_Estado();
	}
	

	
}
