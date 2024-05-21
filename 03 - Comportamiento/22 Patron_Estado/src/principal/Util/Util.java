package principal.Util;

public class Util {
	public static void SimularLatencia(int pTimes) {
        try {
            int i = 0;
            System.out.println();
            while (i < pTimes) {
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
