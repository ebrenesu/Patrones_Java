package Proxy.Auxiliares;

public enum Usuarios {
	ADMIN("Profesor", "123Profe"),
	USER("Estudiante", "123456");
	
	private String _Username, _Password;

	Usuarios(String pUsername, String pPassword) {
		this.set_Username(pUsername);
		this.set_Password(pPassword);
	}
	
	/**
	 * @return the _Username
	 */
	public String get_Username() {
		return _Username;
	}

	/**
	 * @param _Username the _Username to set
	 */
	public void set_Username(String pUsername) {
		this._Username = pUsername;
	}

	/**
	 * @return the _Password
	 */
	public String get_Password() {
		return _Password;
	}

	/**
	 * @param _Password the _Password to set
	 */
	public void set_Password(String pPassword) {
		this._Password = pPassword;
	}



}
