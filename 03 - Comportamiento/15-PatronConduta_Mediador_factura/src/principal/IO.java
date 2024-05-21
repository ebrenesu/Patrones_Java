package principal;

import java.util.Scanner;

public class IO {
	private static Scanner entradas = new Scanner( System.in );
	
	public static void print(String pTxt) {
		System.out.println(pTxt);
	}
	
	public static void printError(String pTxt) {
		System.err.println(pTxt);
	}
	
	public static String leer() {
		return entradas.next();
	}
	
	public static int leer_numero() {
		return entradas.nextInt();
	}
	
	public static double leer_double() {
		return entradas.nextDouble();
	}
	
}
