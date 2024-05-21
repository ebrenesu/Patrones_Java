package patron.objetos;

import patron.objetos.intrinseco.MarcaModelo;

//Extrinseco
public class MercuryBocat extends MarcaModelo {
	protected MercuryBocat(String marca, String modelo, String color) { 
    	super(marca, modelo, color);
	}

	@Override
	public String MostrarCaracteristicas(String datosExtra){
	    return super.MostrarCaracteristicas(datosExtra);
	}
}
