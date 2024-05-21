package prototipo;

import iProtitpo.Camiseta;
import material.Lana;

public class Camiseta_Manga_Corta extends Camiseta{
	public Camiseta_Manga_Corta(int pId, int talla, String color, String estampado){
		this.setNombre("Prototipo 1");
        this.setTalla(talla);
	    this.setColor(color);
	    this.setManga("Corta");
	    this.setEstampado(estampado);
	    this.setMaterial(new Lana());
}
	
	@Override
	public Camiseta clone() {
		return new Camiseta_Manga_Corta(this.getSerie(), this.getTalla(), this.getColor(), this.getEstampado());
	}

}
