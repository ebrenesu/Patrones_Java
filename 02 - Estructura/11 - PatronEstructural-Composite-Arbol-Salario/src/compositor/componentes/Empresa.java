package compositor.componentes;

import java.util.ArrayList;

import compositor.base.iComponente;

public class Empresa  extends iComponente{
	private ArrayList<iComponente> _Equipos;
	
	public Empresa (String pNombre) {
		this.setTipoNodo( iComponente.EQUIPO);
		this.setNombre(pNombre);
		this._Equipos = new ArrayList<iComponente>();
	}
	
	@Override
	public int getSalario() {
		int total=0;
        for (iComponente nodo : _Equipos)
        	total += nodo.getSalario();
       
		return total;
	}

	@Override
	public String mostrarDatos() {
		String mData="";
		mData = "La empresa [" + this.getNombre() + "] tiene los siguientes equipos:\n" ;
        for (iComponente nodo : _Equipos)
        	mData += nodo.mostrarDatos();
       
		return mData;
	}

	@Override
	public void agregarComponente(iComponente composicion) {
		_Equipos.add(composicion);
	}
}
