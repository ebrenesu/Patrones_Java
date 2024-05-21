package sistemaClasico.principal;

import static java.lang.System.out;

import java.util.Scanner;

import sistemaClasico.clases.maquina_cafe;
import sistemaClasico.objetos.Receta;

public class Main_sin_Fachada {
	private static Scanner sc = new Scanner(System.in);
	private static maquina_cafe omc = new maquina_cafe();
	private static Receta ogr= new Receta();
	
	/**
	 *  Este main tiene que tener una coneccion directa al objeto Maquina de cafe.
	 *  Debe imprimir el MenuCafe primero y luego el Menu de revisión. 
	 *  Si todo se cumple hacer el café.
	 */
	public static void main(String[] args) {
		int op1 =0, op2 = 0;
		
		do{
			out.println(Menu_Cafe());	
			op1 = sc.nextInt();		
			
			if(op1 > 0 && op1 < 5) {
				do{
					out.println(Menu_Revision());	
					op2 = sc.nextInt();		
				
					out.println("\n"+ejectuar_funcion(op2,op1));
					
				} while(op2 != 0);
			}
		} while(op1 != 5);	
		out.println("\nMuchas gracias, lo esperamos pronto");

	}
	
	public static String ejectuar_funcion(int pIdx, int pIDc) {
		String sResult = "";
		switch (pIdx){
			case 1: //preparar receta
				
				switch (pIDc){
					case 1: 
						ogr.Cafe_Negro();
						break;
					case 2: 
						//ogr.Cafe con leche;
						break;
					case 3: 
						//ogr.Cafe_Expresso();
						break;
					case 4: 
						//ogr.Cafe_Capuchino();
						break;
						
				}
				sResult = "La receta seleccionada es para "+ogr.getNombre();
				break;
				
			case 2: //Revisar cantidad de cafe
				if (omc.revisarStockCafe(ogr.getCantidad_Cafe()))
					sResult = "Si hay cafe suficiente";
				else
					sResult = "No hay cafe suficiente";
				break;
				
			case 3: //Revisar cantidad de agua
				if ( omc.revisarNivelAgua(1, ogr.getCantidad_Agua()) )
					sResult = "Si hay agua suficiente";
				else
					sResult = "No hay agua suficiente";
				break;
				
			case 4: //Revisar cantidad de leche
				if (omc.revisarNivelLeche(ogr.getCantidad_Leche()))
					sResult = "Si hay leche suficiente";
				else
					sResult = "No hay leche suficiente";
				break;
				
			case 5: //Revisar cantidad de vasos
				if ( omc.revisarStockVasos(1) )
					sResult = "Si hay vaso ";
				else
					sResult = "No hay vaso ";
				break;
			case 6: // preparar la receta
				sResult = sResult + omc.colocarCafe(ogr.getCantidad_Cafe());
				sResult = sResult + omc.calentarAgua();
				sResult = sResult + omc.calentarLeche();
				break;
			case 7: // preparar el café
				sResult = sResult + omc.colocarVaso(1);
				sResult = sResult + omc.verterAgua(ogr.getCantidad_Agua());
				sResult = sResult + omc.verterLeche(ogr.getCantidad_Leche());
				sResult = sResult + omc.servirCafe();
				break;
				
			default: 
				sResult =  "No es una opcion valida";
		}
		
		return sResult;
	}
	
	public static String Menu_Cafe() {
		return ("\n Seleccione la bebida a preparar \n"
				+ "1. Cafe Negro \n"
				+ "2. Cafe con leche\n"
				+ "3. Cafe Expresso\n"
				+ "4. Capuchino\n"
				+ "5. Cancelar\n");
	}
	public static String Menu_Revision() {
		return ("\n Paso 2. Validaciones (recuerde apuntar sus respuestas para proceder al último paso) \n"
				+ "1. Generar Receta\n"
				+ "2. Revisar Cantidad de café\n"
				+ "3. Revisar Cantidad de agua\n"
				+ "4. Revisar Cantidad de leche\n"
				+ "5. Revisar Cantidad de vasos\n"
				+ "6. Preparar Receta\n"
				+ "7. Hacer el café\n"
				+ "0. Cancelar\n");
	}

}
