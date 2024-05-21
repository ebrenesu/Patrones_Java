package bridge.color;

import bridge.abstracta.IColor;

public class Verde implements IColor {
	
    @Override
    public void pintar() {
        System.out.println("Color verde");
    }

	@Override
	public String getColor() {
		return "Verde";
	}
}
