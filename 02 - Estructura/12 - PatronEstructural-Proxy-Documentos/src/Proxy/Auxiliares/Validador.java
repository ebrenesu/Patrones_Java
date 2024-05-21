package Proxy.Auxiliares;

public class Validador {
	private static String _Role;
	
	public static boolean validarUsuario(String pUsuario, String pPass, int pTipo) {
		boolean tieneAcceso = false;
		set_Role("Ninguno");
		switch (pTipo){
			case 1:
				if (Usuarios.ADMIN.get_Username().equals(pUsuario) && Usuarios.ADMIN.get_Password().equals(pPass)) {
					tieneAcceso = true;
					set_Role("Profesor");
				} 
					
			break;
			
			case 2:
				if (Usuarios.USER.get_Username().equals(pUsuario) && Usuarios.USER.get_Password().equals(pPass)) {
					tieneAcceso = true;
					set_Role("Estudiante");
				} 
			break;
		
		}

		
		return tieneAcceso;
	}

	
	
	
	public static String get_Role() {
		return _Role;
	}

	private static void set_Role(String pRole) {
		_Role = pRole;
	}
	
	
}
