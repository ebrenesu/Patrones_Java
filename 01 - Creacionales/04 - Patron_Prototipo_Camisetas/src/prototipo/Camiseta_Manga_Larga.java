package prototipo;

import iProtitpo.Camiseta;
import material.Lana;

public class Camiseta_Manga_Larga extends Camiseta{
	public Camiseta_Manga_Larga(int pSerie, int talla,  String color, String estampado){
		this.setSerie(pSerie);
		this.setNombre("Prototipo 2");
        this.setTalla(talla);
	    this.setColor(color);
	    this.setManga("Larga");
	    this.setEstampado(estampado);
	    this.setMaterial(new Lana());
}
	
	@Override
	public Camiseta clone() {
		return new Camiseta_Manga_Larga(this.getSerie(),this.getTalla(), this.getColor(), this.getEstampado());
	}

}
