package main;

import Objetos.*;
import patron.adaptado.MotorElectrico;
import patron.adaptador.MotorElectricoAdapter;

public class Gestor {
	private Motor[] aMotors = {null,null,null};
	private MotorElectrico gMotElec = null;
	
	String mostrarMenu() {
    	String sMenu = "\n";
    	sMenu +=  "\n 1) Crear un nuevo motor Comun.";
    	sMenu +=  "\n 2) Crear un nuevo motor Economico.";
    	sMenu +=  "\n 3) Crear un nuevo motor Electrico.";
    	sMenu +=  "\n 4) Crear un nuevo motor Electrico pero adaptado";
    	sMenu +=  "\n 5) Mostrar informacion de motores.";
    	
    	return sMenu +=  "\n 6) Salir";
    }
	
	public String procesarFuncion(int pOpcion) {
		String result = "";
		Motor mMotor=null;
		
		switch (pOpcion){
		case 1: 
			aMotors[0] = crearMotorComun(mMotor);
			break;
		case 2: 
			aMotors[1] = crearEconomico(mMotor);
			break;
		case 3: 
			crearMotorElectrico();
			break;
		case 4: 
			if(gMotElec!=null)
				aMotors[2] = AdaptarMotorElectrico(gMotElec);
			else
				result="No existe motor electrico";
			break;
		case 5: 
			for (Motor m : aMotors) {
				if (m != null)
					infoMotor(m);
			} 
			
			break;
		case 6: 
			result = "Gracias por usar el sistema";
			break;
		default: 
			result = "No es un valor de consulta valido";
			break;
	}
		return result;
	}
    
     public static void infoMotor(Motor pMotor) {
    	pMotor.encender();
    	pMotor.acelerar();
    	pMotor.apagar();
    	System.out.println("\n");
    }
     
	 private Motor crearMotorComun(Motor motor) {
        motor = new MotorComun();
        infoMotor (motor);
        return motor;
	}
	 private Motor crearEconomico(Motor motor) {
        motor = new MotorEconomico();
        infoMotor (motor);
        return motor;
	}

	 private void crearMotorElectrico() {
		gMotElec = new MotorElectrico() ;
		gMotElec.conectar();
		gMotElec.activar();
		gMotElec.moverMasRapido();
		gMotElec.detener();
		gMotElec.desconectar();
	}

	 private static Motor AdaptarMotorElectrico(MotorElectrico pMotor) {
		MotorElectricoAdapter mElecAdapt = new MotorElectricoAdapter(pMotor);
		infoMotor (mElecAdapt);
        return mElecAdapt;
	}

	public MotorElectrico getgMotElec() {
		return gMotElec;
	}

	public void setgMotElec(MotorElectrico gMotElec) {
		this.gMotElec = gMotElec;
	}
}
