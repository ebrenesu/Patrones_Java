package excepciones;

public class Excepcion_Personal extends Exception {
	public Excepcion_Personal(int pTipo) {
		super(Seleccionar_Mensaje(pTipo));
	}
	
	private static String Seleccionar_Mensaje(int pTipo) {
		String Mensaje="";
		switch (pTipo) {
			case 1:
				Mensaje = "Coneccion Invalida";
				break;
			case 2:
				Mensaje = "Usuario o Password Invalidos";
				break;
			case 3:
				Mensaje = "Cantidad de caracteres no permitido";
				break;
		}
		
		return Mensaje;
	}
}
