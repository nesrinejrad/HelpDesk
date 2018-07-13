/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.services.UtilisateurServicesRemote;

import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class Editer_profilController implements Initializable {

    @FXML
    private JFXButton VAliderNouveauMotDePasse;
    Utilites utilites= new Utilites();
    @FXML
    private JFXPasswordField mdp1;
    @FXML
    private JFXPasswordField mdp2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	System.out.println("essai2="+Accueil_clientController.utilisateurConnecte.getEmail());
        // TODO
    }    

    @FXML
    private void VAliderNouveauMotDePasseAction(ActionEvent event) throws NamingException {
    	System.out.println("mdp1="+mdp1.getText());
    	System.out.println("mdp2="+mdp2.getText());
    	String msg="";
    	if (mdp1.getText()==null) {
    		msg="mot de passe vide!";
    	    utilites.GenererAlerte(msg);
    	}

    	else if (mdp2.getText().equals(null)) {
    		msg=" mot de passe vide!!";
    	    utilites.GenererAlerte(msg);
    	}
    	else if(mdp1.getText().equals(mdp2.getText()))
    	{
    	    Accueil_clientController.utilisateurConnecte.setPassword(mdp1.getText());
    	      utilites.closeStage(VAliderNouveauMotDePasse);
    	      utilites.context=new InitialContext();
    	      utilites.utilisateurServicesRemote=(UtilisateurServicesRemote) utilites.context.lookup(utilites.utilRemote);
    	      utilites.utilisateurServicesRemote.update(Accueil_clientController.utilisateurConnecte);
    	}
    	else
    	{	
    		msg=" mot de passes non identiques!!";
    	    utilites.GenererAlerte(msg);}
       
    }
    
}
