package principal;

public class Mensaje {
	private String para;
    private String contenido;
    
	public Mensaje(String para, String contenido) {
		this.para = para;
		this.contenido = contenido;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
    
}
