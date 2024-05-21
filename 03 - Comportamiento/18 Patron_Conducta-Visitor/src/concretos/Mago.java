package concretos;

import interfaces.IPersonaje;
import interfaces.IVisitor;

public class Mago implements IPersonaje{
	private int nivelMagia = 1;
    private String arma = "";
    private String conjuro = "";
    private String nombre;
    // ------------------------------
    public Mago() {
    	setNivelMagia(1);
    }
    // ------------------------------
    public int getNivelMagia()
    {
        return this.nivelMagia;
    }
    // ------------------------------
    public void setNivelMagia(int nivelMagia)
    {
        this.nivelMagia = nivelMagia;
    }
    // ------------------------------
    public String getArma()
    {
        return this.arma;
    }
    // ------------------------------
    public void setArma(String arma)
    {
        this.arma = arma;
    }
    // ------------------------------
    public String getConjuro()
    {
        return this.conjuro;
    }
    // ------------------------------
    public void setConjuro(String conjuro)
    {
        this.conjuro = conjuro;
    }
    // ------------------------------
    @Override
    public void accept( IVisitor visitor )    {
        visitor.visit(this);
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
