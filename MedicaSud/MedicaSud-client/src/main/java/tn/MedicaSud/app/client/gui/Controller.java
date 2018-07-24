package tn.MedicaSud.app.client.gui;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller implements  Initializable {

    // Get the pane to put the calendar on
    @FXML Pane calendarPane;
    
        private ArrayList<AnchorPaneNode> allCalendarDays = new ArrayList<>(35);
        private LocalDate calendarDate;
    @FXML
    private BorderPane borderPane;
    @FXML
    private AnchorPane imageMedicaSud;
    @FXML
    private JFXButton Ajouter;
    @FXML
    private JFXButton modifier;
    @FXML
    private JFXButton Supprimer;
    @FXML
    private JFXButton ListeMateriel;
    @FXML
    private JFXButton ListeIntervention;
    @FXML
    private JFXButton Accueil;
    @FXML
    private JFXButton Deconnexion;
    Utilites utilities= new Utilites();

        @Override
    public void initialize(URL url, ResourceBundle rb) {
        	utilities.backgroundImage(imageMedicaSud);

        
         for (AnchorPaneNode ap : allCalendarDays) {
            if (ap.getChildren().size() != 0) {
                ap.getChildren().remove(0);
            }
            Text txt = new Text(String.valueOf(calendarDate.getDayOfMonth()));
            ap.setDate(calendarDate);
            String date2="2018-06-01";
            LocalDate ldate2= LocalDate.parse(date2);
            if(calendarDate==ldate2)
            {
                 System.out.println("hiii");
            }
            ap.setTopAnchor(txt, 5.0);
            ap.setLeftAnchor(txt, 5.0);
            ap.getChildren().add(txt);
            calendarDate = calendarDate.plusDays(1);
        }
        borderPane.setCenter(calendarPane);
        
    } 

    @FXML
    private void AjouterAction(ActionEvent event) {
    }

    @FXML
    private void modifierAction(ActionEvent event) {
    }

    @FXML
    private void supprimerAction(ActionEvent event) {
    }

    @FXML
    private void ListeMAterielAction(ActionEvent event) {
    }

    @FXML
    private void ListeInterventionAction(ActionEvent event) {
    }

    @FXML
    private void AccueilAction(ActionEvent event) {
    }

    @FXML
    private void DeconnexionAction(ActionEvent event) {
    }
    
}
