package producto_Concreto;

import producto_Abstracto.Vehiculo;

public class Microbus implements Vehiculo {
	private int codigo;
	private static final String tipo = "Microbus";

/********************** Seccion para hacer SET ******************************/
	
	public void setCodigo(int codigo) {
		this.codigo = 300000 + codigo;
	}

/********************** Seccion para hacer GET ******************************/
	
	public int getCodigo() {
		return codigo;
	}

	public  String getTipo() {
		return tipo;
	}

/********** Seccion para implementar funciones de la interface ***************/
	
	@Override
	public String codigoDelVehiculo() {
		return "El codigo es: " + getCodigo();
	}

	@Override
	public int generarCodigoVehiculo() {
		return (int) (Math.random() * 9999);
	}

	@Override
	public String obtener_info_vehiculo() {
		return "El vehiulo de tipo: " + getTipo() + ", se le asigno el codigo: " + getCodigo() +" soy pequeño pero funcional";
	}

}
