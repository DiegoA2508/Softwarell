package moduloSeguridad.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import moduloSeguridad.Aplicacion;

public class RecuperarContraseņaController {

	private Aplicacion aplicacion=new Aplicacion();
	
	@FXML
	private TextField correoRecuperaciontxt;

	@FXML
	private Button enviarbtn;

	@FXML
	private Hyperlink registro;
	
	@FXML
    private Button volverbtn;
	
	public void initialize(){

	}

	@FXML
	void enviar(ActionEvent event) {

	}

	@FXML
	void registro(ActionEvent event) {

		aplicacion.mostrarVentanaRegistro();
		
	}
	
	@FXML
    void volver(ActionEvent event) {

		aplicacion.mostrarVentanaLogin();
		
    }

	public void setAplication(Aplicacion aplicacion) {
		// TODO Auto-generated method stub
		this.aplicacion = aplicacion;
	}

	
}
