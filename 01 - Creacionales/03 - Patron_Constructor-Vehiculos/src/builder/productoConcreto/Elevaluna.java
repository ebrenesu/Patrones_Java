package builder.productoConcreto;
import builder.productoAbstracto.AParte;

public class Elevaluna extends AParte {
	private Boolean _ReguladorElectrico;
    private String _EstadoActual, _NumSerie;
    
    /*****************************************************************
     * Descripcion:   Constructor de la clase Elevaluna.
     * @param pReguladorElectrico Estado del regulador eléctrico.
     * @param pEstadoActual Estado actual del elevaluna.
     * @param pNumSerie Número de serie del elevaluna.
     *****************************************************************/
	public Elevaluna( Boolean pReguladorElectrico, String pEstadoActual, String pNumSerie) {
		super("Elevaluna");
		set_ReguladorElectrico(pReguladorElectrico);
		set_EstadoActual(pEstadoActual);
		set_NumSerie(pNumSerie);
	}

	/************************************************************
     * Metodo:        get_ReguladorElectrico
     * Descripcion:   Devuelve el estado del regulador eléctrico.
     * @return:       _ReguladorElectrico [Boolean]
     *************************************************************/
    public Boolean get_ReguladorElectrico() {
        return _ReguladorElectrico;
    }

    /************************************************************
     * Metodo:        get_EstadoActual 
     * Descripcion:   Devuelve el estado actual.
     * @return:       _EstadoActual [String]
     *************************************************************/
    public String get_EstadoActual() {
        return _EstadoActual;
    }

    /************************************************************
     * Metodo:        get_NumSerie
     * Descripcion:   Devuelve el número de serie.
     * @return:       _NumSerie [String]
     *************************************************************/
    public String get_NumSerie() {
        return _NumSerie;
    }

    /************************************************************
     * Metodo:        set_EstadoActual
     * Descripcion:   Establece el estado actual.
     * Parametros:    pEstadoActual [String]
     * @return:       Void
     *************************************************************/
    public void set_EstadoActual(String pEstadoActual) {
        this._EstadoActual = pEstadoActual;
    }

    /************************************************************
     * Metodo:        set_NumSerie
     * Descripcion:   Establece el número de serie.
     * Parametros:    pNumSerie [String]
     * @return:       Void
     *************************************************************/
    public void set_NumSerie(String pNumSerie) {
        this._NumSerie = pNumSerie;
    }

    /************************************************************
     * Metodo:        set_ReguladorElectrico
     * Descripcion:   Establece el estado del regulador eléctrico.
     * Parametros:    pReguladorElectrico [Boolean]
     * @return:       Void
     *************************************************************/
    public void set_ReguladorElectrico(Boolean pReguladorElectrico) {
        this._ReguladorElectrico = pReguladorElectrico;
    }
    
    
    /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        SECCION DE IMPLEMENTACION DE LAS FUNCIONES
        DE LA CLASE PADRE. 
      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

    /************************************************************
     * Metodo:        ImprimirCaracteristicas
     * Descripcion:   Nos devuelve las caracteristicas de la clase.
     * Parametros:    N/A
     * @return:       [String] Caracteristicas del objeto
     *************************************************************/
    @Override
    public String ImprimirCaracteristicas() {
        String mensaje = "Elevaluna " + this.get_NumSerie()+ " se encuentra " + this.get_EstadoActual();
        mensaje += " y es " + (this.get_ReguladorElectrico()?"electrico":"manual");
        return mensaje;
    }

}
