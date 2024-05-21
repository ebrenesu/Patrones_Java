package principal;

import java.util.ArrayList;

import bridge.abstracta.AbstractaFigura;
import bridge.abstracta.IColor;
import bridge.figuras.Circulo;
import bridge.figuras.Rectangulo;
import bridge.figuras.Triangulo;

public class Gestor_Puente {
	private static ArrayList <AbstractaFigura> gobal_array_figuras;
	public String Mensaje;

	
	public Gestor_Puente() {
		setGobal_array_figuras(new ArrayList<AbstractaFigura>());
		Mensaje="";
	}
	
/****************************************************************************************
 * Nombre: Datos a Imprimir
 * Descripción: Esta funcion imprime un text en un formato especifico. 
 * @param	pText (String) Texto a imprimir
 * @return 
 * @return	n/A
 ****************************************************************************************/
    public String datos_Imprimir(String pText) {
    	return "\n-------------------------------------------------------\n"
    			+ pText 
    			+"\n-------------------------------------------------------";
    }
	
/****************************************************************************************
 * Nombre: instanciar Figura
 * Descripción: Esta funcion permite crear una nueva figura, de un color específico. . 
 * @param	pColor (IColor) Color para la figura (puede venir en null)
 * 			pType  (int)	Opcion para determinar el tipo de figura.
 * @return	n/A
 ****************************************************************************************/   
    public void instanciarFigura(IColor pColor, int pType) {
    	AbstractaFigura loca_abstract_figura = null;
		
    	switch (pType) {
	    	case 1:
	    		loca_abstract_figura = new Circulo();
	    		
	        break;
	        
	    	case 2:
	    		loca_abstract_figura = new Rectangulo();
	    		
	        break;
	    	case 3:
	    		loca_abstract_figura = new Triangulo();
	        break;
    	}
    	getGobal_array_figuras().add(loca_abstract_figura);
    	Mensaje = loca_abstract_figura.dibujar(); 
    	
    	if (pColor != null) {
    		String temp = Mensaje;
    		cambiarColor(pColor, this.getGobal_array_figuras().size()-1);
    		Mensaje = temp +"\n"+Mensaje;
    	}
    		
    }
    
/****************************************************************************************
 * Nombre: instanciar Figura
 * Descripción: Esta funcion permite crear una nueva figura, de un color específico. . 
 * @param	pColor (IColor) Color para la figura (puede venir en null)
 * 			pType  (int)	Opcion para determinar el tipo de figura.
 * @return	n/A
 ****************************************************************************************/     
    public void cambiarColor(IColor pColor, int pId) {
    	AbstractaFigura loca_abstract_figura = get_Figura(pId);
    	loca_abstract_figura.setGlobal_icolor(pColor);
    	Mensaje = loca_abstract_figura.get_info_figura() +" pasa a"+ loca_abstract_figura.get_info_color();
    }
    
    public String obterDatoFigura(int pId) {
    	AbstractaFigura loca_abstract_figura = get_Figura(pId);
    	return loca_abstract_figura.get_info_mio();
    }
    
    
/****************************************************************************************
 * 							Seccion para GETS y SETS
 ****************************************************************************************/
	public static ArrayList <AbstractaFigura> getGobal_array_figuras() {
		return gobal_array_figuras;
	}
	
	public static AbstractaFigura get_Figura(int pId) {
		return gobal_array_figuras.get(pId);
	}
	
	public static void setGobal_array_figuras(ArrayList <AbstractaFigura> gobal_array_figuras) {
		Gestor_Puente.gobal_array_figuras = gobal_array_figuras;
	}
	
	
}
