package principal;

public class Principal_Arbol_Salario_Composite {
	private static Gestor_composite gestor;
	
	public static void main(String[] args) {
		String EmpresaNombre = "CENFOMPANY S.A.";
		gestor = new Gestor_composite();
		
		imprimir("-> Paso 1: Creando empresas");
		crearEmpresa(EmpresaNombre);
		imprimir("=======================");
		imprimir(gestor.mostrarEmpresas());
		
		imprimir("-> Paso 2: Creando Equipos");
		crearEquipo("Desarrollo");
		crearEquipo("Calidad");
		crearEquipo("Base de Datos");
		imprimir("=======================");
		imprimir(gestor.mostrarEquipos());
		
		imprimir("-> Paso 3: Creando Empleados");
		crearEmpleado("Maria",800);
		crearEmpleado("Diego",800);
		crearEmpleado("Katherine",800);
		crearEmpleado("Roberto",1500);
		crearEmpleado("Alex",1750);
		crearEmpleado("Sara",1800);
		crearEmpleado("Yensy",1800);
		imprimir("=======================");
		imprimir(gestor.mostrarEmpleados());
		
		imprimir("-> Paso 4: Asignar Empleado a Equipo");
		imprimir("=======================");
		empleadoEquipo("Yensy", "Base de Datos");
		empleadoEquipo("Yensy", "Desarrollo");
		empleadoEquipo("Maria", "Calidad");
		empleadoEquipo("Diego", "Calidad");
		empleadoEquipo("Katherine", "Calidad");
		empleadoEquipo("Alex", "Desarrollo");
		empleadoEquipo("Sara", "Desarrollo");
		empleadoEquipo("Katherine", "Desarrollo");
		
		imprimir("\n-> Paso 5: Asignar Equipo a Empresa");
		imprimir("=======================");
		equipoEmpresa("Desarrollo", EmpresaNombre);
		equipoEmpresa("Calidad", EmpresaNombre);
		equipoEmpresa("Base de Datos", EmpresaNombre);
		
		
		imprimir("\n-> Paso 6: Obtener Salarios");
		imprimir("=======================");
		imprimir(gestor.mostrarInfoEmpresa(EmpresaNombre));
		imprimir(gestor.mostrarSalarioEmpresa(EmpresaNombre));
		
	}
	
	private static void imprimir(String pData) {
		System.out.println(pData);
	}
	
	private static void crearEmpresa(String pNombre) {
		gestor.nuevaEmpresa(pNombre);
	}
	
	private static void crearEquipo(String pNombre) {
		gestor.nuevoEquipo(pNombre);
	}
	
	private static void crearEmpleado(String pNombre,int pSalario) {
		gestor.nuevoEmpleado(pNombre, pSalario); 
	}
	
	private static void empleadoEquipo(String pEmpleado, String pEquipo) {
		imprimir(pEmpleado + " va para el equipo "+pEquipo);
		gestor.agregarEmpleadoEquipo(pEmpleado, pEquipo);	
	}
	
	private static void equipoEmpresa(String pEquipo, String pEmpresa) {
		imprimir(pEquipo + " va para la empresa "+pEmpresa);
		gestor.agregarEquipoEmpresa(pEquipo, pEmpresa);	
	}

}

/***************************************************************************************
 * TAREA:
 * - Hacerlo interactivo donde pueda agregar componentes: Empresa / Equipo / Empleado
 ***************************************************************************************/
