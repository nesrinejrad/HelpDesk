/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import tn.MedicaSud.entities.Intervention;
import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.services.InterventionServicesRemote;
import tn.MedicaSud.services.MaterielServicesRemote;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AjouterInterventionMaterielController implements Initializable {

    @FXML
    private Label idLabel;
    @FXML
    private Label labelPeriode;
    @FXML
    private JFXTextField IdentifiantIntervention;
    @FXML
    private JFXTextField DescriptionIntervention;
    @FXML
    private DatePicker DateIntervention;
    @FXML
    private JFXTextField PeriodeIntervention;
    @FXML
    private JFXButton Enregistrer;
    @FXML
    private Hyperlink externe;
    @FXML
    private Label labelEtat;
    @FXML
    private JFXComboBox<?> etatIntervention;
    @FXML
    private Label labelMateriel;
    @FXML
    private JFXTextField MaterielIntervention;
    Utilites utilities= new Utilites();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       etatIntervention.setVisible(false);
       labelEtat.setVisible(false);
    }    

    @FXML
    private void EnregistrerIntervetnion(ActionEvent event) throws NamingException    {
    	utilities.context= new InitialContext();
    	utilities.materielServicesRemote= (MaterielServicesRemote) utilities.context.lookup(utilities.materielRemote);
    	Materiel materiel=new Materiel();
    	materiel=null;
    			materiel=utilities.materielServicesRemote.find(MaterielIntervention.getText());
    	if(materiel!=null)
    	{Intervention intervention= new Intervention();
    	intervention.setId(IdentifiantIntervention.getText());
    	intervention.setDateIntervention(DateIntervention.getValue());
    	intervention.setDescription(DescriptionIntervention.getText());
    	intervention.setMateriel(materiel);
    	intervention.setPeriode(Integer.valueOf(PeriodeIntervention.getText()));
    	utilities.interventionServicesRemote=(InterventionServicesRemote) utilities.context.lookup(utilities.interventionRemote);
    	utilities.interventionServicesRemote.update(intervention);
    	utilities.closeStage(Enregistrer);
    	utilities.GenerertAletrtOk("intervention enregistrée avec succés");
    	}
    	else
    		
    	{    		utilities.GenererAlerte("materiem n'existe pas");

    	}
    	
    }
    
}