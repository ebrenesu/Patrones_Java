package builder.productoConcreto;

import builder.productoAbstracto.AParte;

public class Motor extends AParte{
    private int _CC;
    private String _Vin;

    /*****************************************************************
     * Descripcion:   Constructor de la clase Motor.
     * @param pCC El cilindraje del motor.
     * @param pVin El VIN del motor.
     *****************************************************************/
    public Motor(int pCC, String pVin) {
        super("Motor");
        this.set_CC(pCC);
        this.set_Vin(pVin);
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene el cilindraje del motor.
     * @return El cilindraje del motor.
     *****************************************************************/
    public int get_CC() {
        return _CC;
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene el VIN del motor.
     * @return El VIN del motor.
     *****************************************************************/
    public String get_Vin() {
        return _Vin;
    }

    /*****************************************************************
     * Descripcion:   Establece el cilindraje del motor.
     * @param pCC El cilindraje del motor.
     *****************************************************************/
    public void set_CC(int pCC) {
        this._CC=pCC;
    }

    /*****************************************************************
     * Descripcion:   Establece el VIN del motor.
     * @param pVin El VIN del motor.
     *****************************************************************/
    public void set_Vin(String pVin) {
        this._Vin = (pVin);
    }

    /*****************************************************************
     * Metodo:        ImprimirCaracteristicas
     * Descripcion:   Devuelve las características del motor.
     * @return        Características del motor.
     *****************************************************************/
    @Override
    public String ImprimirCaracteristicas() {
        return "El motor con el VIN "+this.get_Vin()+" tiene un cilindraje de "+this.get_CC()+"cc";
    }
    
}
