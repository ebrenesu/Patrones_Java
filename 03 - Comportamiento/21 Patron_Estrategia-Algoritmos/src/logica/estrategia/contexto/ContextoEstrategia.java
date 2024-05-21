package logica.estrategia.contexto;
import logica.estrategia.abtracto.EstrategiaOrdenamiento;
import logica.estrategia.concreto.*;

public class ContextoEstrategia {
	private EstrategiaOrdenamiento estrategiaOrdenamiento;
	private String _Estrategia;

    public ContextoEstrategia() {
    	seleccionarEstrategia(1);
    }
    
    public ContextoEstrategia(int pEstrategia) {
    	seleccionarEstrategia(pEstrategia);
    }

    public int[] ordenar(int[] datos) {
        return estrategiaOrdenamiento.ordenar(datos);
    }
    
    public String obtenerTipoEstrategia(boolean pSeleccionado) {
    	if (pSeleccionado)
    		return _Estrategia;
    	else
    		return    "1. Ordenamiento Burbuja." + "\n"
    				+ "2. Ordenamiento Insercion."+ "\n"
    				+ "3. Ordenamiento Seleccion.";
    }
    
    public void seleccionarEstrategia(int pEstrategia) {
    	_Estrategia="";
        switch(pEstrategia) {
            case 1:
                this.estrategiaOrdenamiento = new OrdenamientoBurbuja();
                _Estrategia = "Ordenamiento Burbuja";
                break;
            case 2:
                this.estrategiaOrdenamiento = new OrdenamientoInsercion();
                _Estrategia = "Ordenamiento Insercion";
                break;
            case 3:
                this.estrategiaOrdenamiento = new OrdenamientoSeleccion();
                _Estrategia = "Ordenamiento Seleccion";
                break;
            default:
                throw new IllegalArgumentException("La estrategia " + pEstrategia + " no esta disponible.");
        }
    }
}