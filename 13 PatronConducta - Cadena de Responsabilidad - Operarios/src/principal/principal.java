package principal;


public class principal{
	public static void main(String[] args) {
		Gestor_Chain gc= new Gestor_Chain();
		System.out.println("1. Creamos los colaboradores y agregamos la linea de mando");
		gc.IniciarProceso();
		
		//Primera Linea
		System.out.println("2. Creamos la primera linea de mensajes");
		gc.AgregarMensaje("Operario", "Hacer Deposito");
        gc.AgregarMensaje("Supervisor", "Revisar datos del cliente");
        gc.AgregarMensaje("Gerente", "Aprobar dias de vacaciones y aumento");
        
        //Segunda Linea
        System.out.println("3. Creamos la segunda linea de mensajes");
        gc.AgregarMensaje("Supervisor", "Aprobar operacion");
        gc.AgregarMensaje("Operario", "Consultar Monto en cuenta");
        gc.AgregarMensaje("Gerente", "Girar Permiso Especial");
        
        System.out.println("4. Creamos la Tercera linea de mensajes");
        gc.AgregarMensaje("Gerente", "Saltar");
        gc.AgregarMensaje("Operario", "Saltar");
        gc.AgregarMensaje("Supervisor", "Saltar");
        
        
        System.out.println("5. Creamos la Cuarta linea de mensajes");
        gc.AgregarMensaje("Cristopher", "Tiene un churro gratis!");
		
        //Ejecutamos las ordenes
        System.out.println("6. Ejecutamos las ordenes\n");
        gc.Ejecutar_Mensaje();
	}

	
}