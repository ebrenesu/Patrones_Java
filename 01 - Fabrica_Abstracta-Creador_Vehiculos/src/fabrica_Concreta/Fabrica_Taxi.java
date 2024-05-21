package fabrica_Concreta;

import fabrica_Abstracta.VehiculoDeTransporte;
import producto_Abstracto.Vehiculo;
import producto_Concreto.Taxi;

public class Fabrica_Taxi implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Taxi miTaxi =  new Taxi();
		miTaxi.setCodigo(miTaxi.generarCodigoVehiculo());
		
		return miTaxi;
	}

}
