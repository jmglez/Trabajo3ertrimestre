package Trabajo;


public class CrearUsuario  extends Usuario {
	private int idUsuario;
	private String Usuario;
	private String Contrase�a;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContrase�a() {
		return Contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}
	@Override
	public String toString() {
		return "CrearUsuario [idUsuario=" + idUsuario + ", Usuario=" + Usuario + ", Contrase�a=" + Contrase�a + "]";
	}
	public CrearUsuario() {
			
	}
	public CrearUsuario(int idUsuario, String usuario, String contrase�a) {
		super();
		this.idUsuario = idUsuario;
		Usuario = usuario;
		Contrase�a = contrase�a;
	}
	public static void crearusuario() {
		
	}
	
	
}
