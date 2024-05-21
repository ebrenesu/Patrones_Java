
package bridge.figuras;

import bridge.abstracta.AbstractaFigura;
import bridge.abstracta.IColor;

public class Circulo extends AbstractaFigura {
	
	public Circulo() {
		this.figuraTipo ="Circulo";
	}
	@Override
    public String dibujar() {
        return ("Dibujando un circulo...");
    }
	
	@Override
	public String get_info_figura() {
		if(this.figuraTipo == "")
			this.figuraTipo ="Circulo";
		return this.figuraTipo;
	}
   
}

