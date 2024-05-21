/*****************************************************************
 * Clase: Escaleno
 * Descripción: Esta clase es un producto concreto que extiende.
 * 				de la clase Triangulo, esta obligadoa implementar
 * 				los metodos abstractos y puede usar o extender
 * 				los metodos implementados en el Super()
 * @author Erick Brenes
 *****************************************************************/

package producto_Concreto;

import producto.Triangulo;

public class Escaleno extends Triangulo{
	/******************************** SECCION: CONSTRUCTORES *********************************/	
	public Escaleno(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC,"Escaleno");
	}

	/****************** SECCION: Implementación de las funciones abstractas *******************/
	@Override
	public String getDescripcion() {
		return "Yo soy un triangulo de tipo " + this.getNombre();
	}

	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String dibujar() {
		// TODO Auto-generated method stub
		return null;
	}

}
