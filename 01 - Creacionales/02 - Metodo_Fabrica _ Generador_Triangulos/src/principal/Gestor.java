package principal;

import java.util.ArrayList;

import creador.Metodo_Fabrica_Abstracta;
import creador_Concreto.Fabrica_Triangulos;
import producto.Triangulo;

public class Gestor {
	private static ArrayList <Triangulo> arrTriangulos = new ArrayList<Triangulo>(); 
	private static Metodo_Fabrica_Abstracta gFabrica;
	
	public Gestor() {
		gFabrica = new Fabrica_Triangulos();
	}
	
/************************************************************
 * Metodo:		nuevoTriangulo
 * 
 * Descripción:	Esta funcion genera un nuevo triangulo llamando
 * 				a la fabrica.
 * 
 * Parametros:	pl1 [int]
 * 				pl2 [int]
 * 				pl3 [int]
 * 
 * @return:		Void
 *************************************************************/
	public void nuevoTriangulo(int pL1, int pL2, int pL3) {
		add_objeto_array(gFabrica.crearTriangulo(pL1, pL2, pL3));	
	}
	
/************************************************************
 * Metodo:		add_objeto_array
 * 
 * Descripción:	Recibe un nuevo objeto y lo guarda en el array.
 * 
 * Parametros:	pObj [Triangulo]
 * 
 * @return:		Void
 *************************************************************/
	private static void add_objeto_array(Triangulo pObj) {
		arrTriangulos.add(pObj);
	}

/************************************************************
 * Metodo:		obtenerDatos
 * 
 * Descripción:	Obtiene los datos de los triangulos y los 
 * 				devuelve en una variable.
 * 
 * Parametros:	N/A
 * 
 * @return:		mResult [String] 
 *************************************************************/
	public String obtenerDatos() {
		String mResult = "";
		for (Triangulo mTr : arrTriangulos)	{				
			mResult = mResult + mTr.getDescripcion() + "\n" 
			          +"Su area es de: " + mTr.getSuperficie() + "\n" 
			          +"Sus lados son: " + mTr.getLados() + "\n"
					  +mTr.dibujar() + "\n\n"; 
		}
		
		return mResult;
		
	}
	
/************************************************************
 * Metodo:		obtenerDatos
 * 
 * Descripción:	Obtiene los datos de los triangulos y los 
 * 				devuelve en una variable.
 * 
 * Parametros:	pid [int] id del arreglo.
 * 
 * @return:		mResult [String] 
 *************************************************************/
	public String obtenerDatos(int pid) {
		String mResult = "";

		Triangulo mTr = arrTriangulos.get(pid);
		mResult = mTr.getDescripcion() + "\n" 
		          +"Su area es de: " + mTr.getSuperficie() + "\n" 
		          +"Sus lados son: " + mTr.getLados() + "\n"
				  +mTr.dibujar(); 

		return mResult;
	}


}
