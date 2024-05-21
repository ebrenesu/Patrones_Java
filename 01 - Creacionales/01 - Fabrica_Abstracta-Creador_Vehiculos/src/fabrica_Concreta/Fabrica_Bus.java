package fabrica_Concreta;

import fabrica_Abstracta.VehiculoDeTransporte;
import producto_Abstracto.Vehiculo;
import producto_Concreto.Bus;

//Fabrica Concreta

public class Fabrica_Bus implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Vehiculo miVehiculo =  new Bus();
		((Bus) miVehiculo).setCodigo(miVehiculo.generarCodigoVehiculo());
		
		return miVehiculo;
	}

}