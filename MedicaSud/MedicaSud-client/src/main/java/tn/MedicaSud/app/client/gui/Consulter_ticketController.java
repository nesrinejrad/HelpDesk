/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.services.TicketSerciesRemote;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author USER
 */
public class Consulter_ticketController implements Initializable {

    @FXML
    private TableColumn<Ticket, String> materielTicket;
    @FXML
    private TableColumn<Ticket, Date> DateCreationTicket;
    @FXML
    private TableColumn<Ticket, String> ProblèpmeTicket;
    @FXML
    private TableColumn<Ticket, String> StatutTicket;
    @FXML
    private TableColumn<Ticket, String> DescriptionTicket;
    @FXML
    private TableColumn<Ticket, String> EtatTicket;
    @FXML
    private JFXToggleButton ETatTicketButton;
    @FXML
    private ImageView AjouterTicket;
    @FXML
    private ImageView SupprimerTicket;
    @FXML
    private JFXButton NouveauTicket;
    @FXML
    private JFXButton DemandeMateriel;
    @FXML
    private JFXButton Deconnexion;
    @FXML
    private JFXButton EditerProfile;
    @FXML
    private TableView<Ticket> tickets;

       Utilites utilites= new Utilites();
    @FXML
    private AnchorPane imageMedicaSud;
    @FXML
    private JFXButton consulterTicket;
    @FXML
    private JFXButton ConsulterMateriel;
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
    private ObservableList<Ticket> data;
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
       	   try {
			Context context= new InitialContext();
			TicketSerciesRemote ticketSerciesRemote=(TicketSerciesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/TicketSercies!tn.MedicaSud.services.TicketSerciesRemote");
			List<Ticket> tickets=ticketSerciesRemote.findAll();
			List<Ticket> ticketsFinal= new ArrayList<Ticket>();
			System.out.println(tickets.size());
			for (Ticket ticket : tickets) {
				System.out.println(ticket.getUtilisateur().getCode());
				System.out.println(Accueil_clientController.utilisateurConnecte.getCode());
				if(ticket.getUtilisateur().getCode()==Accueil_clientController.utilisateurConnecte.getCode())
				{
					ticketsFinal.add(ticket);
				}
			}
			data=FXCollections.observableList(ticketsFinal);
			System.out.println("enfin="+data.size());
				 materielTicket.setCellValueFactory(new PropertyValueFactory<>("materiel"));
			 	  DescriptionTicket.setCellValueFactory(new PropertyValueFactory<>("discription"));
			 	  DateCreationTicket.setCellValueFactory(new PropertyValueFactory<>("sateCreation"));
			 	  ProblèpmeTicket.setCellValueFactory(new PropertyValueFactory<>("panne"));
			 	  StatutTicket.setCellValueFactory(new PropertyValueFactory<>("statutTicket"));
			 	  EtatTicket.setCellValueFactory(new PropertyValueFactory<>("etatTicket"));
			 	 this.tickets.setItems(data);
		
			
		} catch (NamingException e) {
		}
       	   
       	   
       	   

    }    


    @FXML
    private void AjouterTicketAction(MouseEvent event) {
    }

    @FXML
    private void SupprimerTicketAction(MouseEvent event) {
    }


    @FXML
    private void NouveauTicketAction(ActionEvent event) throws IOException {
              utilites.newStage(Deconnexion, "Ajouter_tickets.fxml", "nouveau ticket");
    }

    @FXML

    private void DeconnexionAction(ActionEvent event) throws IOException {
          utilites.newStage(Deconnexion, "login.fxml","login");
          Accueil_clientController.utilisateurConnecte=null;

    }
    @FXML
    private void EditerProfileAction(ActionEvent event) throws IOException {
           utilites.newStageWithOldStage("Editer_profil.fxml");     
    }
    @FXML
    private void consulterTicketAction(ActionEvent event) throws IOException {
             utilites.newStage(Deconnexion, "Consulter_ticket.fxml"," consulter tickets");
}
    @FXML
    private void ConsulterMaterielAction(ActionEvent event) throws IOException {
           utilites.newStage(Deconnexion, "Consulter_matériel.fxml", "consulter matériels");
    }
    @FXML
    private void DemandeMaterielAction(ActionEvent event) throws IOException {
           utilites.newStage(Deconnexion, "Demande_materiel.fxml", " demande matériel");
    }
    @FXML
    private void ETatTicketAction(ActionEvent event) throws IOException {
           utilites.newStage(Deconnexion, "Demande_materiel.fxml", " demande matériel");
    }
    
}
