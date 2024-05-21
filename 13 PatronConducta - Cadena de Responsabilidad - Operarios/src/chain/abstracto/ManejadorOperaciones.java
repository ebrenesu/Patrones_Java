package chain.abstracto;

import principal.Mensaje;

public abstract class ManejadorOperaciones {
	protected int numeroSuerte;
	
	protected ManejadorOperaciones _colaborador;
		
	public void setColaborador(ManejadorOperaciones pColaborador){
		 this._colaborador = pColaborador;
	}
	
	public void noEncontrado(Mensaje mensaje) {
		System.out.println(mensaje.getPara() +" no puede hacer la accion, ya que no esta en la cadena ");        	
	}
	
	public abstract void ejecutarOrden(Mensaje mensaje);

}
