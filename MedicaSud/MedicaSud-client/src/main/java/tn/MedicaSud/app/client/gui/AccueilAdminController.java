/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AccueilAdminController implements Initializable {

	@FXML
    private AnchorPane imageMedicaSud;
    @FXML
    private AnchorPane GestionUtilisateur;
    @FXML
    private ImageView ImgGestionUtilisateur;
    @FXML
    private AnchorPane GestionMateriel;
    @FXML
    private ImageView ImgGestionMateriel;
    @FXML
    private AnchorPane GestionDemande;
    @FXML
    private ImageView ImgGestionDemande;
    @FXML
    private AnchorPane GestionIntervention;
    @FXML
    private ImageView ImgGestionIntervention;
    @FXML
    private AnchorPane GestionPanne;
    @FXML
    private ImageView ImgGestionPanne;
    @FXML
    private AnchorPane CoonsulterStatistique;
    @FXML
    private ImageView ImgCoonsulterStatistique;
    @FXML
    private AnchorPane EditerProfil;
    @FXML
    private ImageView ImgEditerProfils;
    @FXML
    private AnchorPane CoonsulterNotification;
    @FXML
    private ImageView ImgCoonsulterNotification;
    @FXML
    private AnchorPane Deconnexion;
    @FXML
    private ImageView imgDeconnexion;
    Utilites utilities=new Utilites();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	utilities.backgroundImage(imageMedicaSud);
    	 Image img = new Image("Assets/icons8-lire-un-message-50.png");
    	   ImgCoonsulterNotification.setImage(img);
    	   
    	    img = new Image("Assets/icons8-groupe-d'utilisateurs-homme-homme-64.png");
  	   ImgGestionUtilisateur.setImage(img);
  	 
  	   img = new Image("Assets/icons8-paquet-50.png");
	   ImgGestionIntervention.setImage(img);
	   
	   img = new Image("Assets/materil.png");
	   ImgGestionMateriel.setImage(img);
	   
	   img = new Image("Assets/panne.png");
	   ImgGestionPanne.setImage(img);
	   
	   img = new Image("Assets/EDITER.png");
	   ImgEditerProfils.setImage(img);
	   
	   img = new Image("Assets/deconnexion.png");
	   imgDeconnexion.setImage(img);
	   
	   img = new Image("Assets/demande.png");
	   ImgGestionDemande.setImage(img);
	   
	   
    }    

    @FXML
    private void GestionUtilisateurAction(MouseEvent event) throws IOException {
    	utilities.newStageAdmin(CoonsulterNotification, "GestionUtilisateurs.fxml", "gestion utilisateurs");
    }

    @FXML
    private void GestionMaterielAction(MouseEvent event) throws IOException {
    	utilities.newStageAdmin(CoonsulterNotification,"GestionMateriels.fxml"	, "gestion du meteriel");
    }

    @FXML
    private void GestionDemandeAction(MouseEvent event) {
    }

    @FXML
    private void GestionInterventionAction(MouseEvent event) {
    }

    @FXML
    private void GestionPanneAction(MouseEvent event) throws IOException {
    	utilities.newStageAdmin(CoonsulterNotification, "GestionPannes.fxml", "gestion des pannes");
    }

    @FXML
    private void CoonsulterStatistiqueAction(MouseEvent event) {
    }

    @FXML
    private void EditerProfilAction(MouseEvent event) throws IOException {
        utilities.newStageWithOldStage("EditerMotDePasse.fxml");

    }

    @FXML
    private void CoonsulterNotificationAtion(MouseEvent event) {
    }

    @FXML
    private void DeconnexionAction(MouseEvent event) throws IOException {
utilities.newStageAdmin(CoonsulterNotification, "login.fxml", "login");
    }
    
}
