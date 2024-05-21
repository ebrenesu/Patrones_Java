package util.excepciones;

/**
 * Clase que define la excepcion de constructor incorrecto.
 *
 * @author SEAS - Estudios abiertos.
 */
public class ConstructorIncorrectoException extends Exception {

    public ConstructorIncorrectoException(String pVal) {
        super("El constructor utilizado no es correcto para ese cuerpo geometrico ["+pVal+"]");
    }

}
