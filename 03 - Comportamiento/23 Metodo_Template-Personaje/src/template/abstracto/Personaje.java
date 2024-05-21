package template.abstracto;

public abstract class Personaje {
	private String _Nombre;
	private int _Estamina;
	private boolean _Activo;
	
	/**
	 * @param _Nombre
	 * @param _Estamina
	 * @param _Activo
	 */
	public Personaje(String _Nombre, int _Estamina, boolean _Activo) {
		this._Nombre = _Nombre;
		this._Estamina = _Estamina;
		this._Activo = _Activo;
	}

	/**
	 * @return the _Nombre
	 */
	public String get_Nombre() {
		return _Nombre;
	}

	/**
	 * @return the _Estamina
	 */
	public int get_Estamina() {
		return _Estamina;
	}

	/**
	 * @return the _Activo
	 */
	public boolean is_Activo() {
		return _Activo;
	}

	/**
	 * @param _Nombre the _Nombre to set
	 */
	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}

	/**
	 * @param _Estamina the _Estamina to set
	 */
	public void set_Estamina(int _Estamina) {
		this._Estamina = _Estamina;
		if (this.get_Estamina() <= 0)
			this.set_Activo(false);
	}

	/**
	 * @param _Activo the _Activo to set
	 */
	public void set_Activo(boolean _Activo) {
		this._Activo = _Activo;
	}

	public String informacion() {
		return this.get_Nombre() + " con una estamina de: "+ this.get_Estamina();
	}
	
	
	/***********************************************************************************
	 * Descripcion: Esta funcion es la que le da vida al patron. Es la lista de pasos
	 * que se usan desde los otros elementos, es decir de los concretos que extienden
	 * esta clase abstracta. CalculoGastoEstamina y ejecutarAccion, son fuciones protegidas
	 * que no son accesibles desde el gestor, pero aportan el codigo necesario para  
	 * terminar de ejecutar la funcionalidad.
	 ***********************************************************************************/
	public String ejecutar() {
		if((this.get_Estamina() - calculoGastoEstamina())>0)
			return ejecutarAccion();
		else {
			this.set_Estamina(0);
			return "El personaje ya no tiene estamina.";
		}
		
	}
	
	
	protected abstract String ejecutarAccion();
	protected abstract int calculoGastoEstamina();
}
