package Principal;

import java.util.ArrayList;
import java.util.Random;

import iProtitpo.Camiseta;
import prototipo.Camiseta_Manga_Corta;
import prototipo.Camiseta_Manga_Larga;


public class Gestor {
	private static ArrayList <Camiseta> arrCamisas = new ArrayList<Camiseta>(); 
	private int id_Manga_Corta;
	private int id_Manga_Larga;
	private Camiseta prototipoMCorta ;
	private Camiseta prototipoMLarga ;
	
	Gestor(int pid_Manga_Corta, int pID_Manga_Larga){
		id_Manga_Corta = pid_Manga_Corta; 
		id_Manga_Larga = pID_Manga_Larga; 		
		prototipoMCorta = new Camiseta_Manga_Corta(pid_Manga_Corta, 40, "blanoc", "Original");
		prototipoMLarga = new Camiseta_Manga_Larga(pID_Manga_Larga, 30, "blanco", "linas");
	}
	
	public void nueva_camisa(int pNum) {
		int mSerie = 0;
		if (Helper.esMultiplo(pNum,2)) {
			arrCamisas.add(prototipoMCorta.clone());
			id_Manga_Corta ++;
			mSerie = id_Manga_Corta;
	        
		}else {
			arrCamisas.add(prototipoMLarga.clone());
			id_Manga_Larga ++;
			mSerie = id_Manga_Larga;
		}
		
		updateCloneCamisa(pNum, mSerie);	
	}
	
	private static void updateCloneCamisa(int pId, int pSerie) {
		Camiseta cc = arrCamisas.get(pId);
		
		//Cambiamos de atributos nombre, color y estampado
        cc.setColor(Helper.cambioColor(Helper.ramdomize()));
        cc.setEstampado(Helper.getEstampado(Helper.ramdomize()));
        cc.setNombre("["+pSerie+"] " +cc.getColor()+" "+cc.getEstampado()+" de "+ cc.getMaterial());
        cc.setSerie(pSerie);

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
	private static void add_objeto_array(Camiseta pObj) {
		arrCamisas.add(pObj);
	}
	
/************************************************************
 * Metodo:		obtenerDatos
 * 
 * Descripción:	Obtiene los datos de los objetos del arreglo y los 
 * 				devuelve en una variable.
 * 
 * Parametros:	pid [int] id del arreglo.
 * 
 * @return:		mResult [String] 
 *************************************************************/
	public String obtenerDatos(int pid) {
		return obtenerDatosObjeto(arrCamisas.get(pid)) + "\n";
	}	
	
/************************************************************
 * Metodo:		obtenerDatos
 * 
 * Descripción:	Obtiene los datos de las camisetas y los 
 * 				devuelve en una variable.
 * 
 * Parametros:	N/A
 * 
 * @return:		mResult [String] 
 *************************************************************/
	public String obtenerDatos() {
		String mResult = "";
		for (Camiseta mOb : arrCamisas)	{				
			mResult += obtenerDatosObjeto(mOb) + "\n"; 
		}
		
		return mResult;	
	}
	
/************************************************************
 * Metodo:		obtenerDatosObjeto
 * 
 * Descripción:	Obtiene los datos de un objeto en especifico
 * 
 * Parametros:	pObj [Camiseta]
 * 
 * @return:		mResult [String] 
 *************************************************************/
	private String obtenerDatosObjeto(Camiseta pObj) {
		return pObj.getData() + "\n" ;
	}
		
	

}
