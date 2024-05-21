package utiles;

public enum TipoPartes {
	CARROCERIA ("Carroceria"),
	ELEVALUNA ("Elevaluna"),
	MOTOR ("Motor");
	
	private String _Nombre;
	TipoPartes(String pNombre) {
		this.set_Nombre(pNombre);
	}
	/**
	 * @return the _Nombre
	 */
	public String get_Nombre() {
		return _Nombre;
	}
	/**
	 * @param _Nombre the _Nombre to set
	 */
	private void set_Nombre(String pNombre) {this._Nombre = pNombre;}
}
