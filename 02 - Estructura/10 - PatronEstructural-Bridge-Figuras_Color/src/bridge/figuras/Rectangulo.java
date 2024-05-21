package bridge.figuras;

import bridge.abstracta.AbstractaFigura;
import bridge.abstracta.IColor;

public class Rectangulo extends AbstractaFigura {
	
	public Rectangulo() {
		this.figuraTipo = "Rectangulo";
	}
	
	@Override
    public String dibujar() {
        return ("Dibujando un rectangulo...\n"
        		+ " ------------\n"
        		+ "|            |\n"
        		+ " ------------");
    }
	
	@Override
	public String get_info_figura() {
		if(this.figuraTipo == "")
			this.figuraTipo = "Rectangulo";
		return this.figuraTipo;
	}
    
}
