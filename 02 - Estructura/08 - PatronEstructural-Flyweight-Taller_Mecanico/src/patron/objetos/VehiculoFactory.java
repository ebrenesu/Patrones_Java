package patron.objetos;

import java.util.HashMap;
import java.util.Map;

import modulo.util;
import patron.objetos.intrinseco.MarcaModelo;

public class VehiculoFactory {
	private static Map<String, MarcaModelo> gPoolCar = new HashMap<String,MarcaModelo>();
	
	public static MarcaModelo obtenerCarro(String pMarca, String pModelo, String pColor) {
		MarcaModelo mMarMod = null;
		String mKey = util.generarKey(pMarca, pModelo, pColor); 
		
		if (gPoolCar.containsKey(mKey)) {
			mMarMod = gPoolCar.get(mKey);
			util.imprimirIntegranteMapa(mKey, mMarMod, "Vehiculo recuperado");
		}else {
			switch(pMarca) {
			  case "Mercury":
				  mMarMod = new MercuryBocat(pMarca, pModelo, pColor);
			    break;
			  case "Pontiac":
				  mMarMod = new PontiacGXP(pMarca, pModelo, pColor);
			    break;
			}
			gPoolCar.put(mKey, mMarMod);
		}
			
		return mMarMod;
		
	}
	
	public static Map<String, MarcaModelo> getValoresIntrinsecos() {
		return gPoolCar;
	}
}
