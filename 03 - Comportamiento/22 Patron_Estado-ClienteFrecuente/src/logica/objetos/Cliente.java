package logica.objetos;

import logica.estado.contexto.Contexto;

public class Cliente extends Contexto  {
	private int _Puntos;
	private String _Nombre;
	
	public Cliente(String pNombre) {
	    _Puntos = 0;
	    this._Nombre = pNombre;
	}
	
	public Cliente(String pNombre, int pPts) {
	    _Puntos = pPts;
	    this._Nombre = pNombre;
	}
	
    public void agregarPuntos(int puntos) {
        this._Puntos += puntos;
        super.verificarEstado(this);
    }
    
    public int getPuntos() {
    	return this._Puntos;
    }
    
    public String getNombre() {
    	return this._Nombre;
    }

	public String getInfo() {
		super.verificarEstado(this);
		return "El cliente " + this.getNombre() + " tiene "+this.getPuntos()+". Su estado es: " + super.getInfo();
	}
}
