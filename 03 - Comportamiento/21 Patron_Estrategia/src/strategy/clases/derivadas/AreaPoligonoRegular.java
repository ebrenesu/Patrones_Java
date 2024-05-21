package strategy.clases.derivadas;

import strategy.base.AbstractArea;

/**
 * Clase que define la estrategia para calcular el area de un polígono regular.
 *
 * @author SEAS - Estudios abiertos.
 */
public class AreaPoligonoRegular extends AbstractArea {
    
    private float radio;
    private int numeroDeLados;

    /**
     * Constructor del objeto que define la estrategia para calcular el area de
     * un poligono regular de n lados a partir del circulo que lo circunscribe.
     *
     * @param numeroDeLados int numero de lados del poligono.
     * @param radio float longitud del radio.
     */
    public AreaPoligonoRegular(int numeroDeLados, float radio) {
        super("poligono regular de " + numeroDeLados + " lados");
        this.numeroDeLados = numeroDeLados;
        this.radio = radio;
    }

    /**
     * Metodo que calcula el valor del area y que proviene de la interfaz IArea.
     *
     * @return float area del circulo.
     */
    @Override
    public float calculaArea() {
        double numerador = numeroDeLados * Math.pow(radio, 2)
                * Math.sin((2 * Math.PI) / numeroDeLados);
        double denominador = 2;
        return (float) ((float) numerador / denominador);
    }
}


