/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class Ajouter_ticketsController implements Initializable {

    private JFXButton Deconnexion;
    Utilites utilites= new Utilites();
    @FXML
    private AnchorPane imageMedicaSud;
    @FXML
    private JFXButton consulterTicket;
    @FXML
    private JFXButton ConsulterMateriel1;
    @FXML
    private JFXButton NouveauTicket1;
    @FXML
    private JFXButton DemandeMateriel;
    @FXML
    private JFXButton EditerProfile1;
    
    @FXML
     private JFXButton Deconnexion1;
    @FXML
    private Hyperlink AutresPAnnes1;
    @FXML
    private JFXButton ValiderNouveauTicket1;
    @FXML
    private ImageView imgConsulterTicket;
    @FXML
    private ImageView ImgNouveauTicket;
    @FXML
    private ImageView ImgDemandeMateriel;
    @FXML
    private ImageView imgConsulterMateriel;
    @FXML
    private ImageView ImgEditerProfile;
    @FXML
    private ImageView ImageDeconnexion;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         utilites.backgroundImage(imageMedicaSud);
         Image img = new Image("Assets/icons8-voir-les-détails-50.png");
    	   imgConsulterTicket.setImage(img);
    	   
    	    img = new Image("Assets/icons8-poste-de-travail-64.png");
  	   imgConsulterMateriel.setImage(img);
  	   
  	   img = new Image("Assets/icons8-ajouter-32.png");
  	   ImgNouveauTicket.setImage(img);
  	   
  	   img = new Image("Assets/Demande.png");
  	   ImgDemandeMateriel.setImage(img);
  	   
  	   img = new Image("Assets/icons8-editer-le-fichier-80.png");
  	   ImgEditerProfile.setImage(img);
  	   
  	   img = new Image("Assets/icons8-connexion-filled-50.png");
  	   ImageDeconnexion.setImage(img);
      
    }    


    @FXML
    private void AutresPAnnesAction(ActionEvent event) {
    }

  
    @FXML
    private void ConsulterMaterielAction(ActionEvent event) throws IOException {
              utilites.newStage(Deconnexion1, "Consulter_matériel.fxml", " consulter matériels");

    }
    @FXML
    private void NouveauTicketAction(ActionEvent event) throws IOException { 
        utilites.newStage(Deconnexion1, "Ajouter_tickets.fxml"," nouveau ticket");
    }

    @FXML
    private void DeconnexionAction(ActionEvent event) throws IOException {
          utilites.newStage(Deconnexion1, "login.fxml", "login");
    }
    @FXML
    private void EditerProfileAction(ActionEvent event) throws IOException {
          utilites.newStageWithOldStage( "Editer_profil.fxml");
    }
    @FXML
    private void consulterTicketAction(ActionEvent event) throws IOException {
         utilites.newStage(Deconnexion1, "Consulter_ticket.fxml","consulter tickets");
    }
    @FXML
    private void DemandeMaterielAction(ActionEvent event) throws IOException {
            utilites.newStage(Deconnexion1, "Demande_materiel.fxml", "demande matériel");
    }
    
    @FXML
    private void ValiderNouveauTicketAction(ActionEvent event) throws IOException {
    }
    
}
