package sistemaClasico.objetos;
/**************************************************************************************
 * Esta clase se crea solo como una clase auxiliar. Esta es una fachada que le ayuda a 
 * fachada original. Pero se podria agregar los datos dentro de la otr. 
 **************************************************************************************/ 

public class Receta {
	private int giCantidad_Cafe;
	private int giCantidad_Agua;
	private int giCantidad_Leche;
	private String gSNombre;
	
/* ********************************************************************** *
 * 									 Recetas							*
 * ********************************************************************** */
	
	public void Cafe_Negro() {
		setCantidad_Cafe(1);
		setCantidad_Agua(2);
		setCantidad_Leche(0);
		setNombre("Cafe Negro");
	}
	
	public String Cafe_Con_Leche() {
		return "";
	}	
	
	public String Cafe_Expresso() {
		return "";
	}
/* ********************************************************************** *
 * 								Sección Set y Gets						*
 * ********************************************************************** */	
	private void setCantidad_Cafe(int giCantidad_Cafe) {
		this.giCantidad_Cafe = giCantidad_Cafe;
	}
	
	private void setCantidad_Agua(int giCantidad_Agua) {
		this.giCantidad_Agua = giCantidad_Agua;
	}

	private void setCantidad_Leche(int giCantidad_Leche) {
		this.giCantidad_Leche = giCantidad_Leche;
	}
	
	private void setNombre(String gSNombre) {
		this.gSNombre = gSNombre;
	}

	
	public int getCantidad_Cafe() {
		return giCantidad_Cafe;
	}

	public int getCantidad_Agua() {
		return giCantidad_Agua;
	}

	public int getCantidad_Leche() {
		return giCantidad_Leche;
	}

	public String getNombre() {
		return gSNombre;
	}



	
	
	
	
	
	
	
	
	
	
}
