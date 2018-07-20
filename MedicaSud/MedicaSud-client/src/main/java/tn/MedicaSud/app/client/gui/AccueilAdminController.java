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
    private void GestionPanneAction(MouseEvent event) {
    }

    @FXML
    private void CoonsulterStatistiqueAction(MouseEvent event) {
    }

    @FXML
    private void EditerProfilAction(MouseEvent event) {
    }

    @FXML
    private void CoonsulterNotificationAtion(MouseEvent event) {
    }

    @FXML
    private void DeconnexionAction(MouseEvent event) {
    }
    
}