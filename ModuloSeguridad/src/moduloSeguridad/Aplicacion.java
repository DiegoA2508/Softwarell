package moduloSeguridad;

import moduloSeguridad.Controller.LoginController;
import moduloSeguridad.Controller.RecuperarContraseņaController;
import moduloSeguridad.Controller.RegistroController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.mail.*;

public class Aplicacion extends Application{

	private Stage primaryStage=new Stage();
	private AnchorPane anchorPane;
	LoginController logControl;
	
	public  void start(Stage primaryStage) throws Exception {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Constructora CAMU");
//		this.primaryStage.set

		mostrarVentanaLogin();


	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void mostrarVentanaLogin() {
		try {
			primaryStage.close();
			FXMLLoader loader1 = new FXMLLoader(Aplicacion.class.getResource("view/loginSoftware.fxml"));
			AnchorPane anchorPane2=loader1.load();
			Scene scene2= new Scene(anchorPane2);
			LoginController loginController = loader1.getController();
			loginController.setAplication(this);

			primaryStage.setScene(scene2);
			primaryStage.show();

			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarVentanaRegistro() {
		try {
			primaryStage.close();
			FXMLLoader loader1 = new FXMLLoader(Aplicacion.class.getResource("view/Registro.fxml"));
			AnchorPane anchorPane2=loader1.load();
			Scene scene2= new Scene(anchorPane2);
			RegistroController registroController = loader1.getController();
			registroController.setAplication(this);

			primaryStage.setScene(scene2);
			primaryStage.show();

			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarVentanaRecuperarContraseņa() {
		try {
			primaryStage.close();
			FXMLLoader loader1 = new FXMLLoader(Aplicacion.class.getResource("view/recuperarContraseņa.fxml"));
			AnchorPane anchorPane2=loader1.load();
			Scene scene2= new Scene(anchorPane2);
			RecuperarContraseņaController reContraseņaController = loader1.getController();
			reContraseņaController.setAplication(this);

			primaryStage.setScene(scene2);
			primaryStage.show();

			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
