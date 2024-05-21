package patron.objetos.intrinseco;

public abstract class MarcaModelo {
	public String Marca;
	public String Modelo;
    public String Color;
            
	public MarcaModelo(String marca, String modelo, String color) {
		Marca = marca;
		Modelo = modelo;
		Color = color;
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
    
	public String MostrarCaracteristicas(String pDatosExtra){
        return    " Marca:" + getMarca() + " \n"
        		+ " Modelo:" + getModelo() + " \n"
        		+ " Color:" + getColor() + " \n"
        		+  pDatosExtra + " \n";
    }
}
