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
     * Descripcion:   Establece la placa del veh�culo.
     * @param pPlaca  valor de la placa del veh�culo.
     *****************************************************************/
	public void set_Placa(String pPlaca) {
		this._Placa = pPlaca;
	}
	
    /*****************************************************************
     * Descripcion:   Establece la carrocer�a del veh�culo.
     * @param _Carroceria La carrocer�a del veh�culo.
     *****************************************************************/
    public void set_Carroceria(AParte pPieza) {
        this._Carroceria = (Carroceria) pPieza;
    }
    
    /*****************************************************************
     * Descripcion:   Establece los elevalunas del veh�culo.
     * @param _Elevalunas Los elevalunas del veh�culo.
     *****************************************************************/
    public void set_Elevalunas(AParte pElevalunas) {
        this._Elevalunas = (Elevaluna) pElevalunas;
    }
    
    /*****************************************************************
     * Descripcion:   Establece el motor del veh�culo.
     * @param _Motor El motor del veh�culo.
     *****************************************************************/
    public void set_Motor(AParte pMotor) {
        this._Motor = (Motor) pMotor;
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene la carrocer�a del veh�culo.
     * @return La carrocer�a del veh�culo.
     *****************************************************************/
    public Carroceria get_Carroceria() {
        return _Carroceria;
    }
        
    /*****************************************************************
     * Descripcion:   Obtiene los elevalunas del veh�culo.
     * @return Los elevalunas del veh�culo.
     *****************************************************************/
    public Elevaluna get_Elevalunas() {
        return _Elevalunas;
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene la informaci�n del veh�culo.
     * @return La informaci�n del veh�culo.
     *****************************************************************/
    public String Obtener_Info() {
        return "Vehiculo placa "+this.get_Placa()+" con las caracteristicas: \n" + this.get_Carroceria().ImprimirCaracteristicas() + "\n" + this.get_Elevalunas().ImprimirCaracteristicas() + "\n" + this.get_Motor().ImprimirCaracteristicas();
    }

    /*****************************************************************
     * Descripcion:   Obtiene la informaci�n de la placa del vehiculo.
     * @return La informaci�n del veh�culo.
     *****************************************************************/
	public String get_Placa() {
		return _Placa;
	}

    /*****************************************************************
     * Descripcion:   Obtiene el motor del veh�culo.
     * @return El motor del veh�culo.
     *****************************************************************/
    public Motor get_Motor() {
        return _Motor;
    }
   
}
