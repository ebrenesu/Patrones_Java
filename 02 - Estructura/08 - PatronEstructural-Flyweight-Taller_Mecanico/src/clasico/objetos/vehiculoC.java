package clasico.objetos;

import java.util.Date;

public class vehiculoC {
	public String Marca;
	public String Modelo;
    public String Color;
    public String Placa;
    public Date FechaMatriculacion;
    public String Cedula;
    
    public vehiculoC(String marca, String modelo, String color, 
    				 String placa, Date fechaMatriculacion, String cedula) {
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Placa = placa;
		FechaMatriculacion = fechaMatriculacion;
		Cedula = cedula;
	}
    
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public Date getFechaMatriculacion() {
		return FechaMatriculacion;
	}
	public void setFechaMatriculacion(Date fechaMatriculacion) {
		FechaMatriculacion = fechaMatriculacion;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String MostrarCaracteristicas(){
        return    " Marca:" + getMarca() + " \n"
        		+ " Modelo:" + getModelo() + " \n"
        		+ " Color:" + getColor() + " \n"
				+ " Placa:" + getPlaca() + " \n"
				+ " Cédula:" + getCedula() + " \n"
        	 	+ " Fecha de inscripción:" + getFechaMatriculacion() + " \n";
    }
}
