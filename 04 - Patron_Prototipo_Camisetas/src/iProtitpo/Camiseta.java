package iProtitpo;

import material.Material;

public abstract class Camiseta {
	private int serie;
	private String nombre;
	private int talla;
    private String color;
    private String manga;
    private String estampado;
    private Material material;
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(Integer talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManga() {
		return manga;
	}

	public void setManga(String manga) {
		this.manga = manga;
	}

	public String getEstampado() {
		return estampado;
	}

	public void setEstampado(String estampado) {
		this.estampado = estampado;
	}

	public String getMaterial() {
		return material.getDescripcion();
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getData() {
		String mData= "< Sobre este producto >\n";
		
		mData += "Numero de serie: " + this.getSerie() + "\n";
		mData += "Nombre: " + this.getNombre() + "\n";
		mData += "Talla: " + this.getTalla() + "\n";
		mData += "Color: " + this.getColor() + "\n";
		mData += "Tipo de manga: " + this.getManga() + "\n";
		mData += "Tipo de estampado de  " + this.getEstampado() + "\n";
		mData += "Tipo de material " + this.getMaterial() + "\n";
		
		return mData;
	}
	
	//Funcion que obligamos a los objetos a definir.
	 public abstract Camiseta clone();
}
