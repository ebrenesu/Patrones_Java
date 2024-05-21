package base.concreta;

import Objetos.Mensaje;
import base.abstracta.Network;
import excepciones.Excepcion_Personal;

public class Twitter extends Network {

    public Twitter(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }

    @Override
	public boolean publish(Mensaje message) throws Excepcion_Personal {
    	boolean result = false;
    	if(message.Get_Mensaje_Size()>0 && message.Get_Mensaje_Size()<121)
    		result = sendData(message.getMensaje().getBytes());
    	else
    		throw new Excepcion_Personal(3);
		return result;
	}
    
    public boolean logIn(String userName, String password) {
        System.out.println("\nRevisando parametros");
        System.out.println("Nombre: " + this.getUserName());
        System.out.print("Password: ");
        for (int i = 0; i < this.getPassword().length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nConeccion exitosa a Twitter");
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("El mensaje: '" + new String(data) + "' fue posteado en Twitter.");
            System.out.print("Este contiene '" + new String(data).length() + "' caracteres.");
            System.out.println("Se adjunta una imagen:" + "\n"+imprime_huella()+ "\n");
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("El usuario: '" + getUserName() + "' ha hecho una desconeccion exitosa de Twitter");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    private String imprime_huella() {
    	return "\n............PPPPPP$.......... \n"
    			+ ".....PPPP...PPP$$$PPP......... \n"
    			+ "...oPPPPP¢..$PP$$$$PP......... \n"
    			+ "..PPP$$PPo...PPPPPPPP1........ \n"
    			+ "..PPPPPPPo...7PP$oo¢7.PPPP7... \n"
    			+ "...P$$o77......7¢oo7.PPPPPPP.. \n"
    			+ ".........PPPP$......oP$$$$PPo. \n"
    			+ "....oPPPPPP$PPPP...7PPPP$$PP¢. \n"
    			+ "..oPPP$$$S$$$$PPP...PPPPPPP¢o. \n"
    			+ ".oPP$$$$$I$$$$$PPo...1777¢o... \n"
    			+ "..PPP$$$$$L$$$$$PP7........... \n"
    			+ "...PPPP$$$$V$$$$P$7..7PPPPPP1. \n"
    			+ ".....PPPP$$$A$$$PPo..PPPPPP$1. \n"
    			+ ".......PPPPPP$$PPo..PPPPP$¢o.. \n"
    			+ "................:..PPPPP. ";
    }


	
}
