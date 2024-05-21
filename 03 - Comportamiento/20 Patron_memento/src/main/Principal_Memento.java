package main;

public class Principal_Memento {
	static Gestor_Memento _Gestor;
	 public static void main(String[] args){
		 _Gestor =  new Gestor_Memento();
		 
		 Print(_Gestor.nuevaPersona(1, "Pedro", "Gil Mena", 2000));
		 NombrePersona();
		 Print( "---------------------------------------------\n");
		 Print("\n"+_Gestor.actualizarPersona("Pedro", "Fernandez"));
		 Print( "---------------------------------------------\n");
		 Print(_Gestor.actualizarPersona("Lucia", "Fernandez", 1990));
		 NombrePersona();
		 
		 Print( "\nEsto pasa si restauramos el memento:\n");
		 _Gestor.Restaurar_Memento();
		 NombrePersona();
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 Print( "\n=============================================================\n");
		 Print( "\nHagamos mas actualizaciones:\n");
		 Print(_Gestor.actualizarPersonaConMemento("John", "Travolta"));
		 
		 Print( "---------------------------------------------\n");
		 Print(_Gestor.actualizarPersona("Carlo", "Magno", 1987));
		 Print(_Gestor.actualizarPersona("Dereck", "Rojas", 1990));
		 Print(_Gestor.actualizarPersona("Franklin", "Castro", 1980));
		 Print(_Gestor.actualizarPersona("Jocselin", "Aguilar", 2000));
		 
		 Print( "\n=============================================================\nInformacion del objeto actualmente:\n");
		 NombrePersona();
		 Print( "\n=============================================================\n");
		 
		 Print( "\nEsto pasa si restauramos el memento: [2da vez]\n");
		 _Gestor.Restaurar_Memento();
		 NombrePersona();
	        
	 }
	 
	 
	 private static void Print( String pText) {
		 System.out.println(pText);
	 }
	 
	 private static void NombrePersona() {
		 Print("Nombre completo: [" + _Gestor.Obtener_Nombre() + " " + _Gestor.Obtener_Apellidos() + "] con "+ _Gestor.Obtener_Edad() + " de edad.");
	 }
}


/******************************************************
*TAREA:
* - Hacer el programa con interaccion.
* - Tener mas de una persona
* - Agregar un arreglo de Mementos por persona. 
*******************************************************/