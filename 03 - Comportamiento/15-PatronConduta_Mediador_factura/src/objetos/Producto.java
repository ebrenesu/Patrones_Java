package objetos;

public class Producto {
	private String Nombre;
	private String Categoria;
	private int Precio;
	private double SubTotal;
	
	public Producto(String nombre, String categoria, int precio) {
		Nombre = nombre;
		Categoria = categoria;
		Precio = precio;
		SubTotal = 0;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}
	
	public double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(double precio) {
		SubTotal = precio;
	}

	public String ImprimirData() {
		return "El producto "+this.getNombre()+". Pertenece a la categoria: "+this.getCategoria()
				+ " su precio unitario es: "+this.getPrecio()+" y procesado queda en "+this.SubTotal;
	}
	
	
}
