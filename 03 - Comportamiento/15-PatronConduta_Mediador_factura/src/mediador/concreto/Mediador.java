package mediador.concreto;

import java.util.ArrayList;

import colega.interfaz.iOperaciones;
import mediador.interfaz.iMediador;
import objetos.Producto;

public class Mediador implements iMediador {
	private  ArrayList<iOperaciones> list_colegas_mediados = new ArrayList<iOperaciones>();

	@Override
	public double ejecutar_accion(String pType, Producto pProd) {
		iOperaciones temp = null;
		
		for( iOperaciones colega : list_colegas_mediados )
            if( colega.getTipo_Operacion().equals(pType)) {
            	temp = colega;
                break;
            }
	
		return temp.ejecutarAccion(pProd);
	}

	@Override
	public void agregar_colega(iOperaciones oColega) {
		list_colegas_mediados.add(oColega);
	}

}
