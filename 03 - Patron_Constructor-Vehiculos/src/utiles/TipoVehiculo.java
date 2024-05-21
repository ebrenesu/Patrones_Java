package utiles;

/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Un enum es una estructura que representa un conjunto fijo de 
 * constantes relacionadas, en este caso tenemos tamaño de motor, 
 * un estado actual del elevaluna y si este es eléctrico o no.
 * Esta clase nos ayudara a generar objetos de tipo Base, medio o alto
 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

public enum TipoVehiculo {
    BASE("Economico",1000, false),
    MEDIO("Estandar",1600, true),
    ALTO("Full",2000, true);

    private final int _MotorCC;
    private final String _EstadoActualElevaluna;
    private final boolean _ElevalunaEsElectrico;
    private final String _TipoVehiculo;

    /*****************************************************************
     * Descripcion:   Constructor del enum TipoVehiculo.
     * @param pCC Tamaño del motor del vehículo en centímetros cúbicos.
     * @param bEsElectrico Indica si el elevaluna del vehículo es eléctrico o no.
     *****************************************************************/
    TipoVehiculo(String pTipoVehiculo, int pCC, boolean bEsElectrico) {
        this._MotorCC = pCC;
        this._ElevalunaEsElectrico = bEsElectrico;
        this._EstadoActualElevaluna = "Arriba";
        this._TipoVehiculo = pTipoVehiculo;
    }

    /*****************************************************************
     * Seccion get de atributos de la clase
     *****************************************************************/
    public int get_MotorCC() {return _MotorCC;}
    public String get_EstadoActualElevaluna() {return _EstadoActualElevaluna;}
    public String get_TipoVehiculo() {return _TipoVehiculo;}
    public boolean get_ElevalunaEsElectrico() {return _ElevalunaEsElectrico;}
}
