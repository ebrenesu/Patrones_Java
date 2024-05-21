package builder.productoConcreto;
import builder.productoAbstracto.AParte;

public class Carroceria extends AParte {
    private String _Serie, _Color;
    
    /*****************************************************************
     * Descripcion:   Constructor de la clase Carroceria.
     * @param pSerie El n�mero de serie de la carrocer�a.
     *****************************************************************/
    public Carroceria(String pSerie, String pColor) {
        super("Carroceria");
        this.set_Serie(pSerie);
        this.set_Color(pColor);
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene el color de la carrocer�a.
     * @return El color de la carrocer�a.
     *****************************************************************/
    public String get_Color() {
        return _Color;
    }

    /*****************************************************************
     * Descripcion:   Establece el color de la carrocer�a.
     * @param pColor El color de la carrocer�a.
     *****************************************************************/
    public void set_Color(String pColor) {
        this._Color = pColor;
    }


    /*****************************************************************
     * Descripcion:   Obtiene el n�mero de serie de la carrocer�a.
     * @return El n�mero de serie de la carrocer�a.
     *****************************************************************/
    public String get_Serie() {
        return _Serie;
    }

    /*****************************************************************
     * Descripcion:   Establece el n�mero de serie de la carrocer�a.
     * @param pSerie El n�mero de serie de la carrocer�a.
     *****************************************************************/
    public void set_Serie(String pSerie) {
        this._Serie = pSerie;
    }
    
    /*****************************************************************
     * Metodo:        ImprimirCaracteristicas
     * Descripcion:   Devuelve las caracter�sticas de la carrocer�a.
     * @return        Caracter�sticas de la carrocer�a.
     *****************************************************************/
    @Override
    public String ImprimirCaracteristicas() {
        return "Carroceria serie "+this.get_Serie()+" de color "+this.get_Color()+".";
    }
}
