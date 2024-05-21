package sistemaClasico.objetos;

public class Cafe {
	private String nombre, region;
	private int idCafe, cantStock;
	
	public Cafe(String nombre, String region, int idCafe, int cantStock) {
		setNombre(nombre);
		setRegion(region);
		setIdCafe(idCafe);
		setCantStock(cantStock);
	}
	
//---------------------------------------------------------------------------//
	
	public void setIdCafe(int idCafe) {
		this.idCafe = idCafe;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}
	public void setRegion(String region) {
		this.region = region;
	}

//---------------------------------------------------------------------------//	
	
	public String getNombre() {
		return nombre;
	}
	public String getRegion() {
		return region;
	}
	
	public int getIdCafe() {
		return idCafe;
	}

	public int getCantStock() {
		return cantStock;
	}
	
//---------------------------------------------------------------------------//	
	public String get_Data_cafe(int pType) {
		String mData = "El cafe "+getNombre()+ " proviene de la region " + getRegion();
		if (pType == 1) // para administracion
			mData += "\n Todavia le quedan en stock " +getCantStock()+ " tazas";
		
		return mData;
	}
	
	public Cafe clone() {
		return this;
	}
}
