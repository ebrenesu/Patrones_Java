package cuadro_de_texto.objetos;

import java.util.ArrayList;

public class text_box {
	private String texto="";
	
	public text_box() {
		setTexto("-->");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		if (texto == null)
			this.texto = texto + "\n";
		else
			this.texto += texto + "\n";
		
	}
	


}
