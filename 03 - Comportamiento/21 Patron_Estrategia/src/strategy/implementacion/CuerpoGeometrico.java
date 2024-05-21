package strategy.implementacion;

import strategy.base.AbstractArea;
import strategy.clases.derivadas.AreaCircular;
import strategy.clases.derivadas.AreaPoligonoRegular;
import strategy.clases.derivadas.AreaRectangulo;
import strategy.clases.derivadas.AreaTriangulo;
import util.excepciones.ConstructorIncorrectoException;
import util.excepciones.PoligonoNoExisteException;
import util.excepciones.PoligonoNoSoportadoException;

/**
 * Clase que implementa el patron y que decidira la estrategia a aplicar.
 *
 * @author SEAS - Estudios abiertos.
 */
public class CuerpoGeometrico {

    private AbstractArea _estrategia;
	private final float radio;
    private final int lados;
    private final float base;
    private final float altura;

    /**
     * Constructor del objeto para un circulo.
     *
     * @param radio float longitud del radio.
     */
    public CuerpoGeometrico(float radio) {
        this.radio = radio;
        this.lados = (int) Float.POSITIVE_INFINITY;
        this.base = 0;
        this.altura = 0;
    }
    
	/**
     * Constructor del objeto para poligonos regulares.
     *
     * @param radio float longitud del radio.
     * @param lados int numero de lados.
     * @throws ConstructorIncorrectoException excepcion de constructor
     * incorrecto.
     */
    public CuerpoGeometrico(float radio, int lados) throws
            ConstructorIncorrectoException {
        if(lados < 5)
            throw new ConstructorIncorrectoException(radio+" - "+lados);
        this.radio = radio;
        this.lados = lados;
        this.base = 0;
        this.altura = 0;
    }

    /**
     * Constructor del objeto para un triangulo.
     *
     * @param base float longitud de la base.
     * @param altura float longitud de la altura.
     * @param lados int numero de lados.
     */
    public CuerpoGeometrico(float base, float altura, int lados) {
        this.radio = 0;
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo que imprime por pantalla el resultado del calculo.
     */
    public String imprimeArea() {
        return ("El area del " + _estrategia.getNombreFigura()
                + " es: " + _estrategia.calculaArea());
    }

    public boolean isCirculo() {
        return lados == (int) Float.POSITIVE_INFINITY && radio != 0;
    }

    public boolean isPoligonoRegular() {
        return radio != 0 && lados != 0 && lados != 2;
    }

    public boolean isTriangulo() {
        return base != 0 && altura != 0 && lados == 3;
    }

    public boolean isRectangulo() {
        return base != 0 && altura != 0 && lados == 4;
    }
    
    public AbstractArea get_estrategia() {
		return _estrategia;
	}

	public void set_estrategia(AbstractArea _estrategia) {
		this._estrategia = _estrategia;
	}

    public float getRadio() {
		return radio;
	}

	public int getLados() {
		return lados;
	}

	public float getBase() {
		return base;
	}

	public float getAltura() {
		return altura;
	}
}

