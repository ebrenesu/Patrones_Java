package Objetos;

public class Usuario {
	private String User;
	private String Pass;
	
	public Usuario(String user, String pass) {
		setUser( user);
		setPass( pass);
	}
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
}
