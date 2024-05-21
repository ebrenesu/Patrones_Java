/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.abstracta;

public abstract class AbstractaFigura {
	public String figuraTipo;
	
	public AbstractaFigura() {};
	
    //Funciones que los hijos deben de implementar
    public abstract String dibujar();
    public abstract String get_info_figura();
    
    /*******************************************************************************
     *Estas funciones se agregan en el momento que agregamos la interface de color. 
     *******************************************************************************/
    private IColor global_icolor;
    
    //Funciones relaciones puente
    public AbstractaFigura(IColor pIc){
        this.setGlobal_icolor(pIc);
    }
    
	public IColor getGlobal_icolor() {
		return global_icolor;
	}

	public void setGlobal_icolor(IColor global_icolor) {
		this.global_icolor = global_icolor;
	}
	
	public String get_info_color() {
		if(getGlobal_icolor() != null)
			return " color: "+getGlobal_icolor().getColor();
		
		return "No tiene color asignado.";
	}
	
	public String get_info_mio() {
		if(getGlobal_icolor() != null)
			return this.get_info_figura() + " color: "+getGlobal_icolor().getColor();
		
		return this.get_info_figura();
	}
}
