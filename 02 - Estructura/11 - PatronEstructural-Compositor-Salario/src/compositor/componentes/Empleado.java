package compositor.componentes;

import compositor.base.IEmpresa;

public class Empleado extends IEmpresa{
	private int salario;
	private String nombre; 
	
	public Empleado (int pSalario, String pNombre) {
		setSalario(pSalario);
		setNombre(pNombre);
	}
	
	@Override
	public int getSalario() {
		return this.salario;
	}

	public void setSalario(int pSalario) {
		this.salario = pSalario;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void agregarComponente(IEmpresa composicion) {
		System.out.println("esta es una excepcion, funcion no implementada en Empleado ya que es una hoja.");		
	}
}