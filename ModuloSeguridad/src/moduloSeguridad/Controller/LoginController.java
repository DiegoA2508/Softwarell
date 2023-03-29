package moduloSeguridad.Controller;

import moduloSeguridad.Aplicacion;
import moduloSeguridad.Model.Administrador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	private Aplicacion aplicacion=new Aplicacion();
	private Administrador admin = new Administrador();
	
	@FXML
	private Hyperlink contraseñaPerdida;
	@FXML
	private TextField usuariotxt;
	@FXML
	private PasswordField contraseñatxt;
	@FXML
	private Button iniciarSesionbtn;
	@FXML
	private Hyperlink registro;
	
	public void initialize(){
		
	}
	
	
	@FXML
	void iniciarSesion(ActionEvent event) {

	}

	@FXML
	void recuperarContraseña(ActionEvent event) {

		aplicacion.mostrarVentanaRecuperarContraseña();
		
	}

	@FXML
	void registro(ActionEvent event) {

		aplicacion.mostrarVentanaRegistro();
		
	}


	public void setAplication(Aplicacion aplicacion) {
		
		this.aplicacion = aplicacion;
		
	}

}



