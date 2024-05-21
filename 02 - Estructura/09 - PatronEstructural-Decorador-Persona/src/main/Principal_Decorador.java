package main;

public class Principal_Decorador {
	static Gestor_decorador gestor;
	
	public static void main(String[] args) {
		gestor = new Gestor_decorador();
		
		printer("Creando los personajes.\n");
		gestor.nuevaPersona("Nery Brenes",1);
		gestor.nuevaPersona("Ines Melchor",2);
		
		printer(gestor.printPersona(0)+"\n");
		printer(gestor.printPersona(1)+"\n\n");
		
		printer("Decoramos los personajes.\n");
		gestor.decorarPersona(0, 1);
		gestor.decorarPersona(1, 2);
		
		
		printer(gestor.printPersona(0)+"\n");
		printer(gestor.printPersona(1)+"\n\n");
		
		printer("Decoramos los personajes por segunda vez.\n");
		gestor.decorarPersona(0, 3);
		gestor.decorarPersona(1, 3);
		
		printer(gestor.printPersona(0)+"\n");
		printer(gestor.printPersona(1)+"\n\n");
		
		
		printer("Quitamos la decoracion.\n");
		gestor.QuitarDecorarPersona(0);
		gestor.QuitarDecorarPersona(1);
		
		printer(gestor.printPersona(0)+"\n");
		printer(gestor.printPersona(1)+"\n\n");
		
		printer("Quitamos la decoracion.\n");
		gestor.QuitarDecorarPersona(0);
		gestor.QuitarDecorarPersona(1);
		
		printer(gestor.printPersona(0)+"\n");
		printer(gestor.printPersona(1)+"\n\n");
	}
	
	public static void printer(String pData) {
		System.out.println(pData);
	}
}
