package Objetos;


/**
 * Clase motor comun
 * @author chenao
 *
 */
public class MotorComun extends Motor {

    public MotorComun(){
        this.TipoMotor="Comun";
        System.out.println("Creando el motor comun");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor comun");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando el motor comun");
        this.Turbo();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor comun");
    }
    

}
