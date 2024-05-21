package patron.objetos.extrinseco;

import java.util.Date;

import patron.objetos.VehiculoFactory;
import patron.objetos.intrinseco.MarcaModelo;

public class vehiculo {
	// Datos INTRINSICOS  encapsulados en la clase objetos.MarcaModelo
    private MarcaModelo _DatosIntrinsecos;
	
    //Datos EXTRINSECA
    private String Placa;
    private Date FechaMatriculacion;
    private String Cedula;
    
    public vehiculo(String pMarca, String pModelo, String pColor, 
    				String pPlaca, Date pFechaMatriculacion, String pCedula) {

    	_DatosIntrinsecos = VehiculoFactory.obtenerCarro(pMarca, pModelo, pColor);
    	setDatosExtrinsecos(pPlaca, pFechaMatriculacion, pCedula);
    	
	}
	
    public String MostrarCaracteristicas(){
        return  _DatosIntrinsecos.MostrarCaracteristicas(getVehiculoKey());
    }
	
	public String getVehiculoKey() {
		return   _DatosIntrinsecos.Marca + "-"
				+ _DatosIntrinsecos.Modelo + "-"
				+ _DatosIntrinsecos.Color;
	}

/* ********************************************************************** *	
 * Sección de funciones publicas del área EXTRINSECA. Estas funciones 
 * ayudan para mostrar los datos EXTRINSESCOS del objeto, osea los que 
 * no deberian de variar. Por eso solo muestran datos.
 * ********************************************************************** */
	public String getPlaca() {
		return Placa;
	}
	public String getCedula() {
		return Cedula;
	}
	public Date getFechaMatriculacion() {
		return FechaMatriculacion;
	}
	public String getDatosVehiculo() {
		return  "EXTRINSECOS:\n"
				+ " Placa:" + getPlaca() + " \n"
				+ " Cedula:" + getCedula() + " \n"
	       	 	+ " Fecha de inscripcion:" + getFechaMatriculacion() + " \n"
	       	 	+ "--\n"
	       	 	+ "INTRINSECOS\n"
	       	 	+ MostrarCaracteristicas()+"\n";
	}

/* ********************************************************************** *	
 * Sección de funciones privadas. Sirven para modificar datos. 
 * Estos datos no deberían variar con el tiempo (son comunes a todas las 
 * instancias). Estas funciones son para manejar los datos EXTRINSECOS
 * ********************************************************************** */
	private void setDatosExtrinsecos(String pPlaca, Date pFechaMatriculacion, String pCedula) {
		setPlaca(pPlaca);
		setFechaMatriculacion(pFechaMatriculacion);
		setCedula(pCedula);
	}
	private void setPlaca(String placa) {
		Placa = placa;
	}
	private void setFechaMatriculacion(Date fechaMatriculacion) {
		FechaMatriculacion = fechaMatriculacion;
	}
	private void setCedula(String cedula) {
		Cedula = cedula;
	}
}
