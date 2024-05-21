package principal;

import bridge.abstracta.IColor;
import bridge.color.*;

public class Principal_Puente {
	private static Gestor_Puente gestor;
    
	public static void main(String[] arg){
    	gestor = new Gestor_Puente();

    	imprimir(gestor.datos_Imprimir("1) Instanciando figuras sin color:"));
    	nuevaFigura(1);
    	nuevaFigura(2);
    	nuevaFigura(3);
        
        imprimir(gestor.datos_Imprimir("2) Cambiando color a las Figuras creadas:"));
        cambiarColor(new Rojo(), 0);
        cambiarColor(new Negro(),1);
        cambiarColor(new Verde(), 2);
        
        imprimir(gestor.datos_Imprimir("3) Crear figuras de colores:"));
        nuevaFigura(new Verde(), 1);
        nuevaFigura(new Rojo(), 2);
        nuevaFigura(new Negro(), 3);
        nuevaFigura(new Arcoiris(), 3);
        
        imprimir(gestor.obterDatoFigura(0));
    }
	
	private static void imprimir(String pText) {
		System.out.println(pText);
	}
	
	private static void cambiarColor(IColor pColor, int pId) {
        gestor.cambiarColor(pColor,pId);
        imprimir(gestor.Mensaje);
	}

	private static void nuevaFigura(int pId) {
        gestor.instanciarFigura(null,pId);
        imprimir(gestor.Mensaje + "\n");
	}
	
	private static void nuevaFigura(IColor pColor, int pId) {
        gestor.instanciarFigura(pColor,pId);
        imprimir(gestor.Mensaje+ "\n");
	}
	
    
}


/***************************************************
 * TAREA:
 * - Arreglar el diseño del software para evitar 
 * la impresion en los objetos
 * 
 * - Retirar el "color" del Main y pasarlo al gestor.
 * 
 * - Cree una nueva estructura para el Rombo.
 ***************************************************/
 