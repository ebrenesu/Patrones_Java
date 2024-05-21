package fabrica_Concreta;

import fabrica_Abstracta.VehiculoDeTransporte;
import producto_Abstracto.Vehiculo;
import producto_Concreto.Microbus;

public class Fabrica_Microbus implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Microbus miVehiculo =  new Microbus();
		miVehiculo.setCodigo(miVehiculo.generarCodigoVehiculo());
		
		return miVehiculo;
	}

}