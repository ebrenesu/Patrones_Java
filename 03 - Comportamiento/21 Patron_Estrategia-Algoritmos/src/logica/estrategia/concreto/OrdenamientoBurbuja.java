package logica.estrategia.concreto;
import logica.estrategia.abtracto.EstrategiaOrdenamiento;

public class OrdenamientoBurbuja implements EstrategiaOrdenamiento {

	@Override
    public int[] ordenar(int[] datos) {
        int n = datos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] > datos[j+1]) {
                    // intercambiar datos[j] y datos[j+1]
                    int temp = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = temp;
                }
            }
        }
        return datos;
    }
	
}