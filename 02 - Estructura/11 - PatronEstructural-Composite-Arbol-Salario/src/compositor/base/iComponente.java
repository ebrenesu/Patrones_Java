package compositor.base;

public abstract class iComponente{
	public static final int EMPRESA = 0;
	public static final int EMPLEADO = 1;
    public static final int EQUIPO = 2;
	
    protected String nombre;
    protected int tipoNodo;
	
/******************************************
 *      								  *
 *         SECCION DE GETS y SETS         *
 * 										  *
 ******************************************/
    public String getNombre(){
        return this.nombre;
    }
   
    public int getTipoNodo(){
        return this.tipoNodo;
    }
    
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    
    public void setTipoNodo( int tipoNodo ){
        this.tipoNodo = tipoNodo;
    }
    
/******************************************
 *      								  *
 *         SECCION Abstracta		      *
 * 										  *
 ******************************************/   
    public abstract int getSalario();
    public abstract String mostrarDatos();
	public abstract void agregarComponente(iComponente composicion);	
}