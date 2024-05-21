package strategy.base;

/**
 * Clase abstracta que implementa la interfaz IArea.
 *
 * @author SEAS - Estudios abiertos.
 */
public abstract class AbstractArea implements IArea {

    private String nombreFigura;

    public AbstractArea(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    protected void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    /**
     * Metodo que sera implementado en todas las clases hijas.
     *
     * @return float area del poligono.
     */
    @Override
    public abstract float calculaArea();

}


