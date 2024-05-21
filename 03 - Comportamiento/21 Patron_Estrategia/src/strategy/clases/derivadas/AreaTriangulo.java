package strategy.clases.derivadas;

import strategy.base.AbstractArea;

/**
 * Clase que define la estrategia para calcular el area de un triangulo.
 *
 * @author SEAS - Estudios abiertos.
 */
public class AreaTriangulo extends AbstractArea {
    
    private float base;
    private float altura;

    /**
     * Constructor del objeto que define la estrategia para el calculo del area
     * de un triangulo.
     *
     * @param base float longitud de la base.
     * @param altura float longitud de la altura.
     */
    public AreaTriangulo(float base, float altura) {
        super("triangulo");
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo que calcula el valor del area y que proviene de la interfaz IArea.
     *
     * @return float area del circulo.
     */
    @Override
    public float calculaArea() {
        return (base * altura) / 2;
    }
    
}

