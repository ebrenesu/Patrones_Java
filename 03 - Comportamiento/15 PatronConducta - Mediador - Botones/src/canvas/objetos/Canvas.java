package canvas.objetos;

import java.util.ArrayList;

public class Canvas {
	private ArrayList<String> historial = new ArrayList<String> ();
	private String ultimo_Cambio;
	
	public void actualizar_el_canvas(String pValue) {
		historial.add(pValue);
		this.ultimo_Cambio = pValue;
	}
	
	public String get_estado() {
		return this.ultimo_Cambio;
	}
	
	public String get_historial() {
		String sMensaje ="";
		
		for (int i = 1; i <= historial.size(); i++)
			sMensaje += i + ". " + historial.get(i-1) + "\n";
		
		return sMensaje;
	}
}
