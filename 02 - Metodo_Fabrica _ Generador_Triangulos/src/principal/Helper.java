package principal;

public class Helper {
	/************************************************************
	 * Metodo:		ramdomize
	 * 
	 * Descripción:	Esta funcion permite generar un número aleatorio
	 * 				entre 1 y 4.
	 * 
	 * Parametros:	N/A
	 * 
	 * @return:		Random // Número aleatorio
	 *************************************************************/
		static int ramdomize() {
			return (int) (Math.random() * 4) + 1;
		}

}
