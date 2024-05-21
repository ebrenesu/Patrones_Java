package compositor.componentes;

import java.util.ArrayList;
import compositor.base.iComponente;

public class Equipo extends iComponente{
	private ArrayList<iComponente> _Empleados; //Contiene empleados
	
	public Equipo(String pNombre) {
		this.setTipoNodo( iComponente.EQUIPO);
		this.setNombre(pNombre);
		this._Empleados = new ArrayList<iComponente>();
	}
	
	
	
	@Override
	public int getSalario() {
		int total=0;
        for (iComponente nodo : _Empleados)
        	total += nodo.getSalario();
       
		return total;
	}
	
	@Override
	public void agregarComponente(iComponente composicion) {
		this._Empleados.add(composicion);
	}

	@Override
	public String mostrarDatos() {
		String mLin1="" , mLine2 = "";
		mLin1 = "Listando Equipo \"" + this.getNombre() + "\""+". [Total $" + getSalario() +"] \n" ;
        for (iComponente nodo : _Empleados)
        	mLine2 += nodo.mostrarDatos();
       
		return mLin1 + mLine2 +"\n";
	}
}