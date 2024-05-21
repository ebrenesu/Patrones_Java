package compositor.componentes;

import compositor.base.iComponente;

public class Empleado extends iComponente{
	private int salario;
	
	public Empleado (int pSalario, String pNombre) {
		setSalario(pSalario);
		setNombre(pNombre);
	}
	
	public void setSalario(int pSalario) {
		this.salario = pSalario;
	}
	
	@Override
	public int getSalario() {
		return this.salario;
	}

	@Override
	public void agregarComponente(iComponente composicion) {
		System.out.println("esta es una excepcion, funcion no implementada en Empleado");		
	}

	@Override
	public String mostrarDatos() {
		return this.nombre +" con un salario de $" + this.getSalario() +"\n";
	}
}