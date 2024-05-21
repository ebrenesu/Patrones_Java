package Proxy.Main;

import Proxy.Implementacion.*;
import Proxy.Interface.IDocumento;

public class Gestor_Proxy {
	private String _Usuario, _Clave;
	private IDocumento _ProxyDocument;
	private int _TipoProxy;
	
	Gestor_Proxy(){
		set_TipoProxy(0);
	}
	
	public String accederDocumento(int pPage) {
		String mensaje = _ProxyDocument.acceder(this._Usuario,this._Clave);
		mensaje += "\n"+ _ProxyDocument.cargarPagina(pPage);
		return mensaje;
	}
	
	public void iniciarUsuario(String pUsuario, String pPass, int pTipo) {
		this._Usuario = pUsuario;
		this._Clave = pPass;
		this.set_TipoProxy(pTipo);
		CambiarProxy();
	}
	
	public void limpiarUsuario() {
		this._Usuario = "";
		this._Clave = "";
		this.set_TipoProxy(0);
	}

	
	private void CambiarProxy() {		
		switch (this.get_TipoProxy()){
			case 1:
			default:
				_ProxyDocument = new DocumentoProxyProfesor();
				break;
			
			case 2:
				_ProxyDocument = new DocumentoProxyAlumno();
				break;
		}
	}
	
	/**
	 * @return the _TipoProxy
	 */
	private int get_TipoProxy() {
		return _TipoProxy;
	}

	/**
	 * @param _TipoProxy the _TipoProxy to set
	 */
	public void set_TipoProxy(int _TipoProxy) {
		this._TipoProxy = _TipoProxy;
	}
}
