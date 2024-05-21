package interprete.interpreter;

import interprete.expresiones.*;

public class ClienteInterprete {
	private Contexto _Contexto;
	
	public ClienteInterprete(Contexto pContexto) {
		set_Contexto(pContexto);
	}

	public Contexto get_Contexto() {
		return _Contexto;
	}

	public void set_Contexto(Contexto pContexto) {
		this._Contexto = pContexto;
	}

	public String interpretar(String pTexto) {
		Expresion exp = null;
		String[] arrText = pTexto.split(" ");
		int numero = Integer.parseInt(arrText[0]);
		if(arrText[1].equals("Hexadecimal"))
			exp = new Hexadecimal(numero);
		else
			exp = new Binario(numero);
		
		return exp.interpretar(get_Contexto());
	}
	
	public String opciones() {
		String mSms = "Opciones de Interpretación:\n";
		mSms += "[1] Numero a Hexadecimal.\n";
		mSms += "[2] Numero a Binario.\n";

		return mSms;
	}
	
	public String obtenerTipo(int pOc) {
		String sTipo = "";
		if(pOc <=0 || pOc >2) 
			pOc = (Math.random() <= 0.5) ? 1 : 2;
		
		switch (pOc) {
			case 1:
				sTipo = " Binario";
				break;
			case 2:
				sTipo= " Hexadecimal";
				break;
		}
		return sTipo;
	}
}
