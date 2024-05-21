package main;

import java.util.ArrayList;

import compositor.base.IEmpresa;
import compositor.componentes.*;

public class Gestor_composite {
	private ArrayList<IEmpresa> componentes;
	
	public Gestor_composite() {
		setComponentes(new ArrayList<IEmpresa>());
	}
	
	public String getDataComponente(IEmpresa pIE) {
		if (pIE.getNombre() != null)
			return (pIE.getNombre() + " con un salario de: " + pIE.getSalario());
		else
			return ("El equipo tiene un salario total de: " + pIE.getSalario());
	} 
	
	public void nuevo_Empleado(String pNombre, int pSalario) {
		getComponentes().add(new Empleado(pSalario, pNombre));
	} 
	
	public void nuevo_Equipo() {
		getComponentes().add(new Equipo());
	}

	public void nuevo_Empleado_Equipo(int idEquipo, int idEmpleado) {
		getcomponente(idEquipo).agregarComponente(getcomponente(idEmpleado));
	}

	public IEmpresa getcomponente(int pId) {
		return getComponentes().get(pId);
	}
	
	public ArrayList<IEmpresa> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<IEmpresa> componentes) {
		this.componentes = componentes;
	}
}
