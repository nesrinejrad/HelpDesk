/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import com.jfoenix.controls.JFXButton;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hibernate.internal.util.xml.FilteringXMLEventReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.services.MaterielServicesRemote;
import tn.MedicaSud.services.UtilisateurServicesRemote;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class GestionMaterielsController implements Initializable {
	@FXML
    private AnchorPane imageMedicaSud;
	@FXML
    private TableColumn<Materiel, String> referenceMateriel;
    @FXML
    private TableColumn<Materiel, String> marqueMAteriel;
    @FXML
    private TableColumn<Materiel, LocalDate> DateAchatMAteriel;
    @FXML
    private TableColumn<Materiel, String>CodeMateriel;
    @FXML
    private TableColumn<Materiel, String> DureeGarantie;
    @FXML
    private TableColumn<Materiel, LocalDate> Fournisseur;
    @FXML
    private JFXButton Accueil;
    @FXML
    private JFXButton Ajouter;
    @FXML
    private JFXButton modifier;
    @FXML
    private JFXButton Supprimer;
    @FXML
    private JFXButton ListeUtilisateur;
    @FXML
    private JFXButton ListeIntervention;
    @FXML
    private JFXButton Deconnexion;
    Utilites utilies= new Utilites();
    static Utilisateur utilisateur= new Utilisateur();
    @FXML
    private TableView<Materiel> materiels;
    private ObservableList<Materiel> data;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	utilies.backgroundImage(imageMedicaSud);
    	List<Materiel> materiels= new ArrayList<Materiel>();
   	   try {
		utilies.context= new InitialContext();
		utilies.materielServicesRemote= (MaterielServicesRemote) utilies.context.lookup(utilies.materielRemote);
		materiels=utilies.materielServicesRemote.findAll();
		data=FXCollections.observableList(materiels);	
		referenceMateriel.setCellValueFactory(new PropertyValueFactory<>("reference"));
	   	  marqueMAteriel.setCellValueFactory(new PropertyValueFactory<>("marque"));
	   	  DateAchatMAteriel.setCellValueFactory(new PropertyValueFactory<>("date achat"));
	   	  DureeGarantie.setCellValueFactory(new PropertyValueFactory<>("dureeGarantie"));
	 	  Fournisseur.setCellValueFactory(new PropertyValueFactory<>("fournisseur"));
	 	  CodeMateriel.setCellValueFactory(new PropertyValueFactory<>("id"));
	   	  this.materiels.setItems(data);
   	   } catch (NamingException e) {
		
	}	
    }    

    @FXML
    private void AjouterAction(ActionEvent event) throws IOException {
    	utilies.newStageWithOldStage("AjouterMateriel.fxml");
    }

    @FXML
    private void modifierAction(ActionEvent event) throws IOException {
    	

    }

    @FXML
    private void supprimerAction(ActionEvent event) throws NamingException {
    	
    }

    @FXML
    private void ListeUtilisateurAction(ActionEvent event) throws IOException {
    	
    }

    @FXML
    private void ListeInterventionAction(ActionEvent event) {
    }

    @FXML
    private void AccueilAction(ActionEvent event) throws IOException {
    	utilies.newStage(Accueil, "AccueilAdmin.fxml", "Accueil");
    }

    @FXML
    private void DeconnexionAction(ActionEvent event) throws IOException {
    	utilies.newStage(Accueil, "login.fxml", "login");
    }
    
}