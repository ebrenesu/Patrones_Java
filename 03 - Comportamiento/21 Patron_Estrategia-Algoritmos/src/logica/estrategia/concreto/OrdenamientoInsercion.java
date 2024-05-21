package logica.estrategia.concreto;

import logica.estrategia.abtracto.EstrategiaOrdenamiento;

public class OrdenamientoInsercion implements EstrategiaOrdenamiento {
	
	@Override
    public int[]  ordenar(int[] datos) {
        int n = datos.length;
        for (int i = 1; i < n; i++) {
            int valorActual = datos[i];
            int j = i - 1;
            while (j >= 0 && datos[j] > valorActual) {
                datos[j + 1] = datos[j];
                j--;
            }
            datos[j + 1] = valorActual;
        }
        return datos;
    }
}