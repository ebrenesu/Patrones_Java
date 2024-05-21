package creador;
/************************************************************
 * Clase: Metodo_Fabrica_Abstracta
 * Descripcion: Esta clase es la fabrica abstacta.
 * @author Erick Brenes
 ************************************************************/


import producto.Triangulo;

public interface Metodo_Fabrica_Abstracta {
	public Triangulo crearTriangulo (int pLadoA,int pLadoB,int pLadoC);
}
