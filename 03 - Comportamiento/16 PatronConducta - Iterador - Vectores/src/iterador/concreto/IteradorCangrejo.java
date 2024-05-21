package iterador.concreto;

import agregado.concreto.AgregadoCangrejo;
import iterador.Iterador;

public class IteradorCangrejo implements Iterador{
	private AgregadoCangrejo agregado;
	private int posicion_actual = 0;
	
	public IteradorCangrejo( AgregadoCangrejo agregado ){
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
		for (int i=0; i<3;i++) {
			if( hayMas() ) {
	            obj = this.agregado.getDatos().elementAt(this.posicion_actual);
	            this.posicion_actual = this.posicion_actual + 1;
	        }
		}
		if( hayMas() )
			this.posicion_actual = this.posicion_actual - 1;
        
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
