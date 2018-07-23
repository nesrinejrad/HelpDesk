/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.entities.Role;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.services.UtilisateurServicesRemote;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton Login;
    Utilites utilites= new Utilites();
    @FXML
    private ImageView imgLogin;
    @FXML
    private Label errorText;
    @FXML
    JFXTextField loginText;
    @FXML
    JFXPasswordField pwdText;
    
    private UtilisateurServicesRemote utilisateurServiceRemote;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	Image img= new Image("Assets/MSI-Group.jpg") ;
    	imgLogin.setImage(img);
    }    
    @FXML
      private void GoAcceuil(ActionEvent event) throws IOException, NamingException  {
    	
    	 Accueil_clientController accueil_clientController= new Accueil_clientController();
         Utilisateur utilisateur= new Utilisateur();
         utilisateur=null;
         Utilites.context= new InitialContext();
		 Utilites.utilisateurServicesRemote= (UtilisateurServicesRemote) Utilites.context.lookup(Utilites.utilRemote);
	     if ((utilisateur=Utilites.utilisateurServicesRemote.login(loginText.getText(), pwdText.getText()))!=null)
	     {System.out.println(loginText.getText());
	     if(utilisateur.getRole()==(Role.valueOf("Administrateur")))
	      utilites.newStage(Login, "AccueilAdmin.fxml","accueil");
	     else
		  utilites.newStage(Login, "Accueil_client.fxml","accueil");
		  Accueil_clientController.utilisateurConnecte=utilisateur;		        	
		  }
		  else
		   {     
		   Alert alert = new Alert(AlertType.WARNING);
	       alert.setTitle("error in input data");
	       alert.setHeaderText("mail ou mot de passe non valide");
	       ButtonType buttonTypeCancel = new ButtonType("non", ButtonData.CANCEL_CLOSE);     
	       alert.getButtonTypes().setAll(buttonTypeCancel);   
	       Optional<ButtonType> result = alert.showAndWait();  
		   }		
    }
    
}
