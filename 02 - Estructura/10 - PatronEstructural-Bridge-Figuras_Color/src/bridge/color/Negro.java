package bridge.color;

import bridge.abstracta.IColor;

public class Negro implements IColor {
	
    @Override
    public void pintar() {
    	System.out.println("Agregamos rojo, verde, azul, amarillo");
    	System.out.println("Mezclamos");
        System.out.println("Color Negro");
    }

	@Override
	public String getColor() {
		String mensaje = "Negro";
		return mensaje;
	}
    
}
