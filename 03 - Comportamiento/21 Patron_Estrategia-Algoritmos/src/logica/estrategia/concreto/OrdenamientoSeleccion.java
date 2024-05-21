package logica.estrategia.concreto;
import logica.estrategia.abtracto.EstrategiaOrdenamiento;

public class OrdenamientoSeleccion implements EstrategiaOrdenamiento {
	
	@Override
	public int[] ordenar(int[] datos) {
        int n = datos.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (datos[j] < datos[min_idx]) {
                    min_idx = j;
                }
            }
            // intercambiar datos[min_idx] y datos[i]
            int temp = datos[min_idx];
            datos[min_idx] = datos[i];
            datos[i] = temp;
        }
        return datos;
    }
}