package principal;

import java.util.ArrayList;

import strategy.base.AbstractArea;
import strategy.clases.derivadas.*;
import strategy.contexto.Contexto;
import strategy.implementacion.CuerpoGeometrico;
import util.excepciones.*;

public class Gestor_Cuerpo_Geometrico {
	private ArrayList<CuerpoGeometrico> array_figuras;
	private Contexto _Context;
	
	Gestor_Cuerpo_Geometrico(){
		array_figuras = new ArrayList<CuerpoGeometrico>();
		_Context = new Contexto();
	}

    public void nueva_figura_geometrica(float radio) throws PoligonoNoExisteException, PoligonoNoSoportadoException {
    	agregar_array( new CuerpoGeometrico(radio));
    }
    
    public void nueva_figura_geometrica(float radio, int lados) throws PoligonoNoExisteException, PoligonoNoSoportadoException, ConstructorIncorrectoException {
    	agregar_array(new CuerpoGeometrico(radio, lados));
    }
    
    public void nueva_figura_geometrica(float base, float altura, int lados) throws PoligonoNoExisteException, PoligonoNoSoportadoException {
    	agregar_array(new CuerpoGeometrico(base,altura, lados));
    }

    public String impimir_area(int pId_figura) {
    	return this.array_figuras.get(pId_figura).imprimeArea();
    }

	public int cantidad_figuras() {
		return this.array_figuras.size();
	}
    
	/*									Escogemos un contexto						*/
    private void agregar_array(CuerpoGeometrico pCG) throws PoligonoNoExisteException, PoligonoNoSoportadoException {
    	_Context.esoger_estrategia(pCG);
    	array_figuras.add(pCG);
    }
    
}
