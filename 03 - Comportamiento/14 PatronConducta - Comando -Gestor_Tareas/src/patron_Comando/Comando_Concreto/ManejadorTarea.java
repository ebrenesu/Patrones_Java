package patron_Comando.Comando_Concreto;

import java.util.ArrayList;

import base.Producto;
import patron_Comando.Comando_Abstracto.TareaProducto;

public class ManejadorTarea implements TareaProducto{
	private ArrayList<TareaProducto> _Tarea;

	public ManejadorTarea(){
		_Tarea = new ArrayList<TareaProducto>();
	}

	public void addTarea(TareaProducto tarea) {
		_Tarea.add(tarea);
	}

	@Override
	public void ejecutar(Producto producto) {
		_Tarea.forEach((t)->t.ejecutar(producto));
	}
}
