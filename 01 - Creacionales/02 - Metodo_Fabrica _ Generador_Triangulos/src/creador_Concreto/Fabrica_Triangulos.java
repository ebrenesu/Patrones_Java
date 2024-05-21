/************************************************************
 * Clase: Fabrica_Triangulos
 * Descripción: Esta clase que implementa la fabrica abstacta.
 * @author Erick Brenes
 ************************************************************/
package creador_Concreto;

import creador.Metodo_Fabrica_Abstracta;
import producto.Triangulo;
import producto_Concreto.*;

public class Fabrica_Triangulos implements Metodo_Fabrica_Abstracta{
	
	/****************** SECCION: Implementación de las funciones abstractas *******************/	
	@Override
	public Triangulo crearTriangulo(int pLadoA, int pLadoB, int pLadoC) {
		if((pLadoA == pLadoB) & (pLadoA == pLadoC))
			return new Equilatero(pLadoA,  pLadoB,  pLadoC);
		else
			if((pLadoA != pLadoB) & (pLadoA != pLadoC) & (pLadoB != pLadoC))
				return new Escaleno(pLadoA,  pLadoB,  pLadoC);
			else
				return new Isosceles(pLadoA,  pLadoB,  pLadoC);
	}

}
