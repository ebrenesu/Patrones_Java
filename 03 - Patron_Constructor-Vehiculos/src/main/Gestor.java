package main;

import java.util.ArrayList;
import java.util.List;

import builder.directores.Director;
import builder.productoConcreto.Vehiculo;
import utiles.*;


public class Gestor {
	private static ArrayList <Vehiculo> arrVehiculos; 
	private Director _Director;

	public Director get_Director() {return this._Director;}
	private void set_Director(Director objDirector) {this._Director = objDirector;}
	

	public Gestor() {
		arrVehiculos = new ArrayList<Vehiculo>();
		this.set_Director(new Director());
		this.get_Director().set_TipoParte(TipoPartes.CARROCERIA);
		this.get_Director().set_TipoVehiculo(TipoVehiculo.BASE);
	}
	
	/************************************************************
	 * Metodo:			AgregarVehiculoArreglo
	 * 
	 * Descripcion:	Recibe un nuevo objeto y lo guarda en el array.
	 * 
	 * Parametros:	pObj [Carro]
	 * 
	 * @return:		Void
	 *************************************************************/
	private static void AgregarVehiculoArreglo(Vehiculo pObj) {
		arrVehiculos.add(pObj);
	}
	
	
	/************************************************************
	 * Metodo:		ObtenerDatosVehiculo
	 * 
	 * Descripción:	Obtiene los datos de los triangulos y los 
	 * 				devuelve en una variable.
	 * 
	 * Parametros:  pPlaca  [String] identificador del vehiculo
	 * 
	 * @return:		mResult [String] 
	 *************************************************************/
	public String ObtenerDatosVehiculo(String pPlaca) {
	    String mResult = "";
	    for (Vehiculo vehiculo : arrVehiculos) {
	    	if (pPlaca != "") { 
	    		if (vehiculo.get_Placa().equals(pPlaca)) {
	                mResult += vehiculo.Obtener_Info()+ "\n\n";
	                break; 
	            }
	    	}else
				mResult += vehiculo.Obtener_Info()+ "\n\n";
	    }
	    return mResult;
	}
	

	public String ObtenerListaVehiculosCrear() {
		return this.get_Director().ListarTipoVehiculosCrear();
	}
	
	public String ObtenerListaPartesCrear() {
		return this.get_Director().ListarPartesCrear();
	}
	
	public String CrearVehiculo(int pTipoVehiculo, String pColor) {
		String mens = this.get_Director().CrearVehiculo(pTipoVehiculo, pColor);
		AgregarVehiculoArreglo(this.get_Director().get_CarroActual());
		return mens;
	}
	
	public void CrearParte(int pTipoParte, List<Object> pDatosParte) {}
	public void SeleccionarVehiculo() {}
	public void CambiarParteVehiculo() {}




}
