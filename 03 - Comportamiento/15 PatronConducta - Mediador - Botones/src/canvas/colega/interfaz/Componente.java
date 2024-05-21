package canvas.colega.interfaz;

import canvas.mediador.concreto.MediadorCanvas;

public abstract class Componente {
	protected MediadorCanvas m;
	private String tipo;
    
	
    public MediadorCanvas getMediador(){
        return this.m;
    }
    
	protected String getTipo() {
		 return this.tipo;
	}

    public void setMediador( MediadorCanvas m ){
        this.m = m;
    }
    
    protected void setTipo( String m ){
        this.tipo = m;
    }
    
    //------------------------------------
    
    public abstract void ejecutarAccion();
}
