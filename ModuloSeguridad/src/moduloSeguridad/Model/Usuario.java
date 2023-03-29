package moduloSeguridad.Model;

public class Usuario {
	
	private String nombre;
	private String numeroDocumento;
	private String contraseña;
	private String correo;
	
	public Usuario(String nombre, String numeroDocumento, String contraseña, String correo) {
		super();
		this.nombre = nombre;
		this.numeroDocumento = numeroDocumento;
		this.contraseña = contraseña;
		this.correo = correo;
	}
	

	public Usuario(String contraseña, String correo) {
		super();
		this.contraseña = contraseña;
		this.correo = correo;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
