package interprete.interpreter;

public class Contexto {
	public String getBinario(int pNum) {
		return Integer.toBinaryString(pNum);
	}
	
	public String getHexamdecima(int pNum) {
		return Integer.toHexString(pNum);
	}
}

//Aca vamos a tener lo que queremos interpretar
