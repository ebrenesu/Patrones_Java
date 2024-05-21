package patron.objetos;
//Extrinseco

import patron.objetos.intrinseco.MarcaModelo;

public class PontiacGXP  extends MarcaModelo {
	protected PontiacGXP(String marca, String modelo, String color) { 
    	super(marca, modelo, color);
	}

	@Override
	public String MostrarCaracteristicas(String datosExtra){
	    return super.MostrarCaracteristicas(datosExtra + " Modelo Deportivo. \n");
	}
}
