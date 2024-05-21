package strategy.clases.derivadas;

import strategy.base.AbstractArea;

/**
 * Clase que define la estrategia para calcular el area de un circulo.
 *
 * @author SEAS - Estudios abiertos.
 */
public class AreaCircular extends AbstractArea {

    private float radio;

    /**
     * Constructor del objeto que define esta estrategia.
     *
     * @param radio float longitud del radio del circulo.
     */
    public AreaCircular(float radio) {
        super("circulo");
        this.radio = radio;
    }

    /**
     * Metodo que calcula el valor del area y que proviene de la interfaz IArea.
     *
     * @return float area del circulo.
     */
    @Override
    public float calculaArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
}


