package principal;

public class Main {
	private static Gestor _G;
	private static IO _IO;

	public static void main(String[] args) {
		_G =  new Gestor();
		_IO = new IO(_G);
		
		menuPrincipal();
		_IO.print("Hasta pronto");
	}
	
	private static void menuPrincipal() {
		int opcion = 0;

		while (opcion != _IO.salir()) {
			_IO.print(_IO.menuPrincipal());
			opcion = _IO.leerNumero() ;
			
			switch (opcion) {
				case 1:
					crearPersonaje();
					break;
					
				case 2:
					menuAccion();
					break;
			}
			_IO.print("\n    -------    \n");
		}
	}
	
	private static void crearPersonaje() {
		_IO.print("\nEscriba los siguientes para un nuevo personaje.");
		_IO.print("Nombre:");
		String nombre = _IO.leerTexto();
		
		_IO.print("\n"+_IO.obtenerTiposPersonajes());
		int tipo = _IO.leerNumero();
		
		_G.nuevoPersonaje(nombre, 100, true, tipo);
		_IO.print("");
		_IO.imprimirPersonaje(0,true);
	}

	private static boolean menuAccion() {
		int opcion = 0;
		int salir = 0;
		
		while (opcion != _IO.salir()) {
			_IO.print(_IO.obtenerTodosLosPersonajes());
			opcion = _IO.leerNumero() ;
			
			if(opcion >= 0 && opcion <= _G.ultimoPersonaje()) {
				_IO.print(_G.hacerAccion(opcion)+"\n");
				_IO.print("\nPresione 1 para salir? \n ");
				salir = _IO.leerNumero();
			}else
				_IO.print("Opcion invalida\n");
			
			if(salir == 1 )
				opcion = -1;
			
		}
		return false;
	}

}
