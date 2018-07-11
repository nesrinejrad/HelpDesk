/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.entities.TypeMateriel;
import tn.MedicaSud.services.PanneServicesRemote;

import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class Nouvelle_PannesController implements Initializable {

    @FXML
    private JFXButton ValiderNouvellePanne;
    Utilites utilites= new Utilites();
    @FXML
    private JFXComboBox<String> Type;
    @FXML
    private JFXTextField description;
    private ObservableList<String> dateTypeMateriel=FXCollections.observableArrayList();
    private PanneServicesRemote panneServiceRemote;
    static int dim1;
    static int dim2;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TypeMateriel[] typeMateriels=TypeMateriel.values();
        for (TypeMateriel typeMateriel : typeMateriels) {
        	dateTypeMateriel.add(String.valueOf(typeMateriel));
			System.out.println(String.valueOf(typeMateriel));
		}
        Type.setItems(dateTypeMateriel);
        System.out.println("dim1="+dim1);
        System.out.println("dim2="+dim2);

    }    

    @FXML
    private void ValiderNouvellePanneAction(ActionEvent event) throws NamingException, IOException {
       Context context= new InitialContext();
		 panneServiceRemote=(PanneServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/PanneServices!tn.MedicaSud.services.PanneServicesRemote");
		 Panne panne= new Panne();
		 panne.setTypeMateriel(TypeMateriel.valueOf(Type.getValue()));
		 panne.setDescription(description.getText());
		 panneServiceRemote.save(panne);
	     utilites.closeStage(ValiderNouvellePanne);
	     FXMLLoader loader= new FXMLLoader(getClass().getResource("Ajouter_tickets.fxml"));
	     Stage primaryStage= new Stage();
	        Parent root = loader.load();                           
	        Scene scene= new Scene(root);     
	        primaryStage.setHeight(dim2);
	        primaryStage.setWidth(dim1);
	        primaryStage.setTitle("Ajout ticket");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	     
    }
}
