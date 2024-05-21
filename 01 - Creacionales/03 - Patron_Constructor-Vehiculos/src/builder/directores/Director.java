package builder.directores;

import java.util.List;

import builder.constructorAbstracto.*;
import builder.constructorConcreto.*;
import builder.productoConcreto.*;
import utiles.GeneradorSeries;
import utiles.TipoPartes;
import utiles.TipoVehiculo;

public class Director {
	
	private Vehiculo _CarroActual;					//Objeto que vamos a construir
	private ABuilderCarro _ConstructorVehiculo;		//Constructor de Carros
	private TipoPartes _TipoParte;
	private TipoVehiculo _TipoVehiculo;

	private void set_CarroActual(Vehiculo pCarroActual) {this._CarroActual = pCarroActual;}
	private void set_ConstructorParte(IBuilderParte pConstructorParte) {}	
	public void set_TipoParte(TipoPartes pTipoParte) {this._TipoParte = pTipoParte;}
	public void set_TipoVehiculo(TipoVehiculo pTipoVehiculo) {this._TipoVehiculo = pTipoVehiculo;}
	
	private ABuilderCarro get_ConstructorVehiculo() {return _ConstructorVehiculo;}
	public Vehiculo get_CarroActual() {return _CarroActual;}
	public TipoPartes get_TipoParte() {return this._TipoParte;}
	public TipoVehiculo get_TipoVehiculo() {return this._TipoVehiculo;}
	
	public Director() {
		this._ConstructorVehiculo = new BuilderVehiculo();
	}
	
	private IBuilderParte Seleccionar_ConstructorParte(int pIdx) {
		IBuilderParte lConstructorParte;
		switch (pIdx) {
			default:
				lConstructorParte = (new BuilderCarroceria());
			break;
			case 1:
				lConstructorParte = (new BuilderMotor());
			break;
			case 2:
				lConstructorParte =(new BuilderElevaluna());
			break;
		}
		
		this.set_ConstructorParte(lConstructorParte);
		return lConstructorParte;
		
	}
	
	public String CrearVehiculo (int pTipoVehiculo, String pColor) {
		SeleccionarTipoVehiculo (pTipoVehiculo);
	
		BuilderCarroceria bc = (BuilderCarroceria) Seleccionar_ConstructorParte(0);
		bc.CrearProducto(GeneradorSeries.generarNumeroSerieCarroceria(),pColor);
		
		BuilderMotor bm = (BuilderMotor) Seleccionar_ConstructorParte(1);
		bm.CrearProducto(this.get_TipoVehiculo().get_MotorCC(),GeneradorSeries.generarNumeroSerieMotor());
		
		BuilderElevaluna be = (BuilderElevaluna) Seleccionar_ConstructorParte(2);
		be.CrearProducto(this.get_TipoVehiculo().get_ElevalunaEsElectrico(),this.get_TipoVehiculo().get_EstadoActualElevaluna(),GeneradorSeries.generarNumeroSerieElevaluna());
		
		String mensaje = this.get_ConstructorVehiculo().CrearVehiculo(bm.ObtenerProducto(), bc.ObtenerProducto(), be.ObtenerProducto());	
		this.set_CarroActual(this.get_ConstructorVehiculo().get_CarroActual());
		
		return mensaje;
	}

	public String ModificarVehiculoParte (TipoPartes pTipo, List<Object> pDataParte) {		
		
		return "";
	}
	public String ListarPartesCrear() {
		return  "1." + TipoPartes.CARROCERIA.get_Nombre() + ".\n" + 
				"2." + TipoPartes.ELEVALUNA.get_Nombre() + ".\n" +
				"3." + TipoPartes.MOTOR.get_Nombre() + ".\n" ;	
	}
	public String ListarTipoVehiculosCrear() {
		return  "1." + TipoVehiculo.BASE.get_TipoVehiculo()+ ".\n" + 
				"2." + TipoVehiculo.MEDIO.get_TipoVehiculo() + ".\n" +
				"3." + TipoVehiculo.ALTO.get_TipoVehiculo() + ".\n" ;	
	}
	
	private void SeleccionarTipoVehiculo(int pTipoVehiculo) {
		switch (pTipoVehiculo){
			default:
				this.set_TipoVehiculo(TipoVehiculo.BASE);
			break;
			case 2:
				this.set_TipoVehiculo(TipoVehiculo.MEDIO);
			break;
			case 3:
				this.set_TipoVehiculo(TipoVehiculo.ALTO);
			break;
		}
	}

}
