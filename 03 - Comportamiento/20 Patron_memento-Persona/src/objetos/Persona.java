package objetos;

import java.util.Calendar;

public class Persona {
	private String _Nombre, _Apellido;
	private int _Id, _Edad;
	
	/**
	 * @param _Nombre
	 * @param _Apellido
	 * @param _Id
	 * @param pAnno [int] [año de nacimiento]
	 */
	public Persona(int pId, String pNombre, String pApellido,  int pAnno) {
		set_Nombre ( pNombre);
		set_Apellido (pApellido);
		set_Id (pId);
		set_Edad(pAnno);
	}
	/**
	 * @return the _Nombre
	 */
	public String get_Nombre() {
		return _Nombre;
	}
	/**
	 * @return the _Apellido
	 */
	public String get_Apellido() {
		return _Apellido;
	}
	/**
	 * @return the _Id
	 */
	public int get_Id() {
		return _Id;
	}
	/**
	 * @return the _Edad
	 */
	public int get_Edad() {
		return _Edad;
	}
	
	
	/**
	 * @param _Nombre the _Nombre to set
	 */
	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}
	/**
	 * @param _Apellido the _Apellido to set
	 */
	public void set_Apellido(String _Apellido) {
		this._Apellido = _Apellido;
	}
	/**
	 * @param _Id the _Id to set
	 */
	public void set_Id(int _Id) {
		this._Id = _Id;
	}
	
	/**
	 * @param _Edad the _Edad to set
	 */
	public void set_Edad(int pAnno) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		this._Edad = year - pAnno;
	}
	
	
}
