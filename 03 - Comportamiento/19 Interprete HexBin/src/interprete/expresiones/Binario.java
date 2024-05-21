package interprete.expresiones;

import interprete.interpreter.Contexto;

public class Binario implements Expresion {
	private int _numero;
	
	public Binario(int pNumero) {
		this.set_numero(pNumero);
	}
	

	public int get_numero() {
		return _numero;
	}

	public void set_numero(int _numero) {
		this._numero = _numero;
	}

	@Override
	public String interpretar(Contexto pCont) {
		return pCont.getBinario(get_numero());
	}


}
