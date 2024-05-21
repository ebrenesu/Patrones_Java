package principal;

public class principal {
	
	private static Gestor g;
	
	public static void main(String[] args) {
		try {
			g = new Gestor();
			imprimir( g.imprimirDesdeDondeEstoyEnAdelante(), "Imprimimos la lista inicial" );
            imprimir( g.primero(), "Mostrar el elemento #1" );
            imprimir( g.avanzar(2), "Mover dos posiciones adelante" );
            imprimir( g.imprimirDesdeDondeEstoyEnAdelante(), "Imprimimos toda la lista" ); 
            imprimir( g.avanzar(3), "Mover tres  posiciones adelante" );
            imprimir( g.primero(), "Mover al inicio" );
            imprimir( g.imprimirDesdeDondeEstoyEnAdelante(), "Imprimimos toda la lista" ); 
            
            
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
	private static void imprimir(Object pObj, String pMsg) {
		System.out.println( pMsg );
		System.out.println( pObj +"\n");
	}

}

// Tarea:
// 1 Agregar Cangrejo
// 2 arreglar imprimir de donde estoy. 