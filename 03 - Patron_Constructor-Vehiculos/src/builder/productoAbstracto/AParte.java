package builder.productoAbstracto;

public abstract class AParte {
    private String _Nombre;

    /*****************************************************************
     * Descripcion:   Constructor de la clase AProducto.
     * @param pNombre El nombre del producto.
     *****************************************************************/
    public AParte(String pNombre) {
        this.set_Nombre(pNombre);
    }

    /*****************************************************************
     * Descripcion:   Obtiene el nombre del producto.
     * @return El nombre del producto.
     *****************************************************************/
    public String get_Nombre() {
        return _Nombre;
    }

    /*****************************************************************
     * Descripcion:   Establece el nombre del producto.
     * @param _Nombre El nombre del producto.
     *****************************************************************/
    public void set_Nombre(String _Nombre) {
        this._Nombre = _Nombre;
    }
    
    /*****************************************************************
     * Metodo:        ImprimirCaracteristicas
     * Descripcion:   Nos devuelve las caracteristicas de la clase.
     * Parametros:    N/A
     * @return:       [String] Caracteristicas del objeto
     *****************************************************************/
    public abstract String ImprimirCaracteristicas();
    
}
