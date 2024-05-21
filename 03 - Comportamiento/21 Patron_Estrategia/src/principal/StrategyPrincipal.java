package principal;

import strategy.implementacion.CuerpoGeometrico;
import util.excepciones.ConstructorIncorrectoException;
import util.excepciones.PoligonoNoExisteException;
import util.excepciones.PoligonoNoSoportadoException;

/**
 * Clase que prueba el patron Strategy.
 *
 * @author SEAS - Estudios abiertos.
 */
public class StrategyPrincipal {

	private static Gestor_Cuerpo_Geometrico gestor_geometrico; //GESTOR
	
	
    public static void main(String[] args) {
        	gestor_geometrico = new Gestor_Cuerpo_Geometrico();
        	nueva_figura_geometrica(2f);
        	nueva_figura_geometrica(2f, 3f, 3);
        	nueva_figura_geometrica(Math.abs((float)(2f * Math.cos(90))), Math.abs((float)(2f * Math.sin(90))), 4);
        	nueva_figura_geometrica(2f, 3f, 4);
        	nueva_figura_geometrica(2f, 12);
        	nueva_figura_geometrica(2f, 10);
        	nueva_figura_geometrica(2f, 4);
        	
        	print("\n------------------------------------------------------------------");
        	print("Imprimiendo todas las figuras con su estrategia ya seleccionada:");
        	print("------------------------------------------------------------------");
            for(int i=0; i < gestor_geometrico.cantidad_figuras(); i++)
            	print(gestor_geometrico.impimir_area(i));

    }
    
    public static void nueva_figura_geometrica(float radio) {
    	try {
			gestor_geometrico.nueva_figura_geometrica(radio);
		} catch  ( Exception ex) {
            System.err.println(ex.getMessage());
		}
    }
    
    public static void nueva_figura_geometrica(float radio, int lados) {
    	try {
			gestor_geometrico.nueva_figura_geometrica(radio,lados);
		} catch  ( Exception ex) {
            System.err.println(ex.getMessage());
		}
    }
    public static void nueva_figura_geometrica(float base, float altura, int lados) {
    	try {
			gestor_geometrico.nueva_figura_geometrica(base,altura,lados);
		} catch  ( Exception ex) {
            System.err.println(ex.getMessage());
		}
    }
    
    private static void print(String message) {
    	System.out.println(message);
    }
}

/************************************************************************
 * TAREA:
 * - Hacer el programa mas interactivo, osea pedir datos al usuario.
 * - Unir las clases de excepciones de Poligono en una sola.
 *************************************************************************/
