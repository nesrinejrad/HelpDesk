/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class Accueil_clientController implements Initializable {

    @FXML
    private AnchorPane imageMedicaSud;
    @FXML
    private JFXButton consulterTicket;
    @FXML
    private JFXButton ConsulterMateriel;
    @FXML
    private JFXButton NouveauTicket;
    @FXML
    private JFXButton DemandeMateriel;
    @FXML
    private JFXButton EditerProfile;
    @FXML
    private JFXButton Deconnexion;
     Utilites utilites= new Utilites();
    @FXML
    private ImageView imgConsulterTicket;
    @FXML
    private ImageView ImgNouveauTicket;
    @FXML
    private ImageView imgConsulterMateriel;
    @FXML
    private ImageView ImgEditerProfile;
    @FXML
    private ImageView ImageDeconnexion;
    @FXML
    private ImageView ImgDemandeMateriel;
    @FXML
    private TableColumn<?, ?> referenceMateriel;
    @FXML
    private TableColumn<?, ?> marqueMAteriel;
    @FXML
    private TableColumn<?, ?> DateAchatMAteriel;

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
	   ImgDemandeMateriel.setImage(img);;
	   
	   img = new Image("Assets/icons8-editer-le-fichier-80.png");
	   ImgEditerProfile.setImage(img);
	   
	   img = new Image("Assets/icons8-connexion-filled-50.png");
	   ImageDeconnexion.setImage(img);
    }    

    @FXML
    private void ConsulterMaterielAction(ActionEvent event) throws IOException {
            utilites.newStage(Deconnexion, "Consulter_matériel.fxml", "consulter matéreiels");
    }
    @FXML
    private void NouveauTicketAction(ActionEvent event) throws IOException {
            utilites.newStage(Deconnexion, "Ajouter_tickets.fxml","nouveau ticket");
    }
    @FXML
    private void DemandeMaterielAction(ActionEvent event) throws IOException {
                utilites.newStage(Deconnexion, "Demande_materiel.fxml","demander matériel");

    }
    @FXML
    private void DeconnexionAction(ActionEvent event) throws IOException {
                  utilites.newStage(Deconnexion, "login.fxml", "login");

    }
    @FXML
    private void EditerProfleAction(ActionEvent event) throws IOException {
              utilites.newStageWithOldStage("Editer_profil.fxml");

    }
    @FXML
    private void consulterTicketAction(ActionEvent event) throws IOException {
         utilites.newStage(Deconnexion, "Consulter_ticket.fxml","consulter tickets");
    }
    @FXML
    private void EditerProfileAction(ActionEvent event) throws IOException {
         utilites.newStageWithOldStage("Editer_profil.fxml");

        
    }

 
    
}
