package estado.concreto;

import estado.abstracto.EstadoSemaforo;

public class EstadoVerde extends EstadoSemaforo{
     public String mostrar() {
        return ("Luz verde, avance");
    }
}
