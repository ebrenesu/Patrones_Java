/************************************************************
 * Clase: Triangulo
 * Descripción: Esta clase es el producto abstacto.
 * @author Erick Brenes
 ************************************************************/
package producto;

public abstract class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	private String nombre;
	
/****************** SECCION: CONSTRUCTORES *******************/		
	public Triangulo(int ladoA, int ladoB, int ladoC, String nombre) {
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
		setNombre(nombre);
	}
	
	public Triangulo() {
		setLadoA(0);
		setLadoB(0);
		setLadoC(0);
		setNombre("Triangulo");
	}
	
/********************* SECCION: GETS ************************/	
	public int getLadoA() {
		return ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public int getLadoC() {
		return ladoC;
	}
	public String getNombre() {
		return nombre;
	}
	public String getLados() {
		return String.valueOf(ladoA) + "  -  "+String.valueOf(ladoB) + "  -  "+String.valueOf(ladoC);
	}

/********************* SECCION: SETS ************************/	
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

/********************SECCION: ABSTRACTAS *********************/	
	public abstract String getDescripcion();
	public abstract double getSuperficie();
	public abstract String dibujar();
	

}
