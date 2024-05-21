package estado.concreto;

import estado.abstracto.EstadoSemaforo;

public class EstadoRojo extends EstadoSemaforo{
   public String mostrar() {
       return "Luz roja. \n" + detener();
       
   }
	private String detener() {
		return ("Si te pasas la luz, va con multa");
	}
}
