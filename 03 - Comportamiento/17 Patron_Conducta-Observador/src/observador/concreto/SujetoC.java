package observador.concreto;

import java.util.ArrayList;
import java.util.List;

import observador.Interfaces.*;

public class SujetoC implements Sujeto{
	private String Nombre_Producto;
	private List<Observador> observers = new ArrayList<Observador>();
	private Integer value;
	
	public SujetoC(String pNombre_Producto){	
		setNombre_Producto(pNombre_Producto);
	}
		
	public void setState(Integer value) {
		this.value = value;
		notifyObservers();
	}

	public String getNombre_Producto() {
		return Nombre_Producto;
	}

	public void setNombre_Producto(String nombre_Producto) {
		Nombre_Producto = nombre_Producto;
	}
	
	

	@Override
	public void addObserver(Observador o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observador o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observador o : observers){
			o.update(this.value, getNombre_Producto());
		}
	}
}