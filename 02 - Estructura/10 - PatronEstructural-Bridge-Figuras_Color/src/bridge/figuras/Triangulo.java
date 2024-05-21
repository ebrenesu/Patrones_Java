package bridge.figuras;

import bridge.abstracta.AbstractaFigura;

public class Triangulo extends AbstractaFigura{

	public Triangulo(){
		this.figuraTipo = "Triangulo";
	}
	@Override
	public String dibujar() {		
		 return "Dibujando un " + this.figuraTipo ;		
	}
	@Override
	public String get_info_figura() {
		return this.figuraTipo;
	}
	

}
