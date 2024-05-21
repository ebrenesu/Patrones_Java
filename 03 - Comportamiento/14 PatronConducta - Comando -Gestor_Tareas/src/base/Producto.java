package base;

public class Producto {
	private int _Id;
	private String _Nombre;
	private double _Precio;
	private String _Tipo;
	
	public Producto(int pId, String pNombre, int pPrecio,String pTipo) {
		set_Id(pId);
		set_Nombre(pNombre);
		set_Precio(pPrecio);
		set_Tipo(pTipo);
	}

	public void set_Id(int _Id) {
		this._Id = _Id;
	}
	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}
	public void set_Precio(double _Precio) {
		this._Precio = _Precio;
	}
	public void set_Tipo(String _Tipo) {
		this._Tipo = _Tipo;
	}

	public int get_Id() {
		return _Id;
	}
	public String get_Nombre() {
		return _Nombre;
	}
	public double get_Precio() {
		return _Precio;
	}
	public String get_Tipo() {
		return _Tipo;
	}

}
