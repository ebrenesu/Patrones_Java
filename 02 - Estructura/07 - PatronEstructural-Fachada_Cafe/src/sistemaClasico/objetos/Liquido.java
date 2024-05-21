package sistemaClasico.objetos;

import java.util.HashMap;
import java.util.Map;


public class Liquido {
	private Map<String, Integer> mgLiquidos = new HashMap<String,Integer>();
	
	public Liquido(int pCantLeche, int pCantAgua) {
		mgLiquidos.put("Agua", pCantAgua);
		mgLiquidos.put("Leche", pCantLeche);
	}
	
	public int Cantidad_Liquido_Actual(String pLNombre) {
		return mgLiquidos.get(pLNombre);
	}
	
	public void Agrear_Liquido(String pLNombre, int pVal) {
		int iVal = mgLiquidos.get(pLNombre);
		mgLiquidos.replace(pLNombre, iVal + pVal);
	}
}
