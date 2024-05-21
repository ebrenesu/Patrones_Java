package principal;

import compositor.otros.Auxiliar_Composite;

public class Gestor_composite {
	private Auxiliar_Composite _Composite;
	
	public Gestor_composite() {
		_Composite = new Auxiliar_Composite();
	}
	
	public String obtenerTipoObjetos() {
		return _Composite.infoTipoObjetos();
	}
	
	public void nuevaEmpresa(String pNombre) {
		_Composite.nuevoComponente(1, pNombre);
	}
	
	public void nuevoEquipo(String pNombre) {
		_Composite.nuevoComponente(2, pNombre);
	}
	
	public void nuevoEmpleado(String pNombre, int pSalario) {
		 _Composite.nuevoComponente(3, pNombre, pSalario);
	} 
	
	public void agregarEquipoEmpresa(String pEquipo, String pEmpresa) {
		_Composite.agregarHoja(2, pEquipo, pEmpresa);
	}
	
	public void agregarEmpleadoEquipo(String pEmpleado, String pEquipo) {
		_Composite.agregarHoja(3, pEmpleado, pEquipo);
	}
	
	public String mostrarInfoEmpresa(String pEmpresa) {
		return _Composite.obtenerDescripcion(1, pEmpresa);
	}
	
	public String mostrarSalarioEmpresa(String pEmpresa) {
		return "El salario total es de $"+_Composite.obtenerSalario(1, pEmpresa);
	}
	
	public String mostrarInfoEquipo(String pEquipo) {
		return _Composite.obtenerDescripcion(2, pEquipo);
	}
	
	public String mostrarInfoEmpleado(String pEmpleado) {
		return _Composite.obtenerDescripcion(3, pEmpleado);
	}
	
	public String mostrarEmpresas() {
		String Mensaje = "";
		for (String item : _Composite.obtenerLista(1)) 
			Mensaje += item + "\n";
		
		return Mensaje;
	}
	
	public String mostrarEquipos() {
		String Mensaje = "";
		for (String item : _Composite.obtenerLista(2)) 
			Mensaje += item + "\n";
		
		return Mensaje;
	}
	
	public String mostrarEmpleados() {
		String Mensaje = "";
		for (String item : _Composite.obtenerLista(3)) 
			Mensaje += item + "\n";
		
		return Mensaje;
	}
	
}
