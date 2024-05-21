package memento.auxiliar;

import java.util.ArrayList;


/*==========================================================================
 * CLASE AUXILIAR PARA ALMACENAR EL ESTADO. ESTO NO ES PARTE DEL PATRON
 * PODRIA SER UN OBJETO PERSONA TAMBIEN, PERO NO ESTAMOS GUARDANDO TODOS SUS
 * ATRIBUTOS. DEPENDIENDO QUE TANTO VAN A GUARDAR PODRIA SER UN ARREGLO O
 * VARIABLES DENTRO DEL MEMENTO Y EL ORIGINADOR
 ==========================================================================*/

public class Snapshoot {
	private String _Nombre, _Apellido;
	
	   /**************************************************************
	 	* Metodo:		Nueva Instantanea
	 	* Descripcion: Guarda el estado actual de la instantanea del 
	 	*			objeto Persona. 
	 	* 
	 	* @param pNombre
	 	* @param pApellido
	 	/**************************************************************/
		public void nuevaInstantanea(String pNombre, String pApellido) {
			this._Nombre = pNombre;
			this._Apellido = pApellido;
		} 
		
	   /****************************************************************
	 	* Metodo:		Obtener Instantanea
	 	* Descripcion: 	Obtiene los estados guardados de la instantanea  
	 	* 			  	del objeto Persona. 
	 	* @return snapshoot [ArrayList<String> ]
	 	****************************************************************/
		public ArrayList<String> obtenerInstantanea(){
			ArrayList<String> snapshoot = new ArrayList<String>();
			snapshoot.add(this._Nombre);
			snapshoot.add(this._Apellido);
			
			return snapshoot;
		}
}
