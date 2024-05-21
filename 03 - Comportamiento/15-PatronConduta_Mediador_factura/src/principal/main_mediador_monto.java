package principal;

public class main_mediador_monto {
	static gestor_mediador_monto gestor;
	
	public static void main(String[] args) {
		gestor = new gestor_mediador_monto();
		int iOpc = -1;
		int valor_salida = 0;
		do {
			menuPrincipal();
			iOpc = gestor.obtener_entero();
			
			switch (iOpc) {
				case 1:
					nuevoProducto();
					break;
					
				case 2:
					interaccionProducto();
					break;
			}
		}while(iOpc != valor_salida);
	}
	

	
	private static void menuPrincipal() {
		gestor.print("---------------------");
		gestor.print("1. Crear un producto.");
		gestor.print("2. Acciones sobre el producto.");
		gestor.print("\n0. Salir.");
		gestor.print("---------------------");
	}
	
	private static void menuAccion() {
		gestor.print("\n\n---------------------");
		gestor.print("1. Obtener Descuento.");
		gestor.print("2. Obtener Impuesto.");
		gestor.print("3. Obtener Valor Total.");
		gestor.print("4. Mostrar información del producto");
		gestor.print("\n0. Salir.");
		gestor.print("---------------------\n");
	}
	
	private static int cambiarProducto() {
		gestor.print("\n\nQuiere cambiar de producto?");
		gestor.print("1. Si.");
		gestor.print("Cualquier otro valor. No.");
		return IO.leer_numero();
	}
	
	private static void interaccionProducto() {
		int iOpc = -1;
		int idPrd = -1;
		int valor_salida = 0;
		int contSal = 0;
		do {
			if(idPrd < 0 || cambiarProducto() == 1)
				idPrd = buscar_producto();
			
			switch (idPrd) {
				case -1:
					gestor.print("Producto no encontrado");
					contSal++;
					if(contSal == 3)
						iOpc = valor_salida;
					break;
				case -2:
					iOpc = valor_salida;
					break;
				default:
					menuAccion();
					iOpc = gestor.obtener_entero();
					
					switch (iOpc) {
						case 1:
							gestor.print(gestor.accion_en_producto(idPrd, 0));
							break;
						case 2:
							gestor.print(gestor.accion_en_producto(idPrd, 1));
							break;
						case 3:
							gestor.print(gestor.accion_en_producto(idPrd, 2));
							break;
						case 4:
							gestor.imprimir_productos();
							break;
					}
					
					break;
			}
			
			
		}while(iOpc != valor_salida);
	}
	
	private static void ejecutar_Accion_Mediador(int pIdx, int pPrd) {
		String mAccion;
		switch (pIdx) {
			case 0:
				mAccion="Descuento";
			break;
			case 1:
				mAccion="Impuesto";
			break;
			case 2:
				mAccion="Total";
			break;
		}
	}
	
	private static boolean nuevoProducto() {
		boolean bAgregado = false;
		String pNom, pCat;
		int pPrec;
		try {
			gestor.print("\n\n---------------------");
			gestor.print("Nuevo Producto. ");
			gestor.print("\n\n---------------------");
			gestor.print("[1] Nombre *unico*");
			pNom = gestor.obtener_text();
			gestor.print("[2] Categoria a la que pertenece");
			pCat = gestor.obtener_text();
			gestor.print("[3] Precio");
			pPrec = gestor.obtener_entero();
			gestor.print("---------------------\n");
			gestor.crear_Producto(pNom, pCat, pPrec);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	private static int buscar_producto() {
		if(gestor.cantidad_productos() > 0) {
			gestor.print("\nNombre de un producto existente: ");
			return gestor.obtener_id(gestor.obtener_text().toLowerCase());
		}else {
			gestor.print("Todavia no hay productos.");
			return -2;
		}
	}

}
