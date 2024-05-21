//TerminalExpression
package interprete.expresiones;

import interprete.interpreter.Contexto;

public class Hexadecimal implements Expresion{
	private int _numero;
	
	public Hexadecimal(int pNumero) {
		this.set_numero(pNumero);
	}
	
	@Override
	public String interpretar(Contexto pCont) {
		return pCont.getHexamdecima(get_numero());
	}

	public int get_numero() {
		return _numero;
	}

	public void set_numero(int _numero) {
		this._numero = _numero;
	}

}
