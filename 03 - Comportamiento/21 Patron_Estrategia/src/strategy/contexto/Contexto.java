package strategy.contexto;

import strategy.base.AbstractArea;
import strategy.clases.derivadas.*;
import strategy.implementacion.CuerpoGeometrico;
import util.excepciones.*;

public class Contexto {
	private AbstractArea _estrategia;
	
	public void esoger_estrategia(CuerpoGeometrico pCG) throws PoligonoNoExisteException, PoligonoNoSoportadoException {
		if (pCG.isCirculo()) {
			_estrategia = new AreaCircular(pCG.getRadio());
		} else if (pCG.isTriangulo()) {
		    _estrategia = new AreaTriangulo(pCG.getBase(), pCG.getAltura());
		} else if (pCG.isRectangulo()) {
		    _estrategia = new AreaRectangulo(pCG.getBase(), pCG.getAltura());
		} else if (pCG.isPoligonoRegular()) {
		    _estrategia = new AreaPoligonoRegular(pCG.getLados(), pCG.getRadio());
		} else if (pCG.getLados() == 2 || pCG.getLados()== 0) {
		    throw new PoligonoNoExisteException();
		} else {
		    throw new PoligonoNoSoportadoException();
		}
		pCG.set_estrategia(_estrategia);
	}
	
}
