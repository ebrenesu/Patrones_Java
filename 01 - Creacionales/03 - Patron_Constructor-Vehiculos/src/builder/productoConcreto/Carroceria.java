package builder.productoConcreto;
import builder.productoAbstracto.AParte;

public class Carroceria extends AParte {
    private String _Serie, _Color;
    
    /*****************************************************************
     * Descripcion:   Constructor de la clase Carroceria.
     * @param pSerie El número de serie de la carrocería.
     *****************************************************************/
    public Carroceria(String pSerie, String pColor) {
        super("Carroceria");
        this.set_Serie(pSerie);
        this.set_Color(pColor);
    }
    
    /*****************************************************************
     * Descripcion:   Obtiene el color de la carrocería.
     * @return El color de la carrocería.
     *****************************************************************/
    public String get_Color() {
        return _Color;
    }

    /*****************************************************************
     * Descripcion:   Establece el color de la carrocería.
     * @param pColor El color de la carrocería.
     *****************************************************************/
    public void set_Color(String pColor) {
        this._Color = pColor;
    }


    /*****************************************************************
     * Descripcion:   Obtiene el número de serie de la carrocería.
     * @return El número de serie de la carrocería.
     *****************************************************************/
    public String get_Serie() {
        return _Serie;
    }

    /*****************************************************************
     * Descripcion:   Establece el número de serie de la carrocería.
     * @param pSerie El número de serie de la carrocería.
     *****************************************************************/
    public void set_Serie(String pSerie) {
        this._Serie = pSerie;
    }
    
    /*****************************************************************
     * Metodo:        ImprimirCaracteristicas
     * Descripcion:   Devuelve las características de la carrocería.
     * @return        Características de la carrocería.
     *****************************************************************/
    @Override
    public String ImprimirCaracteristicas() {
        return "Carroceria serie "+this.get_Serie()+" de color "+this.get_Color()+".";
    }
}
