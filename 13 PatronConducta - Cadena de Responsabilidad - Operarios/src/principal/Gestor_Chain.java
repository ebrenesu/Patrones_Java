package principal;

import java.util.ArrayList;
import java.util.List;

import chain.abstracto.ManejadorOperaciones;
import chain.concreto.Gerente;
import chain.concreto.Operario;
import chain.concreto.Supervisor;

public class Gestor_Chain {
	private List<Mensaje> _Mensajes;
	private ManejadorOperaciones _CadenaColaboradores;

	public Gestor_Chain(){
		_Mensajes = new ArrayList<Mensaje> ();
	}
	
	private ManejadorOperaciones configurarCadena() {
		ManejadorOperaciones LocalOperario = new Operario();
	    ManejadorOperaciones LocalSupervisor = new Supervisor();
	    ManejadorOperaciones LocalGerente = new Gerente();
    	
	    LocalGerente.setColaborador(LocalSupervisor);
    	LocalSupervisor.setColaborador(LocalOperario);
    	
    	return LocalGerente;
	}
	
	
	public void IniciarProceso() {
		_CadenaColaboradores = configurarCadena();
	}
	
	public void Ejecutar_Mensaje() {
		for(Mensaje mensaje : _Mensajes)
        	_CadenaColaboradores.ejecutarOrden(mensaje);
	    
	}
	
	public void AgregarMensaje(String pPara, String pMensaje) {
		_Mensajes.add(new Mensaje(pPara, pMensaje));		
	}
}
