package principal;

public class Principal_Observador {
	static Gestor_Observador Gestor;
	public static void main(String[] args) {
		/**/
		Gestor = new Gestor_Observador();
		
		Gestor.NuevoProducto("Sodas");
		Gestor.NuevoProducto("Chocolates");
		Gestor.NuevoProducto("Libros");
		Gestor.NuevoProducto("Calculadoras");
		Gestor.NuevoProducto("Cenfomones");
		
		Gestor.NuevoPrecio("Sodas", 1000);
		Gestor.NuevoPrecio("Chocolates", 2000);
		Gestor.NuevoPrecio("Libros", 3000);
		Gestor.NuevoPrecio("Calculadoras", 4000);
		Gestor.NuevoPrecio("Cenfomones", 4000);
		
		Gestor.NuevoObservador("Mas x Menos", "Sodas");
		Gestor.NuevoObservador("Yuris Place", "Sodas");
		Gestor.NuevoObservador("Abel Corrales Super Market", "Sodas");
		Gestor.NuevoObservador("Yuris Place", "Libros");
		Gestor.NuevoObservador("Cenfo Place", "Chocolates");
		Gestor.NuevoObservador("Cenfo Store", "Libros");
		Gestor.NuevoObservador("Kathy Store", "Cenfomones");
		
		Gestor.NuevoPrecio("Sodas", 3000);
		System.out.println(" ");
		Gestor.NuevoPrecio("Sodas", 300);
		System.out.println(" ");
		
		Gestor.NuevoPrecio("Calculadoras", 99);
		System.out.println(" ");
		
		Gestor.NuevoPrecio("Cenfomones", 990);
		Gestor.NuevoObservador("Cenfo Store", "Calculadoras");
		Gestor.NuevoPrecio("Calculadoras", 130);
		System.out.println(" ");
		
		Gestor.NuevoPrecio("Chocolates", 300);
		System.out.println(" ");
		
	/**/
		
		/*
		System.out.println(" /n Ejemplo Gasolineras /n");
		Gestor_Observador Gestor2 = new Gestor_Observador();
		
		Gestor2.NuevoProducto("Gasolina Super");
		Gestor2.NuevoProducto("Gasolina Regular");
		Gestor2.NuevoProducto("Diesel");
		Gestor2.NuevoProducto("Gas LP");
		Gestor2.NuevoProducto("Deuterio");
		
		Gestor2.NuevoObservador("Bomba Cenfo", "Gasolina Super");
		Gestor2.NuevoObservador("Bomba Cenfo", "Gasolina Regular");
		Gestor2.NuevoObservador("Bomba Cenfo", "Diesel");
		
		Gestor2.NuevoObservador("Bomba Latina", "Gasolina Super");
		Gestor2.NuevoObservador("Bomba Latina", "Gasolina Regular");
		
		Gestor2.NuevoObservador("Bomba Americana", "Diesel");
		Gestor2.NuevoObservador("Bomba Americana", "Gas LP");
		
		Gestor2.NuevoObservador("Bomba Cenfo", "Deuterio");
		Gestor2.NuevoObservador("Bomba Americana", "Deuterio");
		Gestor2.NuevoObservador("Bomba Latina", "Deuterio");
		
		Gestor2.NuevoPrecio("Gasolina Super", 530);
		System.out.println(" ");
		
		Gestor2.NuevoPrecio("Gasolina Regular", 515);
		System.out.println(" ");
		
		Gestor2.NuevoPrecio("Diesel", 500);
		System.out.println(" ");
		
		Gestor2.NuevoPrecio("Gas LP", 400);
		System.out.println(" ");
		
		Gestor2.NuevoPrecio("Deuterio", 5000);
		System.out.println(" ");
		
		 **/
	}
	
}
/*********************************************************
 * TAREA:
 * - Crear HashMap de Observadores
 *********************************************************/