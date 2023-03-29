package moduloSeguridad.Controller;

import moduloSeguridad.Aplicacion;
import moduloSeguridad.Model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RegistroController {
	
	private Aplicacion aplicacion=new Aplicacion();
	
	ObservableList<String> tipoDocumento = FXCollections.observableArrayList();
	
	Usuario usuario = new Usuario("sebastian.sabogalg@uqvirtual.edu.co","1234");
	
	
	
	@FXML
    private TextField correotxt;

    @FXML
    private TextField numeroCCtxt;

    @FXML
    private TextField nombretxt;

    @FXML
    private ComboBox<String> tipoDocumentoCB=new ComboBox<String>();
   

    @FXML
    private PasswordField contrase�atxt;

    @FXML
    private Button registrarbtn;
    
    @FXML
    private Button volverbtn;

    public void initialize(){
    	
    	tipoDocumento.add("Cedula Ciudadania");
    	tipoDocumento.add("Cedula Extranjera");
    	
    	tipoDocumentoCB.setItems(tipoDocumento);

    }
    



    @FXML
    void registro(ActionEvent event) {

    }
    
    @FXML
    void volver(ActionEvent event) {

		aplicacion.mostrarVentanaLogin();
		
    }

    @FXML
    void enviar(ActionEvent event) {
    	
    	enviarCorreoRecuperacion();

    }
    
 
	public void setAplication(Aplicacion aplicacion) {
		// TODO Auto-generated method stub
		this.aplicacion =aplicacion;
	}

	private String generarContrasenaAleatoria() {
		// Implementa aqu� la l�gica para generar una nueva contrase�a aleatoria
		return "nueva-contrasena";
	}
	
	public void enviarCorreoRecuperacion() {
		// Generar nueva contrase�a aleatoria
		String nuevaContrasena = generarContrasenaAleatoria();
		
		// Actualizar contrase�a del usuario en la base de datos
		usuario.setContrase�a(nuevaContrasena);
		actualizarContrasenaEnBaseDeDatos(usuario);
		
		// Enviar correo electr�nico de recuperaci�n de contrase�a
		enviarCorreoRecuperacion(usuario.getCorreo(), nuevaContrasena);
	}

	private void actualizarContrasenaEnBaseDeDatos(Usuario usuario) {
		// Implementa aqu� la l�gica para actualizar la contrase�a del usuario en la base de datos
	}

	private void enviarCorreoRecuperacion(String correoElectronico, String nuevaContrasena) {
		final String username = "diegoalejandrocordobamo@gmail.com";
		final String password = "DiegoAlex25";
		String recipient = correoElectronico;
		String subject = "Recuperaci�n de contrase�a";
		
		// Configuraci�n del servidor SMTP de Gmail
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		// Creaci�n de la sesi�n SMTP
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		try {
			// Creaci�n del mensaje
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText("Tu nueva contrase�a es: " + nuevaContrasena);
			
			// Env�o del mensaje
			Transport.send(message);
			
			System.out.println("El mensaje ha sido enviado.");
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}


