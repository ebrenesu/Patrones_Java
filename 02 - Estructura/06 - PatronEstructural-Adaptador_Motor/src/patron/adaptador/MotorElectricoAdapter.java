package patron.adaptador;

import Objetos.Motor;
import patron.adaptado.MotorElectrico;

public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        this.TipoMotor = "Electrico Adaptado";
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Adaptado de un motor Electrico");
    }
    
    public MotorElectricoAdapter(MotorElectrico pME){
        super();
        this.TipoMotor = "Electrico Adaptado";
        this.motorElectrico = pME;
        System.out.println("Adaptando motor Electrico adapter");
    }
    
    
    @Override
    public void encender() {
        System.out.println("Encendiendo 'motor Electrico Adapter' \n");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico... \n");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico \n");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
