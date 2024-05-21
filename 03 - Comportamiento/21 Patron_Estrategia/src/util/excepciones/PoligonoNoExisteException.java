package util.excepciones;

/**
 * Clase que define la excepcion de poligonos que no existen.
 *
 * @author SEAS - Estudios abiertos.
 */
public class PoligonoNoExisteException extends Exception {

    /**
     * Constructor de la excepcion.
     */
    public PoligonoNoExisteException() {
        super("El poligono no existe.");
    }

}

