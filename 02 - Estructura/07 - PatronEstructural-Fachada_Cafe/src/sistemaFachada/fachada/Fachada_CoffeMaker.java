/***************************************************************************
 * Clase: Fachada Coffee Maker.
 * Descripcion: esta clase permite ocultar la complejidad de la maquina de 
 * hacer cafe, al reducir las opciones que el usuario tiene para poder 
 * obtener su cafe. Intenamente hace los mismos llamados que al usuario
 * de la forma clasica le tocaria hacer. 
 ***************************************************************************/
package sistemaFachada.fachada;

import sistemaClasico.clases.maquina_cafe;
import sistemaClasico.objetos.Receta;
import sistemaClasico.objetos.Vasos;

public class Fachada_CoffeMaker {
	private maquina_cafe _SistemaClasico; 
	private Receta _Receta;
	
	public Fachada_CoffeMaker (){
		_SistemaClasico = new maquina_cafe();
		_Receta = new Receta();
	}
		
	public String mostrarMenu() {
		return ("Bienvenido, la maquina de café esta en linea \n"
				+ "\n Seleccione la bebida a preparar \n"
				+ "1. Cafe Negro \n"
				+ "2. Cafe con leche\n"
				+ "3. Cafe Expresso\n"
				+ "4. Capuchino\n"
				+ "5. Cancelar\n");
	}
	
	
	public String ejectuar_funcion(int pIdx) {
		switch (pIdx){
			case 1: 
				_Receta.Cafe_Negro();
				break;
			case 2: 
				return "Receta no disponible";
				//break;
			case 3: 
				return "Receta no disponible";
				//break;
			case 4: 
				return "Receta no disponible";
				//break;
			case 5: 
				return "Lo esperamos pronto";
			
			default: 
				return "No es una opcion valida";
		}
		
		return hacer_cafe (_Receta.getCantidad_Cafe(), 
						   _Receta.getCantidad_Agua(),
						   _Receta.getCantidad_Leche(),
						   _Receta.getNombre());
	}
	
	
	private String hacer_cafe(int cantCafe, int cantAgua, int cantLeche, String tipoCafe) {
		String mRecetaPreparada = "La receta del cafe, no pudo ser elaborada.";
		boolean mNecesitaLeche = false;
		
		if(_Receta.getCantidad_Leche() > 0) 
			mNecesitaLeche = true;
		
		if( _SistemaClasico.revisarStockVasos(Vasos.SMALL.getID()) 
				&& _SistemaClasico.revisarNivelAgua(Vasos.SMALL.getID(),_Receta.getCantidad_Agua()) 
				&& _SistemaClasico.revisarStockCafe(_Receta.getCantidad_Cafe()) 
				&& _SistemaClasico.revisarNivelLeche( _Receta.getCantidad_Leche())) {
			
			mRecetaPreparada = "LOG { \n";
			mRecetaPreparada += "      " + _SistemaClasico.colocarCafe(_Receta.getCantidad_Cafe());
			mRecetaPreparada += "      " + _SistemaClasico.colocarVaso(Vasos.SMALL.getID());
			mRecetaPreparada += "      " + _SistemaClasico.calentarAgua();
			if (mNecesitaLeche)
				mRecetaPreparada += "      " + _SistemaClasico.verterLeche( _Receta.getCantidad_Leche());
			mRecetaPreparada += "      " + _SistemaClasico.verterAgua(_Receta.getCantidad_Agua()) + "}\n";
			mRecetaPreparada += _SistemaClasico.servirCafe() + tipoCafe+"\n\n\n\n\n";		
			
		}
		
		return mRecetaPreparada;
	}
	
}
