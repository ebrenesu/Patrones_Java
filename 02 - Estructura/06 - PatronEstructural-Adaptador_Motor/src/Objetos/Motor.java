package Objetos;


/**
 * metodos comunes que son accedidos mediante herencia
 *
 */
public abstract class Motor {
	public String TipoMotor="";
	abstract public void encender();
	abstract public void acelerar();
	abstract public void apagar();
	
	public void Turbo() {
		System.out.println("Aplicando Turbo, esperar 5 segundos");
	}

}


