package sistemaClasico.clases;

import java.util.ArrayList;

import sistemaClasico.objetos.Cafe;
import sistemaClasico.objetos.Vaso;

public class maquina_cafe {

	private int cantAgua, cantLeche;  //ESto se puede mejorar usando el objeto Liquido.
	private ArrayList<Vaso> lista_vasos;
	private Cafe cafAct;
	
	public maquina_cafe() {
		set_CantidadAgua(1000); 	// Se agrega un Litro de agua.
		set_CantidadLeche(1000); 	// Se agrega un Litro de leche.
		set_CrearVasos();	
		cafAct = new Cafe("CafeTec", "San Pedro", 1, 100);
	}
	
//----------------------------- SET -----------------------------------------------//	
	public void set_CantidadAgua(int val) {
		cantAgua = val;
	}
	
	public void set_CantidadLeche(int val) {
		cantLeche = val;
	}

	public void set_CrearVasos() {
		lista_vasos = new ArrayList<Vaso>();
		lista_vasos.add(new Vaso(1,15,20)); // Agregamos vasos de 15 CC
		lista_vasos.add(new Vaso(2,20,20)); // Agregamos vasos de 20 CC
		lista_vasos.add(new Vaso(3,25,20)); // Agregamos vasos de 25 CC
	}

//------------------------------ GET ----------------------------------------------//
	
	public int get_cantidadLeche() {
		return cantLeche;
	}

	public int get_cantidadAgua() {
		return cantAgua;
	}

	public int get_cantidadCafe() {
		return cafAct.getCantStock();
	} 
	public Vaso get_VasoEspecifico(int pId) {
		return lista_vasos.get(pId);
	}
	public String obtener_Datos_Cafe() {
		return cafAct.get_Data_cafe(0);
	}

//------------------------------ VALIDACIONES ---------------------------------------//	
	

	public boolean revisarNivelAgua(int iVaso, int iAgua) {
		int cntAgua = get_VasoEspecifico(iVaso).get_CantidadMG();
		if ((get_cantidadAgua() >= cntAgua) && (cntAgua >= iAgua)){
			return true;
		}else
			return false;
	}

	public boolean revisarStockCafe(int pCantCafe) {
		if (cafAct.getCantStock() >= pCantCafe) {
			cafAct.setCantStock( cafAct.getCantStock() - 1);
			return true;
		}else
			return false;
	}
	
	public boolean revisarNivelLeche(int iLeche) {
		if (get_cantidadLeche() >= iLeche) 
			return true;
		else
			return false;
	}
	
	public boolean revisarStockVasos(int idVaso) {
		if (get_VasoEspecifico(idVaso).get_CantidadVasos() >= 1) 
			return true;
		else
			return false;
	}
	
/*------------------------------- Preparación del cafe------------------------------------------*/
	
	public String colocarCafe(int iCafe) {
		cafAct.setCantStock(cafAct.getCantStock() - iCafe);
		return "Se coloco " + iCafe+ " de cantidad de cafe \n";
	}
	
	public String colocarVaso(int idVaso) {
		Vaso v = get_VasoEspecifico(idVaso);
		v.setCantidad(v.get_CantidadVasos() - idVaso);
		
		return("El vaso esta en su lugar\n");
	}
	
	public String calentarAgua() {
		return("El agua esta calentadose\n");
	}
	
	public String calentarLeche() {
		return("La leche esta calentadose\n");
	}
	
	public String verterAgua(int iAgua) {
		cantAgua = cantAgua- iAgua;
		return("El agua esta siendo vertida\n");
	}
	
	public String verterLeche(int iLeche) {
		cantLeche = cantLeche - iLeche;
		return("La leche esta siendo vertida\n");
	}
	
	public String servirCafe() {
		return("El vaso ya tiene su cantidad de ");
	}

}
