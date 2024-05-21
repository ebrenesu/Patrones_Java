package material;

public class Lana extends Material{
	private int id;
	
	public Lana(int precio) {
		this.id = 1;
		super.setDescripcion( "Lana");
		this.setPrecio(precio);
	}
	
	public Lana() {
		this.id = 1;
		super.setDescripcion( "Lana");
		this.setPrecio(100);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
