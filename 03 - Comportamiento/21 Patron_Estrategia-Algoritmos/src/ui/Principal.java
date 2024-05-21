package ui;

import logica.Gestor;

public class Principal {
	static Gestor _g;
	public static void main(String[] args) {
        int[] arreglo ;
        _g=new Gestor();
        
        for (int i = 1 ; i<4;i++) {
        	arreglo = NuevoArreglo();
        	print("El arreglo ");
        	printArray(arreglo);
        	print("Estrategia escogida: "+_g.escogerEstrategia(i));
            print("Resultado: " + _g.ordenar(arreglo)+"\n");	
        }
        
	}
	
	public static void print(String pText) {
		System.out.println(pText);
	}
	
	public static void printArray(int[] pArr) {
		String arregloOrdenado="";
		for (int num : pArr)  
			arregloOrdenado += String.valueOf(num)+" ";
		print(arregloOrdenado);
	}
	
	public static int[] NuevoArreglo() {
		int[] arreglo = { 5, 1, 4, 2, 8,16,6,7,9,2,4,8,1,3,7,9 };
		return arreglo;
	}
}
