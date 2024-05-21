package base.concreta;
import Objetos.Mensaje;
import base.abstracta.Network;

public class Facebook extends Network {
    public Facebook(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }

    @Override
	public boolean publish(Mensaje message) {
		return sendData(message.getMensaje().getBytes());
	}
    
    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("\nRevisando Parametros");
        System.out.println("Usuario: " + this.getUserName());
        System.out.print("Password: ");
        for (int i = 0; i < this.getUserName().length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\nAutentificacion correcta para Facebook");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Mensaje: '" + new String(data) + "' fue posteado en Facebook");
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void logOut() {
        System.out.println("El usuario: '" + getUserName() + "' termino la sesion en Facebook");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 12) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
