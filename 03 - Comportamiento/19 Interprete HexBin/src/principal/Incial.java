package principal;

public class Incial {
	static Gestor _gestor;
	static String _Tipo;
	public static void main(String[] args) {
		
		_gestor = new Gestor();
		print(_gestor.obtener_opciones());

		print("Interpretamos el primer numero a Binario y despues Hexadecimal");
		interpretar("28",1);
		interpretar("28",2);
		print("\nInterpretamos el segundo numero de forma random entre binario y hexadecimal");
		int num = (int) ((Math.random()*10+1));
		interpretar(num+"",(int)Math.random());
	}
	
	private static void interpretar(String pValor, int pTipo) {
		_Tipo =  _gestor.obtenerTipo(pTipo);
		print(pValor, _gestor.interpretar_Texto(pValor + _Tipo));
	}
	
	public static void print(String pNum, String data) {
		System.out.println("Para el numero: "+ pNum + ", su interpretacion a"+_Tipo+" es: "+data);
	}
	
	public static void print(String data) {
		System.out.println(data);
	}

	
}
