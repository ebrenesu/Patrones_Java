package iterador.concreto;

import agregado.concreto.Agregado_Concreto;
import iterador.Iterador;

public class Iterador_Concreto implements Iterador{
	private Agregado_Concreto agregado;
	private int posicion_actual = 0;
	
	public Iterador_Concreto( Agregado_Concreto agregado ){
		this.agregado = agregado;
    }
	
	@Override
	public Object primero() {
		Object obj = null;
        if( this.agregado.getDatos().isEmpty() == false ){
            this.posicion_actual = 0;
            obj = this.agregado.getDatos().firstElement();
        }
        return obj;

	}

	@Override
	public Object siguiente() {
		Object obj = null;
        if( hayMas() ) {
        	this.posicion_actual = this.posicion_actual + 1;
            obj = this.agregado.getDatos().elementAt(this.posicion_actual);
        }
        return obj;
	}

	@Override
	public boolean hayMas() {
        if( this.posicion_actual < (this.agregado.getDatos().size() ) ) 
            return true;
        
        return false;
	}

	@Override
	public Object actual() {
		Object obj = null;
        if( this.posicion_actual < this.agregado.getDatos().size() ) {
            obj = this.agregado.getDatos().elementAt( this.posicion_actual );
        }
        return obj;
	}
	

}
