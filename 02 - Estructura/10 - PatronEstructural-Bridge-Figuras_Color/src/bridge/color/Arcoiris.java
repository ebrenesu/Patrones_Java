package bridge.color;

import bridge.abstracta.IColor;

public class Arcoiris implements IColor{

	@Override
	public String getColor() {
		return "Varicolor";
	}

	@Override
	public void pintar() {
		System.out.println("Tomamos 7 colores y pintamos");
		
	}

}
