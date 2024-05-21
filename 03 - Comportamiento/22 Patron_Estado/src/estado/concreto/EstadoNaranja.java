package estado.concreto;

import estado.abstracto.EstadoSemaforo;

public class EstadoNaranja extends EstadoSemaforo{
    public String mostrar() {
       return "Luz naranja, precaucion";
   }

}
