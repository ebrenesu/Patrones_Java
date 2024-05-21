package bridge.color;

import bridge.abstracta.IColor;

public class Rojo implements IColor  {

    @Override
    public void pintar() {
        System.out.println("Color Rojo");
    }

	@Override
	public String getColor() {
		return "Rojo";
	}
    
}
