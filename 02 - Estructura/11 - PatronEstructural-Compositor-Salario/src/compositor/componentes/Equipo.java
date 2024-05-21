package compositor.componentes;

import java.util.ArrayList;
import compositor.base.IEmpresa;

public class Equipo extends IEmpresa{
	private int salario=0;
	private ArrayList<IEmpresa> listaComposicion; //Contiene empleados
	
	public Equipo() {
		this.listaComposicion = new ArrayList<IEmpresa>();
	}
	
	@Override
	public int getSalario() {
		return this.salario;
	}
	
	@Override
	public String getNombre() {
		System.out.println("Esta es una excepcion, funcion implementada en Empleado");
		return null;
	}
	
	@Override
	public void agregarComponente(IEmpresa composicion) {
		setSalario(composicion.getSalario()); 
		this.listaComposicion.add(composicion);
	}
	
	private void setSalario(int pSalario) {
		this.salario += pSalario;
	}
}