package util.excepciones;

/**
 * Clase que define la excepcion para poligonos irregulares.
 *
 * @author SEAS - Estudios abiertos.
 */
public class PoligonoNoSoportadoException extends Exception {

    /**
     * Constructor de la excepcion.
     */
    public PoligonoNoSoportadoException() {
        super("El poligono no esta soportado.");
    }
}

