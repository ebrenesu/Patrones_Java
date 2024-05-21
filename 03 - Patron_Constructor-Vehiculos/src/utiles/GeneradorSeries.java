package utiles;

public class GeneradorSeries {
    private static int contadorMotor = 0;
    private static int contadorCarroceria = 0;
    private static int contadorElevaluna = 0;

    /*****************************************************************
     * Descripcion:   Genera un número de serie para un motor.
     * @return El número de serie generado para el motor.
     *****************************************************************/
    public static String generarNumeroSerieMotor() {
        contadorMotor++;
        return "MTR_" + contadorMotor;
    }

    /*****************************************************************
     * Descripcion:   Genera un número de serie para una carrocería.
     * @return El número de serie generado para la carrocería.
     *****************************************************************/
    public static String generarNumeroSerieCarroceria() {
        contadorCarroceria++;
        return "CRCR_" + contadorCarroceria;
    }

    /*****************************************************************
     * Descripcion:   Genera un número de serie para un elevaluna.
     * @return El número de serie generado para el elevaluna.
     *****************************************************************/
    public static String generarNumeroSerieElevaluna() {
        contadorElevaluna++;
        return "EVA_" + contadorElevaluna;
    }
}
