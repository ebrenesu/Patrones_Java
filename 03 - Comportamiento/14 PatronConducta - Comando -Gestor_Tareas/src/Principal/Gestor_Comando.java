package Principal;

import base.Producto;
import patron_Comando.Comando_Abstracto.TareaProducto;
import patron_Comando.Comando_Concreto.*;
import patron_Comando.Comandos;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Gestor_Comando {
	private ArrayList<Producto> _Productos;
	private int _ValorConeccion = 1;

	public  Gestor_Comando(){
		_Productos = new ArrayList<Producto>();
		crear_Productos();
	}

	private void crear_Productos(){
		//Los precios estan en dolares.
		_Productos.add( new Producto(1,"Logo ",100, "Digital"));
		_Productos.add( new Producto(2,"Camisa ",10, "Fisica"));
		_Productos.add( new Producto(3,"Pagina Web ",300, "Digital"));
		_Productos.add( new Producto(4,"Cancion ",25, "Digital"));
		_Productos.add( new Producto(5,"Celular ",700, "Fisica"));
		_Productos.add( new Producto(6,"Tableta ",400, "Fisica"));
	}

	private void ejecutar_Tarea (TareaProducto pTarea, Producto p) {
		pTarea.ejecutar(p);
	}

	private void agregar_Tarea_Manejador (ManejadorTarea pManejador, Comandos pOpcion){
		switch (pOpcion){
			case ENVIO_CORREO:
				pManejador.addTarea(new TareaEnvioCorreo());
				break;

			case VALIDAR:
				pManejador.addTarea(new ValidarProducto());
				break;

			case IMPRIMIR:
				pManejador.addTarea(new TareaImprimirProducto());
				break;

			case PUBLICAR_REDES:
				pManejador.addTarea(new PublicarRedes(_ValorConeccion));
				break;

			case EXHIBIR:
				pManejador.addTarea(new Exibir());
				break;
		}
	}

	public String iniciar_Proceso() throws InterruptedException {
		String Message = "Iniciando proceso.\nCreando productos y tareas.";
		TareaProducto manejadorTareaTotal = new ManejadorTarea();
		TareaProducto manejadorTareaDigital = new ManejadorTarea();
		TareaProducto manejadorTareaFisica = new ManejadorTarea();

		Message += "\nAgregamos los comandos al manejador de tarea especifico.";
		Message += "\n1] Manejador Total.";
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaTotal,Comandos.ENVIO_CORREO);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaTotal,Comandos.EXHIBIR);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaTotal,Comandos.IMPRIMIR);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaTotal,Comandos.PUBLICAR_REDES);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaTotal,Comandos.VALIDAR);

		Message += "\n2] Manejador Fisico.";
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaFisica,Comandos.ENVIO_CORREO);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaFisica,Comandos.EXHIBIR);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaFisica,Comandos.VALIDAR);

		Message += "\n3] Manejador Digital.";
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaDigital,Comandos.ENVIO_CORREO);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaDigital,Comandos.IMPRIMIR);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaDigital,Comandos.PUBLICAR_REDES);
		this.agregar_Tarea_Manejador((ManejadorTarea) manejadorTareaDigital,Comandos.VALIDAR);

		Message += "\nRecorremos el arreglo de productos y los ejecutamos en los manejadores.\n";

		System.out.println(Message);
		TimeUnit.SECONDS.sleep(5);

		for (int i=0; i<3;i++){
			switch (i){
				case 0:
					System.out.println("-------------------------------------------");
					System.out.println("Manejador de tarea total:");
					System.out.println("-------------------------------------------");
					for (Producto productoLocal : _Productos) {
						ejecutar_Tarea(manejadorTareaTotal, productoLocal);
						System.out.println("//\n");
					}
						
					break;

				case 1:
					System.out.println("-------------------------------------------");
					System.out.println("Manejador de tarea fisica: ");
					System.out.println("-------------------------------------------");
					for (Producto productoLocal : _Productos) {
						ejecutar_Tarea(manejadorTareaFisica, productoLocal);
						System.out.println("//\n");
					}


				case 2:
					System.out.println("-------------------------------------------");
					System.out.println("Manejador de tarea digital:");
					System.out.println("-------------------------------------------");
					for (Producto productoLocal : _Productos) {
						ejecutar_Tarea(manejadorTareaDigital, productoLocal);
						System.out.println("//\n");
					}
			}
		}

		return Message;
	}
}
