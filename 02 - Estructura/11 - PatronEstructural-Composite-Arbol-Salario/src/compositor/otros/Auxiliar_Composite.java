/*****************************************************************************
 * Descripcion: Esta es una clase auxiliar, este tipo de clases se hacen 
 * para ayudar a entender (organizar) mejor el codigo del patron. Por lo tanto
 * esta clase no es parte de la estructura del patrón. 
 ******************************************************************************/
package compositor.otros;

import java.util.ArrayList;

import compositor.base.iComponente;
import compositor.componentes.*;

public class Auxiliar_Composite {
	private ArrayList<iComponente> _Empresas;
	private ArrayList<iComponente> _Equipos;
	private ArrayList<iComponente> _Empleados;
	
	public Auxiliar_Composite() {
		for (int i=1; i<4; i++)
			setComponentes(i, new ArrayList<iComponente>());
	}
	
	public String infoTipoObjetos() {
		return "1. Empresa.\n"
			 + "2. Equipo.\n"
			 + "3. Empleado.\n";
	}

	public void nuevoComponente(int pTipo, String pNombre) {
		iComponente temp = null;
		switch(pTipo) {
			case 1:
				temp = new Empresa(pNombre);
				break;
			case 2:
				temp = new Equipo(pNombre);
				break;
		}
		addComponentes(pTipo, temp);
	}
	
	public void nuevoComponente(int pTipo, String pNombre, int pSalario) {
		addComponentes(pTipo, new Empleado(pSalario, pNombre));
	}
	
	public void agregarHoja(int pTipoHijo, String pNombreHijo, String pNombrePadre) {
		iComponente padre = findComponente(pTipoHijo - 1, pNombrePadre);
		iComponente hijo = findComponente(pTipoHijo, pNombreHijo);
		
		if(padre != null && hijo != null)
			padre.agregarComponente(hijo);
	}
	
	public int obtenerSalario(int pTipo, String pNombre) {
		iComponente temp = findComponente(pTipo, pNombre);
		
		if (temp != null)
			return temp.getSalario();
		
		return -1;	
	}
	
	public String obtenerDescripcion(int pTipo, String pNombre) {
		iComponente temp = findComponente(pTipo, pNombre);
		
		if (temp != null)
			return temp.mostrarDatos();
		
		return "No se encontro la empresa:["+pNombre+"]";	
	}
	
	public ArrayList<String> obtenerLista(int pTipo){
		ArrayList<iComponente> tempArr = getComponentes (pTipo);
		ArrayList<String> lista = new ArrayList<String>();
		
		for (iComponente item : tempArr) 
	         lista.add(item.getNombre());
	    
		return lista;
	}
	
	private iComponente findComponente(int pTipo, String pNombre) {
		ArrayList<iComponente> tempArr = null;
		
		switch(pTipo) {
			case 1:
				tempArr = this._Empresas;
				break;
			case 2:
				tempArr = this._Equipos;
				break;
			case 3:
				tempArr = this._Empleados;
				break;
		}
		
		for (iComponente item : tempArr) {
	        if (item.getNombre().equals(pNombre)) {
	        	return item;
	        }
	    }
		
		return null;
	}
	
	private void setComponentes(int pTipo, ArrayList<iComponente> pComponente) {
		switch(pTipo) {
			case 1:
				this._Empresas = pComponente;
				break;
			case 2:
				this._Equipos = pComponente;
				break;
			case 3:
				this._Empleados = pComponente;
				break;
		}
	}
	
	private  ArrayList<iComponente> getComponentes(int pTipo) {
		switch(pTipo) {
			case 1:
				return this._Empresas;
			case 2:
				return this._Equipos;
			case 3:
				return this._Empleados;
				
		}
		return null;
	}
	
	private void addComponentes(int pTipo, iComponente pComponente) {
		switch(pTipo) {
			case 1:
				this._Empresas.add(pComponente);
				break;
			case 2:
				this._Equipos.add(pComponente);
				break;
			case 3:
				this._Empleados.add(pComponente);
				break;
		}
	}
	
	
}
