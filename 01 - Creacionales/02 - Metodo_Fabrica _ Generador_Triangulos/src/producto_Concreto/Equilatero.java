/*****************************************************************
 * Clase: Equilatero
 * Descripción: Esta clase es un producto concreto que extiende.
 * 				de la clase Triangulo, esta obligadoa implementar
 * 				los metodos abstractos y puede usar o extender
 * 				los metodos implementados en el Super()
 * @author Erick Brenes
 *****************************************************************/

package producto_Concreto;

import producto.Triangulo;

public class Equilatero extends Triangulo {

	/******************************** SECCION: CONSTRUCTORES *********************************/	
	public Equilatero(int ladoA, int ladoB, int ladoC) {
		super.setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
		setNombre("Equilatero");
	}

	/****************** SECCION: Implementación de las funciones abstractas *******************/	
	@Override
	public String getDescripcion() {
		return "Yo soy un triangulo de tipo " + this.getNombre();
	}

	@Override
	public double getSuperficie() {
		double iFormula = (double) Math.sqrt(3)/4;
		double iLadoCuad =  (double) Math.pow(getLadoA(), 2);
		return iFormula * iLadoCuad;
	}

	@Override
	public String dibujar() {
		String msDibujo = ""; 
		msDibujo +="    *"+"\n";
		msDibujo +="   * *"+"\n";
		msDibujo +="  *   *"+"\n";
		msDibujo +=" *     *"+"\n";
		msDibujo +="*********"+"\n";
		
		return msDibujo;
	}

}
