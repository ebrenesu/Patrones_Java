package builder.productoConcreto;

import builder.productoAbstracto.AParte;

public class Vehiculo {
	private String _Placa;
    private Motor _Motor; 
    private Carroceria _Carroceria;
    private Elevaluna _Elevalunas;
    //private boolean _AireAcondicionado; Hacer este objeto
   
    public Vehiculo(String pPlaca) {
    	this.set_Placa(pPlaca);
    }
    
    /*****************************************************************
     * Descripcion:   Establece la placa del vehículo.
     * @param pPlaca  valor de la placa del vehículo.
     *****************************************************************/
	public void set_Placa(String pPlaca) {
		this._Placa = pPlaca;
	}
	
    /*****************************************************************
     * Descripcion:   Establece la carrocería del vehículo.
     * @param _Carroceria La carrocería del vehículo.
     *****************************************************************/
    public void set_Carroceria(AParte pPieza) {
        this._Carroceria = (Carroceria) pPieza;
    }
    
    /*****************************************************************
     * Descripcion:   Establece los elevalunas del vehículo.
     * @param _Elevalunas Los elevalunas del vehículo.
     *****************************************************************/
    public void set_Elevalunas(AParte pElevalunas) {
        this._Elevalunas = (Elevaluna) pElevalunas;
    }
    
    /*****************************************************************
     * Descripcion:   Establece el motor del vehículo.
     * @param _Motor El motor del vehículo.
     *****************************************************************/
    public void set_Motor(AParte pMotor) {
        this._Motor = (Motor) pMotor;
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene la carrocería del vehículo.
     * @return La carrocería del vehículo.
     *****************************************************************/
    public Carroceria get_Carroceria() {
        return _Carroceria;
    }
        
    /*****************************************************************
     * Descripcion:   Obtiene los elevalunas del vehículo.
     * @return Los elevalunas del vehículo.
     *****************************************************************/
    public Elevaluna get_Elevalunas() {
        return _Elevalunas;
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene la información del vehículo.
     * @return La información del vehículo.
     *****************************************************************/
    public String Obtener_Info() {
        return "Vehiculo placa "+this.get_Placa()+" con las caracteristicas: \n" + this.get_Carroceria().ImprimirCaracteristicas() + "\n" + this.get_Elevalunas().ImprimirCaracteristicas() + "\n" + this.get_Motor().ImprimirCaracteristicas();
    }

    /*****************************************************************
     * Descripcion:   Obtiene la información de la placa del vehiculo.
     * @return La información del vehículo.
     *****************************************************************/
	public String get_Placa() {
		return _Placa;
	}

    /*****************************************************************
     * Descripcion:   Obtiene el motor del vehículo.
     * @return El motor del vehículo.
     *****************************************************************/
    public Motor get_Motor() {
        return _Motor;
    }
   
}
