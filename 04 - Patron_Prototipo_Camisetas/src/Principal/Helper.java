package Principal;

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

	
/************************************************************
 * Metodo:		cambioColor
 * 
 * Descripción:	Permite obtener un color random
 * 
 * Parametros:	pId   [int]
 * 
 * @return:		Color [String] // Color aleatorio
 *************************************************************/
	public static String cambioColor(int pId) {
		String mColor="Blanco";
		switch (pId){
			case 1:
				mColor = "Rosado";
				break;
			case 2:
				mColor="Azul";
				break;
			case 3:
				mColor="Verde";
				break;
			case 4:
				mColor="Rojo";
				break;
			default:
				mColor="Negro";
				break;
		
		}
		return mColor;
	}

	
/************************************************************
 * Metodo:		getEstampado
 * 
 * Descripción:	Permite obtener un Estampado random
 * 
 * Parametros:	pId   [int]
 * 
 * @return:		Color [String] // Color aleatorio
 *************************************************************/
	public static String getEstampado(int pId) {
		String mEst="";
		switch (pId){
			case 1:
				mEst="lisa";
				break;
			case 2:
				mEst="cuadros";
				break;
			case 3:
				mEst="caricatura";
				break;
			case 4:
				mEst="artista";
				break;
			default:
				mEst="lineas";
				break;
		
		}
		return mEst;
	}


/************************************************************
 * Metodo:		esMultiplo
 * 
 * Descripción:	Revisa si los números son multiplos
 * 
 * Parametros:	n1   [int], n2 [int]
 * 
 * @return:		Boolean [bool] // True si es multiplo
 *************************************************************/
	static boolean esMultiplo(int n1,int n2){
		if (n1%n2==0)
			return true;
		else
			return false;
	}
}
