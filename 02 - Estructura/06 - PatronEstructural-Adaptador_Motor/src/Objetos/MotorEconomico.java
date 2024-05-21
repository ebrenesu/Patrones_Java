package Objetos;



public class MotorEconomico extends Motor {

    public MotorEconomico(){
        this.TipoMotor="Economico";
        System.out.println("Creando motor " + this.TipoMotor);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor economico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor economico. Gastando un 1% de combustible");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor economico.");
    }


}
