package estado.objeto;

import estado.abstracto.EstadoSemaforo;
import estado.concreto.EstadoVerde;

public class Semaforo
{
    private EstadoSemaforo objEstadoSemaforo;
    
    public Semaforo() {
    	setEstado(new EstadoVerde());
    }
    
     public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
         this.objEstadoSemaforo = objEstadoSemaforo;
    }
    
     public String mostrar() {
        return this.objEstadoSemaforo.mostrar();
    }
}