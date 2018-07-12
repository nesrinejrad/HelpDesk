/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.entities.EtatTicket;
import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.entities.StatutTicket;
import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.services.MaterielServicesRemote;
import tn.MedicaSud.services.PanneServicesRemote;
import tn.MedicaSud.services.TicketSerciesRemote;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    @FXML
    private JFXComboBox<String> materiel;
    @FXML
    private JFXComboBox<String> Panne;
    @FXML
    private JFXComboBox<String> statut;
    @FXML
    private JFXTextArea description;
    private TicketSerciesRemote ticketSerciesRemote;
    private MaterielServicesRemote materielServicesRemote;
    private PanneServicesRemote panneServiceRemote;
     ObservableList<String> dataMateriels=FXCollections.observableArrayList();
     ObservableList<String> dataPannes=FXCollections.observableArrayList();;
    private ObservableList<String> dataStatutTickets=FXCollections.observableArrayList();

	
	



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
  	   
  	 List<Materiel> materiels= Accueil_clientController.utilisateurConnecte.getMateriels();
  	 System.out.println(materiels.size());
  	 for (Materiel materiel1 : materiels) {
  		 System.out.println(materiel1.getReference());
		dataMateriels.add(materiel1.getReference());
  		 //dataMateriels.
	}
  	 materiel.setItems(dataMateriels);
  	 
  	 try {
		Context context= new InitialContext();
		PanneServicesRemote panneServicesRemote=(PanneServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/PanneServices!tn.MedicaSud.services.PanneServicesRemote");
		List<Panne> pannes= new ArrayList<Panne>();
		pannes=panneServicesRemote.findAll();
		System.out.println("panne size="+pannes.size());
		for (Panne panne1 : pannes) {
			
			dataPannes.add(panne1.getDescription());
			System.out.println(panne1.getDescription());

		}
		System.out.println("data size="+dataPannes.size());
		for (String panne : dataPannes) {
			System.out.println(panne.toString());
		}
		Panne.setItems(dataPannes);
	} catch (NamingException e) {
	
	}
  	 
  	 StatutTicket[] statusTickets=StatutTicket.values();
  	 for (StatutTicket statutTicket : statusTickets) {
		dataStatutTickets.add(String.valueOf(statutTicket));
		System.out.println(String.valueOf(statutTicket));
	}
  	
     statut.setItems(dataStatutTickets);
    }    


    @FXML
    private void AutresPAnnesAction(ActionEvent event) throws IOException {
    	Nouvelle_PannesController nouvelle_PannesController= new Nouvelle_PannesController();
    	nouvelle_PannesController.dim1= (int) Deconnexion1.getScene().getWindow().getWidth();
    	System.out.println("dim1lahne"+Deconnexion1.getScene().getWindow().getWidth());
    	System.out.println(nouvelle_PannesController.dim1);

    	nouvelle_PannesController.dim2= (int) Deconnexion1.getScene().getWindow().getHeight();
    	System.out.println("dim2lahne"+ Deconnexion1.getScene().getWindow().getHeight());
    	System.out.println(nouvelle_PannesController.dim2);
    	
    	utilites.newStageWithOldStage( "Nouvelle_Pannes.fxml");
    	
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
          Accueil_clientController.utilisateurConnecte=null;

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
    private void ValiderNouveauTicketAction(ActionEvent event) throws IOException, NamingException {
    	
    	Context context= new InitialContext();
    	ticketSerciesRemote=(TicketSerciesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/TicketSercies!tn.MedicaSud.services.TicketSerciesRemote");
    	Ticket ticket= new Ticket();
    	ticket.setDiscription(description.getText());
    	ticket.setStatutTicket(StatutTicket.valueOf(statut.getValue()));
    	String mat=materiel.getValue();
    	Integer i=0;
    	for (String string : dataMateriels) {
			if(string!=mat)			{
				i++;
			}
		}
    	List<Materiel> materiels= new ArrayList<Materiel>();
    	materiels= Accueil_clientController.utilisateurConnecte.getMateriels();
    	Materiel materiel=materiels.get(i);
    	ticket.setMateriel(materiel);
    	ticket.setTypeMateriel(materiel.getTypeMateriel());
    	ticket.setUtilisateur(Accueil_clientController.utilisateurConnecte);
    	ticket.setEtatTicket(EtatTicket.valueOf("nonTraité"));
    	Panne panne= new Panne();
    	panneServiceRemote=(PanneServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/PanneServices!tn.MedicaSud.services.PanneServicesRemote");
    	List<Panne> pannes= panneServiceRemote.findAll();
    	i=0;
    	mat=Panne.getValue();
    	for (String string : dataPannes) {
			if(mat!=string)
			{
				i++;
			}
		}
    	panne=pannes.get(i);
    	ticket.setPanne(panne);
    	ticketSerciesRemote.save(ticket);
    }
    
}
