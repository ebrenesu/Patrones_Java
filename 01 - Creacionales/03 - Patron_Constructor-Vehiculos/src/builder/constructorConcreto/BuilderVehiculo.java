package builder.constructorConcreto;
import builder.constructorAbstracto.ABuilderCarro;
import builder.productoAbstracto.AParte;
import builder.productoConcreto.Vehiculo;

public class BuilderVehiculo extends ABuilderCarro{

	@Override
	public Vehiculo ObtenerVehiculo() {
		return this.get_CarroActual();
	}

	@Override
	public String CrearVehiculo(AParte pMotor, AParte pCarroceria, AParte pElevaluna){
		this.set_CarroActual(new Vehiculo("CENFO-PLACA"));
		this.CambiarPieza(pMotor,"Motor");
		this.CambiarPieza(pCarroceria,"Carroceria");
		this.CambiarPieza(pElevaluna,"Elevaluna");
		
		return this._CarroActual.Obtener_Info()+"\n\nFue creado";
	}

	@Override
	public void CambiarPieza(AParte pPieza, String pTipoPieza) {
		switch (pTipoPieza) {
			case "Carroceria": 
				this.get_CarroActual().set_Carroceria(pPieza);
			break;
			
			case "Motor": 
				this.get_CarroActual().set_Motor(pPieza);
			break;
			
			case "Elevaluna": 
				this.get_CarroActual().set_Elevalunas(pPieza); 
			break;
		
		}
	}

}
