package main;


public class Principal_Compositor {
	private static Gestor_composite gestor;
	
	public static void main(String[] args) {
		gestor = new Gestor_composite();
		
		imprimir("\nCreando tres personas");
		imprimir("=======================");
		nuevoEmpleado(1, 1000, "Mariela");
		nuevoEmpleado(2, 100, "Fulanito");
		nuevoEmpleado(3, 999, "Flavio");
		
		imprimir("\nCreando equipo");
		imprimir("=======================");
		gestor.nuevo_Equipo();
		gestor.nuevo_Equipo();
		gestor.nuevo_Equipo();
		
		imprimir("\nAgregando personas al equipo");
		imprimir("=======================");

		gestor.nuevo_Empleado_Equipo(3, 0);
		gestor.nuevo_Empleado_Equipo(3, 1);

		gestor.nuevo_Empleado_Equipo(4, 2);
		gestor.nuevo_Empleado_Equipo(4, 0);

		
		imprimir("\n\nImprimimos como locos\n");

		for (int i=0; i < gestor.getComponentes().size(); i++) {
			imprimir(""+(i+1));
	        imprimir(gestor.getDataComponente(gestor.getcomponente(i)));
	        imprimir("=======================");
		} 

	}
	
	private static void imprimir(String pData) {
		System.out.println(pData);
	}
	
	private static void nuevoEmpleado(int pI, int pSalario, String pNombre) {
		imprimir("Creando la persona "+pI);
		gestor.nuevo_Empleado(pNombre, pSalario); 
	}
}