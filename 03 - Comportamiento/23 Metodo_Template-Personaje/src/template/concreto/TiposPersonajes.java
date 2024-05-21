package template.concreto;

public enum TiposPersonajes {
	LENNADOR("Leñador",1),
	CONDUCTOR("Conductor",2);
	
	private String _Nombre;
	private int _Id;
	
	/**
	 * @param _Nombre
	 * @param _Id
	 */
	private TiposPersonajes(String pNombre, int pId) {
		this._Nombre = pNombre;
		this._Id = pId;
	}

	/**
	 * @return the _Nombre
	 */
	public String get_Nombre() {
		return _Nombre;
	}

	/**
	 * @return the _Id
	 */
	public int get_Id() {
		return _Id;
	}

	
}
