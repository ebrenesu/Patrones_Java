package Singleton;

public class Configurador {
	/**
	 * Lo escencial es:
	 * - Instancia privada estatica.
	 * - Constructor privado
	 * - Funcion publica para obtener instancia. 
	 */
	
	private static Configurador miconfigurador = null;
	
	public static Configurador conectarse(String pUrl,String baseDatos) {
		if (miconfigurador == null) {
			if(pUrl.length()<1)
				pUrl = url;
			miconfigurador = new Configurador(pUrl,baseDatos);
		}
		return miconfigurador;
	}
	
	/**************************************************
	 * Constructor Privado
	 *************************************************/
	 private Configurador(String url,String baseDatos){
		 setUrl(url);
		 setBaseDatos(baseDatos);
	 }
	 

	// Funciones extra que no son 'base del patron'
	private static String url="www.Cenfotec.ac.cr";
	private String baseDatos;
	
	public static void desconectar() {
		miconfigurador=null;
	}
		
	 
	private void setUrl(String url) {
		this.url = url;
	}
		
	private void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	

	public String getUrl() {
		return url;
	}
	
	public String getBaseDatos() {
		return baseDatos;
	}
	
}
